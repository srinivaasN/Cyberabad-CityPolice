package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalDutyMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CriminalDutyMasterDao extends AbstractDataAccessObject {


            public boolean insertCriminalDuty(CriminalDutyMasterForm criminalDutyMasterForm) {
/*  19*/        Connection con = null;
/*  20*/        boolean flag = false;
/*  23*/        try {
/*  23*/            int n = getSequenceID("criminaldutymaster", "criminaldutyid");
/*  24*/            con = new DBConnection().getConnection();
/*  25*/            PreparedStatement ps = con.prepareStatement("insert into criminaldutymaster values(?,?,?,?,?,?)");
/*  26*/            ps.setInt(1, n);
/*  27*/            ps.setString(2, criminalDutyMasterForm.getCriminalname());
/*  28*/            ps.setString(3, DateWrapper.parseDate(criminalDutyMasterForm.getDayOfDuty()));
/*  29*/            ps.setString(4, criminalDutyMasterForm.getFormTime());
/*  30*/            ps.setString(5, criminalDutyMasterForm.getToTime());
/*  31*/            ps.setString(6, criminalDutyMasterForm.getPlaceOfDuty());
/*  32*/            int i = ps.executeUpdate();
/*  33*/            if (i > 0) {
/*  34*/                flag = true;
                    }
                }
/*  37*/        catch (Exception e) {
/*  39*/            e.printStackTrace();
                }
/*  43*/        try {
/*  43*/            con.close();
                }
/*  45*/        catch (Exception e) {
/*  47*/            //LoggerManager.writeLogInfo(e);
	                        e.printStackTrace();
                }
/*  50*/        return flag;
            }

            public CoreList ViewCriminalDuty() {
/*  57*/        CoreList v = new CoreList();
/*  58*/        Connection con = null;
/*  59*/        CriminalDutyMasterForm criminalDutyMasterForm = null;
/*  62*/        try {
/*  62*/            con = new DBConnection().getConnection();
/*  63*/            Statement st = con.createStatement();
/*  65*/            for (ResultSet rs = st.executeQuery("select * from criminaldutymaster"); rs.next(); v.add(criminalDutyMasterForm)) {
/*  67*/                criminalDutyMasterForm = new CriminalDutyMasterForm();
/*  68*/                criminalDutyMasterForm.setCriminalDutyId(rs.getInt(1));
/*  69*/                criminalDutyMasterForm.setCriminalname(rs.getString(2));
/*  70*/                criminalDutyMasterForm.setDayOfDuty(rs.getString(3));
/*  71*/                criminalDutyMasterForm.setFormTime(rs.getString(4));
/*  72*/                criminalDutyMasterForm.setToTime(rs.getString(5));
/*  73*/                criminalDutyMasterForm.setPlaceOfDuty(rs.getString(6));
                    }

                }
/*  78*/        catch (Exception e) {
/*  80*/            e.printStackTrace();
                }
/*  84*/        try {
/*  84*/            con.close();
                }
/*  86*/        catch (Exception e) {
/*  88*/            //LoggerManager.writeLogInfo(e);
	                  e.printStackTrace();
                }
/*  91*/        return v;
            }

            public CriminalDutyMasterForm ViewCriminalDutyById(String storepath, int criminalDutyId) {
/*  98*/        CriminalDutyMasterForm criminalDutyMasterForm = null;
/*  99*/        Connection con = null;
/* 102*/        try {
/* 102*/            con = new DBConnection().getConnection();
/* 103*/            PreparedStatement ps = con.prepareStatement("select * from EmployeMaster where EmployeId = ? ");
/* 104*/            ps.setInt(1, criminalDutyId);
/* 105*/            ResultSet rs = ps.executeQuery();
/* 106*/            if (rs.next()) {
/* 108*/                criminalDutyMasterForm = new CriminalDutyMasterForm();
/* 109*/                criminalDutyMasterForm.setCriminalDutyId(criminalDutyId);
/* 110*/                criminalDutyMasterForm.setDayOfDuty(rs.getString(2));
/* 111*/                criminalDutyMasterForm.setFormTime(DateWrapper.parseDate(rs.getDate(3)));
/* 112*/                criminalDutyMasterForm.setToTime(DateWrapper.parseDate(rs.getDate(4)));
/* 113*/                criminalDutyMasterForm.setPlaceOfDuty(rs.getString(5));
                    }
                }
/* 117*/        catch (Exception e) {
/* 119*/            e.printStackTrace();
                }
/* 123*/        try {
/* 123*/            con.close();
                }
/* 125*/        catch (Exception e) {
	                  e.printStackTrace();
/* 127*/           // LoggerManager.writeLogInfo(e);
                }
/* 130*/        return criminalDutyMasterForm;
            }

            public boolean deleteCriminalDuty(int criminalDutyId) {
/* 137*/        Connection con = null;
/* 138*/        boolean flag = false;
/* 141*/        try {
/* 141*/            con = new DBConnection().getConnection();
/* 142*/            PreparedStatement ps = con.prepareStatement("delete from criminaldutymaster where criminaldutyid = ? ");
/* 143*/            ps.setInt(1, criminalDutyId);
/* 144*/            int i = ps.executeUpdate();
/* 145*/            if (i > 0) {
/* 146*/                flag = true;
                    }
                }
/* 149*/        catch (Exception e) {
/* 151*/            e.printStackTrace();
                }
/* 155*/        try {
/* 155*/            con.close();
                }
/* 157*/        catch (Exception e) {
	                  e.printStackTrace();
/* 159*/           // LoggerManager.writeLogInfo(e);
                }
/* 162*/        return flag;
            }

            public boolean UpdateCriminalDuty(CriminalDutyMasterForm criminalDutyMasterForm) {
/* 169*/        Connection con = null;
/* 170*/        boolean flag = false;
/* 173*/        try {
/* 173*/            con = new DBConnection().getConnection();
/* 174*/            PreparedStatement ps = con.prepareStatement("update criminaldutymaster set dayofduty = ?,fromtime = ?, totime = ?,placeofduty = ? where criminaldutyid = ? ");
/* 175*/            ps.setInt(1, criminalDutyMasterForm.getCriminalDutyId());
/* 176*/            ps.setString(2, criminalDutyMasterForm.getDayOfDuty());
/* 177*/            ps.setString(3, DateWrapper.parseDate(criminalDutyMasterForm.getFormTime()));
/* 178*/            ps.setString(4, DateWrapper.parseDate(criminalDutyMasterForm.getToTime()));
/* 179*/            ps.setString(5, criminalDutyMasterForm.getPlaceOfDuty());
/* 180*/            int i = ps.executeUpdate();
/* 181*/            if (i > 0) {
/* 182*/                flag = true;
                    }
                }
/* 185*/        catch (Exception e) {
/* 187*/            e.printStackTrace();
                }
/* 191*/        try {
/* 191*/            con.close();
                }
/* 193*/        catch (Exception e) {
	               e.printStackTrace();
/* 195*/            //LoggerManager.writeLogInfo(e);
                }
/* 198*/        return flag;
            }
}

