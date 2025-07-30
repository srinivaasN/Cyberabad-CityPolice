package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalCourtMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CriminalCourtMasterDao extends AbstractDataAccessObject {


            public boolean insertCriminalCourtMaster(CriminalCourtMasterForm dmform) {
/*  19*/        Connection con = null;
/*  20*/        boolean flag = false;
/*  23*/        try {
/*  23*/            con = new DBConnection().getConnection();
/*  24*/            PreparedStatement ps = con.prepareStatement("insert into CriminalCourtMaster values(?,?,?,?,?)");
/*  25*/            ps.setString(1, dmform.getCourtName());
/*  26*/            ps.setString(2, DateWrapper.parseDate(dmform.getHearingDate()));
/*  27*/            ps.setString(3, dmform.getCrimnalname());
/*  28*/            ps.setString(4, dmform.getEmployeename());
/*  29*/            ps.setString(5, DateWrapper.parseDate(dmform.getNextHearingDate()));
/*  30*/            int i = ps.executeUpdate();
/*  31*/            if (i > 0) {
/*  32*/                flag = true;
                    }
                }
/*  35*/        catch (Exception e) {
/*  37*/            e.printStackTrace();
                }
/*  41*/        try {
/*  41*/            con.close();
                }
/*  43*/        catch (Exception e) {
/*  45*/            //LoggerManager.writeLogInfo(e);
	                    e.printStackTrace();
                }
/*  48*/        return flag;
            }

            public CoreList ViewCriminalCourtMaster() {
/*  55*/        CoreList v = new CoreList();
/*  56*/        Connection con = null;
/*  57*/        CriminalCourtMasterForm dmform = null;
/*  60*/        try {
/*  60*/            con = new DBConnection().getConnection();
/*  61*/            Statement st = con.createStatement();
/*  63*/            for (ResultSet rs = st.executeQuery("select * from CriminalCourtMASTER"); rs.next(); v.add(dmform)) {
/*  65*/                dmform = new CriminalCourtMasterForm();
/*  66*/                dmform.setCourtName(rs.getString(1));
/*  67*/                dmform.setHearingDate(DateWrapper.parseDate(rs.getDate(2)));
/*  68*/                dmform.setCrimnalname(rs.getString(3));
/*  69*/                dmform.setEmployeename(rs.getString(4));
/*  70*/                dmform.setNextHearingDate(DateWrapper.parseDate(rs.getDate(5)));
                    }

                }
/*  75*/        catch (Exception e) {
/*  77*/            e.printStackTrace();
                }
/*  81*/        try {
/*  81*/            con.close();
                }
/*  83*/        catch (Exception e) {
/*  85*/            //LoggerManager.writeLogInfo(e);
	                e.printStackTrace();
                }
/*  88*/        return v;
            }

            public CriminalCourtMasterForm ViewCriminalCourtMasterById(int CriminalCourtId) {
/*  95*/        CriminalCourtMasterForm dmform = new CriminalCourtMasterForm();
/*  96*/        Connection con = null;
/*  99*/        try {
/*  99*/           con = new DBConnection().getConnection();
/* 100*/            PreparedStatement ps = con.prepareStatement("select * from CriminalCourtMASTER where CourtId = ? ");
/* 101*/            ps.setInt(1, CriminalCourtId);
/* 102*/            ResultSet rs = ps.executeQuery();
/* 103*/            if (rs.next()) {
/* 105*/                dmform = new CriminalCourtMasterForm();
/* 106*/                dmform.setCourtId(rs.getInt(1));
/* 107*/                dmform.setHearingDate(DateWrapper.parseDate(rs.getDate(2)));
/* 108*/                dmform.setCourtName(rs.getString(3));
/* 109*/                dmform.setCriminalId(rs.getInt(4));
/* 110*/                dmform.setEmployeId(rs.getInt(5));
/* 111*/                dmform.setNextHearingDate(DateWrapper.parseDate(rs.getString(6)));
                    }
                }
/* 115*/        catch (Exception e) {
/* 117*/            e.printStackTrace();
                }
/* 121*/        try {
/* 121*/            con.close();
                }
/* 123*/        catch (Exception e) {
	            e.printStackTrace();
/* 125*/            //LoggerManager.writeLogInfo(e);
                }
/* 128*/        return dmform;
            }

            public boolean deleteCriminalCourtMaster(int CriminalCourtId) {
/* 135*/        Connection con = null;
/* 136*/        boolean flag = false;
/* 139*/        try {
/* 139*/            con = new DBConnection().getConnection();
/* 140*/            PreparedStatement ps = con.prepareStatement("delete from CriminalCourtMASTER where CourtId = ? ");
/* 141*/            ps.setInt(1, CriminalCourtId);
/* 142*/            int i = ps.executeUpdate();
/* 143*/            if (i > 0) {
/* 144*/                flag = true;
                    }
                }
/* 147*/        catch (Exception e) {
/* 149*/            e.printStackTrace();
                }
/* 153*/        try {
/* 153*/            con.close();
                }
/* 155*/        catch (Exception e) {
	               e.printStackTrace();
/* 157*/            //LoggerManager.writeLogInfo(e);
                }
/* 160*/        return flag;
            }

            public boolean UpdateCriminalCourtMaster(CriminalCourtMasterForm dmform) {
/* 167*/        Connection con = null;
/* 168*/        boolean flag = false;
/* 171*/        try {
/* 171*/           con = new DBConnection().getConnection();
/* 172*/            PreparedStatement ps = con.prepareStatement("update CriminalCourtMASTER set HEARINGDATE = ?,COURTNAME = ?,CRIMINALID = ?,EMPLOYEID = ?,NEXTHEARINGDATE = ? where CourtId = ? ");
/* 173*/            ps.setInt(6, dmform.getCourtId());
/* 174*/            ps.setString(1, DateWrapper.parseDate(dmform.getHearingDate()));
/* 175*/            ps.setString(2, dmform.getCourtName());
/* 176*/            ps.setInt(3, dmform.getCriminalId());
/* 177*/            ps.setInt(4, dmform.getEmployeId());
/* 178*/            ps.setString(5, DateWrapper.parseDate(dmform.getNextHearingDate()));
/* 179*/            int i = ps.executeUpdate();
/* 180*/            if (i > 0) {
/* 181*/                flag = true;
                    }
                }
/* 184*/        catch (Exception e) {
/* 186*/            e.printStackTrace();
                }
/* 190*/        try {
/* 190*/            con.close();
                }
/* 192*/        catch (Exception e) {
	               e.printStackTrace();
/* 194*/            //LoggerManager.writeLogInfo(e);
                }
/* 197*/        return flag;
            }
}

