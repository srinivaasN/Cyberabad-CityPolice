package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class CriminalMasterDao extends AbstractDataAccessObject {

	public boolean insertCriminalMaster(CriminalMasterForm cmform) {
		Connection con = null;
		boolean flag = false;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("insert into CriminalMaster values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, cmform.getCriminalFristName());
			ps.setString(2, DateWrapper.parseDate(cmform.getDob()));
			ps.setString(3, DateWrapper.parseDate(new Date()));
			String filepath = "c:/image/" + cmform.getCriminalPhoto();
			System.out.println("file name " + filepath);
			File afile = new File(filepath);
			FileInputStream fs = new FileInputStream(afile);
			System.out.println();
			ps.setBinaryStream(4, fs, (int) afile.length());
			ps.setString(5, cmform.getCrimeNo());
			ps.setString(6, cmform.getConvictionNo());
			ps.setString(7, cmform.getCourtName());
			ps.setString(8, cmform.getCourtPlace());
			ps.setString(9, cmform.getLawyerName());
			ps.setString(10, cmform.getCrimeperiod());
			ps.setString(11, cmform.getLoginname());
			ps.setString(12, DateWrapper.parseDate(cmform.getExpectedRelDate()));
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
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return flag;
	}

	public CoreList ViewCriminalMaster(String storepath) {
		CoreList v = new CoreList();
		Connection con = null;
		CriminalMasterForm cmform = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = new DBConnection().getConnection();
			Statement st = con.createStatement();
			/*
			 * for (ResultSet rs =
			 * st.executeQuery("select * from CriminalMaster"); rs.next();
			 * v.add(cmform))
			 */
			ps = con.prepareStatement("select * from CriminalMaster");
			rs = ps.executeQuery();
			while (rs.next()) {
				cmform = new CriminalMasterForm();
				cmform.setCriminalFristName(rs.getString(1));
				cmform.setDob(DateWrapper.parseDate(rs.getDate(2)));
				cmform.setDor(DateWrapper.parseDate(rs.getDate(3)));
				cmform.setCriminalPhoto(rs.getBlob(4));
				cmform.setCrimeNo(rs.getString(5));
				cmform.setConvictionNo(rs.getString(6));
				cmform.setCourtName(rs.getString(7));
				cmform.setCourtPlace(rs.getString(8));
				cmform.setLawyerName(rs.getString(9));
				cmform.setCrimeperiod(rs.getString(10));
				cmform.setLoginname(rs.getString(11));
				cmform.setExpectedRelDate(DateWrapper.parseDate(rs.getDate(12)));
				v.add(cmform);
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
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return v;
	}

	public CriminalMasterForm ViewCriminalMasterById(String storepath,
			String Criminalname) {
		CriminalMasterForm cmform = new CriminalMasterForm();
		Connection con = null;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("select * from CriminalMaster where CriminalName = ? ");
			ps.setString(1, Criminalname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cmform = new CriminalMasterForm();
				cmform.setCriminalFristName(rs.getString(1));
				cmform.setDob(DateWrapper.parseDate(rs.getDate(2)));
				cmform.setDor(DateWrapper.parseDate(rs.getDate(3)));
				cmform.setCriminalPhoto(rs.getBlob(4));
				// Blob b=rs.getBlob(4);

				cmform.setCrimeNo(rs.getString(5));
				cmform.setConvictionNo(rs.getString(6));
				cmform.setCourtName(rs.getString(7));
				cmform.setCourtPlace(rs.getString(8));
				cmform.setLawyerName(rs.getString(9));
				cmform.setCrimeperiod(rs.getString(10));
				cmform.setLoginname(rs.getString(11));
				cmform.setExpectedRelDate(DateWrapper.parseDate(rs.getDate(12)));
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
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return cmform;
	}

	public boolean deleteCriminalMaster(int CriminalId) {
		Connection con = null;
		boolean flag = false;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("delete from CriminalMaster where CriminalId = ? ");
			ps.setInt(1, CriminalId);
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
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return flag;
	}

	public boolean UpdateCriminalMaster(CriminalMasterForm cmform, String file) {
		Connection con = null;
		boolean flag = false;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement ps = con
					.prepareStatement("update CriminalMaster set CRIMENO = ?,ConvictimNo = ?,COURTNAME = ?,COURTPLACE = ?,Laywername= ?,CrimePeriod = ?,ExpectedReleaseDate = ? where CriminalName = ? ");
			ps.setString(1, cmform.getCrimeNo());
			ps.setString(2, cmform.getConvictionNo());
			ps.setString(3, cmform.getCourtName());
			ps.setString(4, cmform.getCourtPlace());
			ps.setString(5, cmform.getLawyerName());
			ps.setString(6, cmform.getCrimeperiod());
			ps.setString(7, DateWrapper.parseDate(cmform.getExpectedRelDate()));
			ps.setString(8, cmform.getCriminalFristName());
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
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			// LoggerManager.writeLogInfo(e);
		}
		return flag;
	}

	public CoreList getCriminalNames() {
		CoreList acoreList = new CoreList();
		CriminalMasterForm aform = null;
		Connection con = null;
		try {
			con = new DBConnection().getConnection();
			PreparedStatement pst = con
					.prepareStatement("select CriminalName from criminalmaster");
			for (ResultSet rs = pst.executeQuery(); rs.next(); acoreList
					.add(aform)) {
				aform = new CriminalMasterForm();
				aform.setCriminalFristName(rs.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return acoreList;
	}
}
