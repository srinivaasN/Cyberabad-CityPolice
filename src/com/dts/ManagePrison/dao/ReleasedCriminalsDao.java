package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.ReleasedCriminalsForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReleasedCriminalsDao extends AbstractDataAccessObject {

	public boolean insertReleasedCriminals(ReleasedCriminalsForm ccform) {
		Connection con = null;
		boolean flag = false;
		con = new DBConnection().getConnection();
		try {
			int n = getSequenceID("ReleaseCriminals", "Releaseid");

			PreparedStatement ps = con
					.prepareStatement("insert into ReleaseCriminals values(?,?,?,?,?,?,?)");
			ps.setInt(1, n);
			ps.setString(2, DateWrapper.parseDate(ccform.getReleaseDateTime()));
			ps.setString(3, ccform.getCriminalname());
			ps.setString(4, ccform.getReasonForRelease());
			ps.setString(5, ccform.getAnyConditions());
			ps.setString(6, ccform.getEmployeename());
			ps.setString(7, ccform.getRemarks());
			int i = ps.executeUpdate();
			if (i > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return flag;
	}

	public CoreList ViewReleasedCriminals() {
		CoreList v = new CoreList();
		Connection con = null;
		ReleasedCriminalsForm ccform = null;
		try {
			con = new DBConnection().getConnection();
			Statement st = con.createStatement();
			for (ResultSet rs = st
					.executeQuery("select * from ReleaseCriminals"); rs.next(); v
					.add(ccform)) {
				ccform = new ReleasedCriminalsForm();
				ccform.setReleaseId(rs.getInt(1));
				ccform.setReleaseDateTime(DateWrapper.parseDate(rs.getDate(2)));
				ccform.setCriminalname(rs.getString(3));
				ccform.setReasonForRelease(rs.getString(4));
				ccform.setAnyConditions(rs.getString(5));
				ccform.setEmployeename(rs.getString(6));
				ccform.setRemarks(rs.getString(7));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return v;
	}

	public ReleasedCriminalsForm ViewReleasedCriminalsByName(int releaseid) {
		ReleasedCriminalsForm ccform = null;
		Connection con = null;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("select * from ReleaseCriminals where Releaseid = ? ");
			ps.setInt(1, releaseid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ccform = new ReleasedCriminalsForm();
				ccform.setReleaseId(rs.getInt(1));
				ccform.setReleaseDateTime(DateWrapper.parseDate(rs.getDate(2)));
				ccform.setCriminalname(rs.getString(3));
				ccform.setReasonForRelease(rs.getString(4));
				ccform.setAnyConditions(rs.getString(5));
				ccform.setEmployeename(rs.getString(6));
				ccform.setRemarks(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return ccform;
	}

	public boolean deleteReleasedCriminals(int ReleaseId) {
		Connection con = null;
		boolean flag = false;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("delete from ReleaseCriminals where ReleaseId = ? ");
			ps.setInt(1, ReleaseId);
			int i = ps.executeUpdate();
			if (i > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return flag;
	}

	public boolean UpdateReleasedCriminals(ReleasedCriminalsForm ccform) {
		Connection con = null;
		boolean flag = false;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("update ReleaseCriminals set ReleaseDate = ?,CriminalName = ?,ReasonForRelease = ?,AnyOfGoApplicable = ?,REMARKS = ? where ReleaseId = ? ");
			ps.setString(1, DateWrapper.parseDate(ccform.getReleaseDateTime()));
			ps.setString(2, ccform.getCriminalname());
			ps.setString(3, ccform.getReasonForRelease());
			ps.setString(4, ccform.getAnyConditions());
			ps.setString(5, ccform.getRemarks());
			ps.setInt(6, ccform.getReleaseId());
			int i = ps.executeUpdate();
			if (i > 0) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return flag;
	}
}
