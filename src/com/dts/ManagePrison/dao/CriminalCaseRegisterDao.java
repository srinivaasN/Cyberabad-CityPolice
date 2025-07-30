package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalCaseRegisterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CriminalCaseRegisterDao extends AbstractDataAccessObject {


            public boolean insertCriminalCaseRegister(CriminalCaseRegisterForm ccform) {
/*  19*/        Connection con = null;
/*  20*/        boolean flag = false;
/*  23*/        try {
/*  23*/            int n = getSequenceID("CriminalCaseRegister", "CaseRegisterationid");
/*  24*/            con = new DBConnection().getConnection();
/*  25*/            PreparedStatement ps = con.prepareStatement("insert into CriminalCaseRegister values(?,?,?,?,?,?,?,?,?,?)");
/*  26*/            ps.setInt(1, n);
/*  27*/            ps.setString(2, ccform.getCriminalname());
/*  28*/            ps.setString(3, DateWrapper.parseDate(ccform.getCaseRegDate()));
/*  29*/            ps.setString(4, ccform.getCaseno());
/*  30*/            ps.setString(5, ccform.getFirNo());
/*  31*/            ps.setString(6, ccform.getRemandno());
/*  32*/            ps.setString(7, ccform.getSectioncovered());
/*  33*/            ps.setString(8, ccform.getPoliceStationName());
/*  34*/            ps.setString(9, DateWrapper.parseDate(ccform.getFirDate()));
/*  35*/            ps.setString(10, ccform.getInspectorName());
/*  36*/            int i = ps.executeUpdate();
/*  37*/            if (i > 0) {
/*  38*/                flag = true;
                    }
                }
/*  41*/        catch (Exception e) {
/*  43*/            e.printStackTrace();
                }
/*  47*/        try {
/*  47*/            con.close();
                }
/*  49*/        catch (Exception e) {
/*  51*/            //LoggerManager.writeLogInfo(e);
	                   e.printStackTrace();
                }
/*  54*/        return flag;
            }

            public CoreList ViewCriminalCaseRegister() {
/*  61*/        CoreList v = new CoreList();
/*  62*/        Connection con = null;
/*  63*/        CriminalCaseRegisterForm ccform = null;
/*  66*/        try {
/*  66*/            con = new DBConnection().getConnection();
/*  67*/            Statement st = con.createStatement();
/*  69*/            for (ResultSet rs = st.executeQuery("select * from CriminalCaseRegister"); rs.next(); v.add(ccform)) {
/*  71*/                ccform = new CriminalCaseRegisterForm();
/*  72*/                ccform.setCaseRegId(rs.getInt(1));
/*  73*/                ccform.setCriminalname(rs.getString(2));
/*  74*/                ccform.setCaseRegDate(DateWrapper.parseDate(rs.getDate(3)));
/*  75*/                ccform.setCaseno(rs.getString(4));
/*  76*/                ccform.setFirNo(rs.getString(5));
/*  77*/                ccform.setRemandno(rs.getString(6));
/*  78*/                ccform.setSectioncovered(rs.getString(7));
/*  79*/                ccform.setPoliceStationName(rs.getString(8));
/*  80*/                ccform.setFirDate(DateWrapper.parseDate(rs.getDate(9)));
/*  81*/                ccform.setInspectorName(rs.getString(10));
                    }

                }
/*  86*/        catch (Exception e) {
/*  88*/            e.printStackTrace();
                }
/*  92*/        try {
/*  92*/            con.close();
                }
/*  94*/        catch (Exception e) {
/*  96*/            //LoggerManager.writeLogInfo(e);
	                 e.printStackTrace();
                }
/*  99*/        return v;
            }

            public CriminalCaseRegisterForm ViewCriminalCaseRegisterById(String criminalname) {
/* 106*/        CriminalCaseRegisterForm ccform = new CriminalCaseRegisterForm();
/* 107*/        Connection con = null;
/* 110*/        try {
/* 110*/            con = new DBConnection().getConnection();
/* 111*/            PreparedStatement ps = con.prepareStatement("select * from CriminalCaseRegister where Criminalname = ? ");
/* 112*/            ps.setString(1, criminalname);
/* 113*/            ResultSet rs = ps.executeQuery();
/* 114*/            if (rs.next()) {
/* 116*/                ccform.setCaseRegId(rs.getInt(1));
/* 117*/                ccform.setCriminalname(rs.getString(2));
/* 118*/                ccform.setCaseRegDate(DateWrapper.parseDate(rs.getDate(3)));
/* 119*/                ccform.setCaseno(rs.getString(4));
/* 120*/                ccform.setFirNo(rs.getString(5));
/* 121*/                ccform.setRemandno(rs.getString(6));
/* 122*/                ccform.setSectioncovered(rs.getString(7));
/* 123*/                ccform.setPoliceStationName(rs.getString(8));
/* 124*/                ccform.setFirDate(DateWrapper.parseDate(rs.getDate(9)));
/* 125*/                ccform.setInspectorName(rs.getString(10));
                    }
                }
/* 129*/        catch (Exception e) {
/* 131*/            e.printStackTrace();
                }
/* 135*/        try {
/* 135*/            con.close();
                }
/* 137*/        catch (Exception e) {
	                 e.printStackTrace();
/* 139*/            //LoggerManager.writeLogInfo(e);
                }
/* 142*/        return ccform;
            }

            public boolean deleteCriminalCaseRegister(int NominalRoleId) {
/* 149*/        Connection con = null;
/* 150*/        boolean flag = false;
/* 153*/        try {
/* 153*/            con = new DBConnection().getConnection();
/* 154*/            PreparedStatement ps = con.prepareStatement("delete from CriminalCaseRegister where CriminalRegId = ? ");
/* 155*/            ps.setInt(1, NominalRoleId);
/* 156*/            int i = ps.executeUpdate();
/* 157*/            if (i > 0) {
/* 158*/                flag = true;
                    }
                }
/* 161*/        catch (Exception e) {
/* 163*/            e.printStackTrace();
                }
/* 167*/        try {
/* 167*/            con.close();
                }
/* 169*/        catch (Exception e) {
	              e.printStackTrace();
/* 171*/            //LoggerManager.writeLogInfo(e);
                }
/* 174*/        return flag;
            }

            public boolean UpdateCriminalCaseRegister(CriminalCaseRegisterForm ccform) {
/* 181*/        Connection con = null;
/* 182*/        boolean flag = false;
/* 185*/        try {
/* 185*/            con = new DBConnection().getConnection();
/* 186*/            PreparedStatement ps = con.prepareStatement("update CriminalCaseRegister set CaseRegisterDate= ?,caseno=?,FIRNo = ?,Remandno=?,sectioncovered=?,PoliceStationname = ?,FirDate= ?,InspectorName = ? where Criminalname= ? ");
/* 187*/            ps.setString(1, DateWrapper.parseDate(ccform.getCaseRegDate()));
/* 188*/            ps.setString(2, ccform.getCaseno());
/* 189*/            ps.setString(3, ccform.getFirNo());
/* 190*/            ps.setString(4, ccform.getRemandno());
/* 191*/            ps.setString(5, ccform.getSectioncovered());
/* 192*/            ps.setString(6, ccform.getPoliceStationName());
/* 193*/            ps.setString(7, DateWrapper.parseDate(ccform.getFirDate()));
/* 194*/            ps.setString(8, ccform.getInspectorName());
/* 195*/            ps.setString(9, ccform.getCriminalname());
/* 196*/            int i = ps.executeUpdate();
/* 197*/            if (i > 0) {
/* 198*/                flag = true;
                    }
                }
/* 201*/        catch (Exception e) {
/* 203*/            e.printStackTrace();
                }
/* 207*/        try {
/* 207*/            con.close();
                }
/* 209*/        catch (Exception e) {
	                       e.printStackTrace();
/* 211*/            //LoggerManager.writeLogInfo(e);
                }
/* 214*/        return flag;
            }
}

