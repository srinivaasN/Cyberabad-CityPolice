
package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.EmployeDutyMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpoyeesDutyMasterDao extends AbstractDataAccessObject {


            public boolean insertEmployeeDuty(EmployeDutyMasterForm employeDutyMasterForm) {
/*  19*/        Connection con = null;
/*  20*/        boolean flag = false;
/*  23*/        try {
/*  23*/            int n = getSequenceID("EmployeeDutyMaster", "Employeedutyid");
/*  24*/            con = new DBConnection().getConnection();
/*  25*/            PreparedStatement ps = con.prepareStatement("insert into EmployeeDutyMaster values(?,?,?,?,?,?)");
/*  26*/            ps.setInt(1, n);
/*  27*/            ps.setString(2, DateWrapper.parseDate(employeDutyMasterForm.getDayOfDuty()));
/*  28*/            ps.setString(3, employeDutyMasterForm.getFromTime());
/*  29*/            ps.setString(4, employeDutyMasterForm.getToTime());
/*  30*/            ps.setString(5, employeDutyMasterForm.getPlaceOfDuty());
/*  31*/            ps.setString(6, employeDutyMasterForm.getEmployeename());
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
	e.printStackTrace();
/*  47*/           // LoggerManager.writeLogInfo(e);
                }
/*  50*/        return flag;
            }

            public CoreList ViewEmployeesDuties() {
/*  57*/        CoreList v = new CoreList();
/*  58*/        Connection con = null;
/*  59*/        EmployeDutyMasterForm employeDutyMasterForm = null;
/*  62*/        try {
/*  62*/            con = new DBConnection().getConnection();
/*  63*/            Statement st = con.createStatement();
/*  64*/            for (ResultSet rs = st.executeQuery("select * from EmployeeDutyMaster"); rs.next(); v.add(employeDutyMasterForm)) {
/*  66*/                employeDutyMasterForm = new EmployeDutyMasterForm();
/*  67*/                employeDutyMasterForm.setEmployeDutyId(rs.getInt(1));
/*  68*/                employeDutyMasterForm.setDayOfDuty(DateWrapper.parseDate(rs.getDate(2)));
/*  69*/                employeDutyMasterForm.setFromTime(rs.getString(3));
/*  70*/                employeDutyMasterForm.setToTime(rs.getString(4));
/*  71*/                employeDutyMasterForm.setPlaceOfDuty(rs.getString(5));
/*  72*/                employeDutyMasterForm.setEmployeename(rs.getString(6));
                    }

                }
/*  77*/        catch (Exception e) {
/*  79*/            e.printStackTrace();
                }
/*  83*/        try {
/*  83*/            con.close();
                }
/*  85*/        catch (Exception e) {
	e.printStackTrace();
/*  87*/            //LoggerManager.writeLogInfo(e);
                }
/*  90*/        return v;
            }

            public EmployeDutyMasterForm ViewEmployeesDuty(int empDutyId) {
/*  97*/        EmployeDutyMasterForm employeDutyMasterForm = null;
/*  98*/        Connection con = null;
/* 101*/        try {
/* 101*/            con = new DBConnection().getConnection();
/* 102*/            PreparedStatement ps = con.prepareStatement("select * from EMPLOYEDUTYMASTER where EMPLOYEDUTYID = ? ");
/* 103*/            ps.setInt(1, empDutyId);
/* 104*/            ResultSet rs = ps.executeQuery();
/* 105*/            if (rs.next()) {
/* 107*/                employeDutyMasterForm = new EmployeDutyMasterForm();
/* 108*/                employeDutyMasterForm.setEmployeDutyId(rs.getInt(1));
/* 109*/                employeDutyMasterForm.setDayOfDuty(DateWrapper.parseDate(rs.getDate(2)));
/* 110*/                employeDutyMasterForm.setFromTime(DateWrapper.parseDate(rs.getDate(3)));
/* 111*/                employeDutyMasterForm.setToTime(DateWrapper.parseDate(rs.getDate(4)));
/* 112*/                employeDutyMasterForm.setPlaceOfDuty(rs.getString(5));
                    }
                }
/* 116*/        catch (Exception e) {
/* 118*/            e.printStackTrace();
                }
/* 122*/        try {
/* 122*/            con.close();
                }
/* 124*/        catch (Exception e) {
	e.printStackTrace();
/* 126*/           // LoggerManager.writeLogInfo(e);
                }
/* 129*/        return employeDutyMasterForm;
            }

            public boolean deleteEmployeeDuty(int empDutyId) {
/* 136*/        Connection con = null;
/* 137*/        boolean flag = false;
/* 140*/        try {
/* 140*/            con = new DBConnection().getConnection();
/* 141*/            PreparedStatement ps = con.prepareStatement("delete from EMPLOYEDUTYMASTER where EMPLOYEDUTYID = ? ");
/* 142*/            ps.setInt(1, empDutyId);
/* 143*/            int i = ps.executeUpdate();
/* 144*/            if (i > 0) {
/* 145*/                flag = true;
                    }
                }
/* 148*/        catch (Exception e) {
/* 150*/            e.printStackTrace();
                }
/* 154*/        try {
/* 154*/            con.close();
                }
/* 156*/        catch (Exception e) {
	e.printStackTrace();
/* 158*/            //LoggerManager.writeLogInfo(e);
                }
/* 162*/        return flag;
            }

            public boolean UpdateEmployeeDuty(EmployeDutyMasterForm employeDutyMasterForm) {
/* 169*/        Connection con = null;
/* 170*/        boolean flag = false;
/* 173*/        try {
/* 173*/            con = new DBConnection().getConnection();
/* 174*/            PreparedStatement ps = con.prepareStatement("update EMPLOYEDUTYMASTER set DAYOFDUTY = ?,FROMTIME = ?,TOTIME = ?,PLACEOFDUTY = ? where EMPLOYEDUTYID = ? ");
/* 175*/            ps.setString(1, employeDutyMasterForm.getDayOfDuty());
/* 176*/            ps.setString(2, employeDutyMasterForm.getFromTime());
/* 177*/            ps.setString(3, employeDutyMasterForm.getToTime());
/* 178*/            ps.setString(4, employeDutyMasterForm.getPlaceOfDuty());
/* 179*/            ps.setInt(5, employeDutyMasterForm.getEmployeDutyId());
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
/* 195*/           // LoggerManager.writeLogInfo(e);
                }
/* 198*/        return flag;
            }
}
