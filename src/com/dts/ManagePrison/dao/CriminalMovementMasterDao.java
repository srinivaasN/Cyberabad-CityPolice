package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalMovementMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class CriminalMovementMasterDao extends AbstractDataAccessObject {


            public boolean insertCriminalMovementMaster(CriminalMovementMasterForm cmform) {
/*  18*/        Connection con = null;
/*  19*/        boolean flag = false;
/*  22*/        try {
/*  22*/            int n = getSequenceID("CriminalsMovementMaster", "movementid");
/*  23*/            con = new DBConnection().getConnection();
/*  24*/            PreparedStatement ps = con.prepareStatement("insert into CriminalsMovementMaster values(?,?,?,?,?,?,?,?,?,?)");
/*  25*/            ps.setInt(1, n);
/*  26*/            ps.setString(2, DateWrapper.parseDate(new Date()));
/*  27*/            ps.setString(3, cmform.getFromjail());
/*  28*/            ps.setString(4, cmform.getTojail());
/*  29*/            ps.setString(5, cmform.getReasonForMovement());
/*  30*/            ps.setString(6, cmform.getEmployeename());
/*  31*/            ps.setString(7, cmform.getCriminalname());
/*  32*/            ps.setString(8, DateWrapper.parseDate(cmform.getCriminalExprelDate()));
/*  33*/            ps.setString(9, DateWrapper.parseDate(cmform.getCriminalActrelDate()));
/*  34*/            ps.setString(10, cmform.getReasonFordelay());
/*  35*/            int i = ps.executeUpdate();
/*  36*/            if (i > 0) {
/*  37*/                flag = true;
                    }
                }
/*  39*/        catch (Exception e) {
/*  41*/            e.printStackTrace();
                }
/*  45*/        try {
/*  45*/            con.close();
                }
/*  47*/        catch (Exception e) {
	e.printStackTrace();
/*  49*/            //LoggerManager.writeLogInfo(e);
                }
/*  53*/        try {
/*  53*/            con.close();
                }
/*  55*/        catch (Exception e) {
	e.printStackTrace();
/*  57*/            //LoggerManager.writeLogInfo(e);
                }
/*  61*/        try {
/*  61*/            con.close();
                }
/*  63*/        catch (Exception e) {
	e.printStackTrace();
/*  65*/            //LoggerManager.writeLogInfo(e);
                }
/*  67*/        return flag;
            }

            public CoreList ViewCriminalMovementMaster() {
/*  72*/        CoreList v = new CoreList();
/*  73*/        Connection con = null;
/*  74*/        CriminalMovementMasterForm cmform = null;
/*  77*/        try {
/*  77*/            con = new DBConnection().getConnection();
/*  78*/            Statement st = con.createStatement();
/*  79*/            for (ResultSet rs = st.executeQuery("select * from CriminalsMovementMaster"); rs.next(); v.add(cmform)) {
/*  81*/                cmform = new CriminalMovementMasterForm();
/*  82*/                cmform.setMovementId(rs.getInt(1));
/*  83*/                cmform.setFromMovementDateTime(DateWrapper.parseDate(rs.getDate(2)));
/*  84*/                cmform.setFromjail(rs.getString(3));
/*  85*/                cmform.setTojail(rs.getString(4));
/*  86*/                cmform.setReasonForMovement(rs.getString(5));
/*  87*/                cmform.setEmployeename(rs.getString(6));
/*  88*/                cmform.setCriminalname(rs.getString(7));
/*  89*/                cmform.setCriminalExprelDate(DateWrapper.parseDate(rs.getDate(8)));
/*  90*/                cmform.setCriminalActrelDate(DateWrapper.parseDate(rs.getDate(9)));
/*  91*/                cmform.setReasonFordelay(rs.getString(10));
                    }

                }
/*  95*/        catch (Exception e) {
/*  97*/            e.printStackTrace();
                }
/* 101*/        try {
/* 101*/            con.close();
                }
/* 103*/        catch (Exception e) {
	e.printStackTrace();
/* 105*/           // LoggerManager.writeLogInfo(e);
                }
/* 109*/        try {
/* 109*/            con.close();
                }
/* 111*/        catch (Exception e) {
	e.printStackTrace();
/* 113*/            //LoggerManager.writeLogInfo(e);
                }
/* 117*/        try {
/* 117*/            con.close();
                }
/* 119*/        catch (Exception e) {
	e.printStackTrace();
/* 121*/            //LoggerManager.writeLogInfo(e);
                }
/* 123*/        return v;
            }

            public CriminalMovementMasterForm ViewCriminalMovementMasterById(int Criminalcmform) {
/* 128*/        CriminalMovementMasterForm cmform = new CriminalMovementMasterForm();
/* 129*/        Connection con = null;
/* 132*/        try {
/* 132*/           con = new DBConnection().getConnection();
/* 133*/            PreparedStatement ps = con.prepareStatement("select * from CriminalMovementMaster where MovementId = ? ");
/* 134*/            ps.setInt(1, Criminalcmform);
/* 135*/            ResultSet rs = ps.executeQuery();
/* 136*/            if (rs.next()) {
/* 138*/                cmform = new CriminalMovementMasterForm();
/* 139*/                cmform.setMovementId(rs.getInt(1));
/* 140*/                cmform.setFromMovementDateTime(DateWrapper.parseDate(rs.getDate(2)));
/* 141*/                cmform.setToMovementDateTime(DateWrapper.parseDate(rs.getDate(3)));
/* 142*/                cmform.setReasonForMovement(rs.getString(4));
/* 143*/                cmform.setEmployeId(rs.getInt(5));
/* 144*/                cmform.setCriminalId(rs.getInt(6));
/* 145*/                cmform.setCriminalExprelDate(DateWrapper.parseDate(rs.getString(7)));
/* 146*/                cmform.setCriminalActrelDate(DateWrapper.parseDate(rs.getString(8)));
/* 147*/                cmform.setReasonFordelay(rs.getString(9));
                    }
                }
/* 150*/        catch (Exception e) {
/* 152*/            e.printStackTrace();
                }
/* 156*/        try {
/* 156*/            con.close();
                }
/* 158*/        catch (Exception e) {
	e.printStackTrace();
/* 160*/            //LoggerManager.writeLogInfo(e);
                }
/* 164*/        try {
/* 164*/            con.close();
                }
/* 166*/        catch (Exception e) {
	e.printStackTrace();
/* 168*/           // LoggerManager.writeLogInfo(e);
                }
/* 172*/        try {
/* 172*/            con.close();
                }
/* 174*/        catch (Exception e) {
	e.printStackTrace();
/* 176*/            //LoggerManager.writeLogInfo(e);
                }
/* 178*/        return cmform;
            }

            public boolean deleteCriminalMovementMaster(int Criminalcmform) {
/* 183*/        Connection con = null;
/* 184*/        boolean flag = false;
/* 187*/        try {
/* 187*/            con = new DBConnection().getConnection();
/* 188*/            PreparedStatement ps = con.prepareStatement("delete from CriminalMovementMaster where MovementId = ? ");
/* 189*/            ps.setInt(1, Criminalcmform);
/* 190*/            int i = ps.executeUpdate();
/* 191*/            if (i > 0) {
/* 192*/                flag = true;
                    }
                }
/* 194*/        catch (Exception e) {
/* 196*/            e.printStackTrace();
                }
/* 200*/        try {
/* 200*/            con.close();
                }
/* 202*/        catch (Exception e) {
	e.printStackTrace();
/* 204*/            //LoggerManager.writeLogInfo(e);
                }
/* 208*/        try {
/* 208*/            con.close();
                }
/* 210*/        catch (Exception e) {
	e.printStackTrace();
/* 212*/           // LoggerManager.writeLogInfo(e);
                }
/* 216*/        try {
/* 216*/            con.close();
                }
/* 218*/        catch (Exception e) {
	e.printStackTrace();
/* 220*/            //LoggerManager.writeLogInfo(e);
                }
/* 222*/        return flag;
            }

            public boolean UpdateCriminalMovementMaster(CriminalMovementMasterForm cmform) {
/* 227*/        Connection con = null;
/* 228*/        boolean flag = false;
/* 231*/        try {
/* 231*/            con = new DBConnection().getConnection();
/* 232*/            PreparedStatement ps = con.prepareStatement("update CriminalMovementMaster set FROMMOVEMENTDATETIME = ?,TOMOVEMENTDATE = ?,REASONFORMOVEMENT = ?,EMPLOYEID = ?,CRIMINALID = ?,CRIMINALEXPRELDATE = ?,CRIMINALACTRELDATE = ?,REASONFORDELAY = ? where MovementId = ? ");
/* 233*/            ps.setInt(9, cmform.getMovementId());
/* 234*/            ps.setString(1, DateWrapper.parseDate(cmform.getFromMovementDateTime()));
/* 235*/            ps.setString(2, DateWrapper.parseDate(cmform.getToMovementDateTime()));
/* 236*/            ps.setString(3, cmform.getReasonForMovement());
/* 237*/            ps.setInt(4, cmform.getEmployeId());
/* 238*/            ps.setInt(5, cmform.getCriminalId());
/* 239*/            ps.setString(6, DateWrapper.parseDate(cmform.getCriminalExprelDate()));
/* 240*/            ps.setString(7, DateWrapper.parseDate(cmform.getCriminalActrelDate()));
/* 241*/            ps.setString(8, DateWrapper.parseDate(cmform.getReasonFordelay()));
/* 242*/            int i = ps.executeUpdate();
/* 243*/            if (i > 0) {
/* 244*/                flag = true;
                    }
                }
/* 246*/        catch (Exception e) {
/* 248*/            e.printStackTrace();
                }
/* 252*/        try {
/* 252*/            con.close();
                }
/* 254*/        catch (Exception e) {
	e.printStackTrace();
/* 256*/           // LoggerManager.writeLogInfo(e);
                }
/* 260*/        try {
/* 260*/            con.close();
                }
/* 262*/        catch (Exception e) {
	e.printStackTrace();
/* 264*/           // LoggerManager.writeLogInfo(e);
                }
/* 268*/        try {
/* 268*/            con.close();
                }
/* 270*/        catch (Exception e) {
	e.printStackTrace();
/* 272*/            //LoggerManager.writeLogInfo(e);
                }
/* 274*/        return flag;
            }
}

