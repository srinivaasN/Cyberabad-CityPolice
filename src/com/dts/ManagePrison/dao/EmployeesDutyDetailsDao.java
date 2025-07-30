package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.EmployeDutyDetailsForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeesDutyDetailsDao extends AbstractDataAccessObject {


            public boolean insertEmployeeDutyDetails(EmployeDutyDetailsForm employeDutyDetailsForm) {
/*  17*/        Connection con = null;
/*  18*/        boolean flag = false;
/*  21*/        try {
/*  21*/            con = new DBConnection().getConnection();
/*  22*/            PreparedStatement ps = con.prepareStatement("insert into EmployeeDutyDetails values(?,?,?)");
/*  23*/            ps.setString(1, employeDutyDetailsForm.getEmployeename());
/*  24*/            ps.setInt(2, employeDutyDetailsForm.getEmployeDutyId());
/*  25*/            ps.setString(3, employeDutyDetailsForm.getRemarks());
/*  26*/            int i = ps.executeUpdate();
/*  27*/            if (i > 0) {
/*  28*/                flag = true;
                    }
                }
/*  30*/        catch (Exception e) {
/*  32*/            e.printStackTrace();
                }
/*  36*/        try {
/*  36*/            con.close();
                }
/*  38*/        catch (Exception e) {
	e.printStackTrace();
/*  40*/           // LoggerManager.writeLogInfo(e);
                }
/*  44*/        try {
/*  44*/            con.close();
                }
/*  46*/        catch (Exception e) {
	e.printStackTrace();
/*  48*/            //LoggerManager.writeLogInfo(e);
                }
/*  52*/        try {
/*  52*/            con.close();
                }
/*  54*/        catch (Exception e) {
	e.printStackTrace();
/*  56*/            //LoggerManager.writeLogInfo(e);
                }
/*  58*/        return flag;
            }

            public String ViewEmployeeDutyDetails(int id) {
/*  63*/        String remarks = "";
/*  64*/        Connection con = null;
/*  67*/        try {
/*  67*/            con = new DBConnection().getConnection();
/*  68*/            Statement st = con.createStatement();
/*  69*/            for (ResultSet rs = st.executeQuery((new StringBuilder("select remarks from EmployeeDutyDetails where EmployeeDutyid=")).append(id).toString()); rs.next();) {
/*  70*/                remarks = rs.getString(1);
                    }

                }
/*  73*/        catch (Exception e) {
/*  75*/            e.printStackTrace();
                }
/*  79*/        try {
/*  79*/            con.close();
                }
/*  81*/        catch (Exception e) {
	e.printStackTrace();
/*  83*/            //LoggerManager.writeLogInfo(e);
                }
/*  87*/        try {
/*  87*/            con.close();
                }
/*  89*/        catch (Exception e) {
	e.printStackTrace();
/*  91*/            //LoggerManager.writeLogInfo(e);
                }
/*  95*/        try {
/*  95*/            con.close();
                }
/*  97*/        catch (Exception e) {
	e.printStackTrace();
/*  99*/            //LoggerManager.writeLogInfo(e);
                }
/* 101*/        return remarks;
            }

            public EmployeDutyDetailsForm ViewEmployeeDutyDetailsById(int empDutyDetailsId) {
/* 106*/        EmployeDutyDetailsForm employeDutyDetailsForm = null;
/* 107*/        Connection con = null;
/* 110*/        try {
/* 110*/            con = new DBConnection().getConnection();
/* 111*/            PreparedStatement ps = con.prepareStatement("select * from EMPLOYEDUTYDETAILS where EMPLOYEID = ? ");
/* 112*/            ps.setInt(1, empDutyDetailsId);
/* 113*/            ResultSet rs = ps.executeQuery();
/* 114*/            if (rs.next()) {
/* 116*/                employeDutyDetailsForm.setEmployeId(rs.getInt(1));
/* 117*/                employeDutyDetailsForm.setEmployeDutyId(rs.getInt(2));
/* 118*/                employeDutyDetailsForm.setRemarks(rs.getString(3));
                    }
                }
/* 121*/        catch (Exception e) {
/* 123*/            e.printStackTrace();
                }
/* 127*/        try {
/* 127*/            con.close();
                }
/* 129*/        catch (Exception e) {
	e.printStackTrace();
/* 131*/           // LoggerManager.writeLogInfo(e);
                }
/* 135*/        try {
/* 135*/            con.close();
                }
/* 137*/        catch (Exception e) {
	e.printStackTrace();
/* 139*/            //LoggerManager.writeLogInfo(e);
                }
/* 143*/        try {
/* 143*/            con.close();
                }
/* 145*/        catch (Exception e) {
	e.printStackTrace();
/* 147*/            //LoggerManager.writeLogInfo(e);
                }
/* 149*/        return employeDutyDetailsForm;
            }

            public boolean deleteEmployeDutyDetails(int employeeDutyDetailId) {
/* 154*/        Connection con = null;
/* 155*/        boolean flag = false;
/* 158*/        try {
/* 158*/            con = new DBConnection().getConnection();
/* 159*/            PreparedStatement ps = con.prepareStatement("delete from EMPLOYEDUTYDETAILS where EMPLOYEID = ? ");
/* 160*/            ps.setInt(1, employeeDutyDetailId);
/* 161*/            int i = ps.executeUpdate();
/* 162*/            if (i > 0) {
/* 163*/                flag = true;
                    }
                }
/* 165*/        catch (Exception e) {
/* 167*/            e.printStackTrace();
                }
/* 171*/        try {
/* 171*/            con.close();
                }
/* 173*/        catch (Exception e) {
	e.printStackTrace();
/* 175*/           // LoggerManager.writeLogInfo(e);
                }
/* 179*/        try {
/* 179*/            con.close();
                }
/* 181*/        catch (Exception e) {
	e.printStackTrace();
/* 183*/            //LoggerManager.writeLogInfo(e);
                }
/* 187*/        try {
/* 187*/            con.close();
                }
/* 189*/        catch (Exception e) {
	e.printStackTrace();
/* 191*/           // LoggerManager.writeLogInfo(e);
                }
/* 193*/        return flag;
            }

            public boolean UpdateEmployeDutyDetails(EmployeDutyDetailsForm employeDutyDetailsForm) {
/* 198*/        Connection con = null;
/* 199*/        boolean flag = false;
/* 202*/        try {
/* 202*/           con = new DBConnection().getConnection();
/* 203*/            PreparedStatement ps = con.prepareStatement("update EMPLOYEDUTYDETAILS set employedutyid = ?,remarks = ? where EmployeId = ? ");
/* 204*/            ps.setInt(1, employeDutyDetailsForm.getEmployeDutyId());
/* 205*/            ps.setString(2, employeDutyDetailsForm.getRemarks());
/* 206*/            ps.setInt(3, employeDutyDetailsForm.getEmployeId());
/* 207*/            int i = ps.executeUpdate();
/* 208*/            if (i > 0) {
/* 209*/                flag = true;
                    }
                }
/* 211*/        catch (Exception e) {
/* 213*/            e.printStackTrace();
                }
/* 217*/        try {
/* 217*/            con.close();
                }
/* 219*/        catch (Exception e) {
/* 221*/            //LoggerManager.writeLogInfo(e);
	e.printStackTrace();
                }
/* 225*/        try {
/* 225*/            con.close();
                }
/* 227*/        catch (Exception e) {
/* 229*/            //LoggerManager.writeLogInfo(e);
	e.printStackTrace();
                }
/* 233*/        try {
/* 233*/            con.close();
                }
/* 235*/        catch (Exception e) {
	e.printStackTrace();
/* 237*/            //LoggerManager.writeLogInfo(e);
                }
/* 239*/        return flag;
            }
}

