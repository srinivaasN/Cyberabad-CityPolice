package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalArticlesMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.*;

public class CriminalArticlesMasterDao extends AbstractDataAccessObject {


            public boolean insertCriminalArticlesMaster(CriminalArticlesMasterForm caform) {
/*  21*/        Connection con = null;
/*  22*/        boolean flag = false;
/*  25*/        try {
/*  25*/            int n = getSequenceID("CriminalArticalMaster", "Articalid");
/*  26*/            con = new DBConnection().getConnection();
/*  27*/            PreparedStatement ps = con.prepareStatement("insert into CriminalArticalMaster values(?,?,?,?)");
/*  28*/            ps.setInt(1, n);
/*  29*/            ps.setString(2, caform.getArticleName());
/*  30*/            ps.setInt(3, caform.getArticleCost());
/*  31*/            ps.setString(4, caform.getCriminalnamel());
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
/*  47*/            e.printStackTrace();
                }
/*  50*/        return flag;
            }

            public CoreList ViewCriminalArticlesMaster() {
/*  57*/        CoreList v = new CoreList();
/*  58*/        Connection con = null;
/*  59*/        CriminalArticlesMasterForm caform = null;
/*  62*/        try {
/*  62*/            con = new DBConnection().getConnection();
/*  63*/            Statement st = con.createStatement();
/*  65*/            for (ResultSet rs = st.executeQuery("select * from CriminalArticalMaster"); rs.next(); v.add(caform)) {
/*  67*/                caform = new CriminalArticlesMasterForm();
/*  68*/                caform.setArticleId(rs.getInt(1));
/*  69*/                caform.setArticleName(rs.getString(2));
/*  70*/                caform.setArticleCost(rs.getInt(3));
/*  71*/                caform.setCriminalnamel(rs.getString(4));
                    }

                }
/*  76*/        catch (Exception e) {
/*  78*/            e.printStackTrace();
                }
/*  82*/        try {
/*  82*/            con.close();
                }
/*  84*/        catch (Exception e) {
	
/*  86*/            //LoggerManager.writeLogInfo(e);
	
                }
/*  89*/        return v;
            }

            public CriminalArticlesMasterForm ViewCriminalArticlesMasterById(String storepath, int ArticleId) {
/*  96*/        CriminalArticlesMasterForm caform = new CriminalArticlesMasterForm();
/*  97*/        Connection con = null;
/* 100*/        try {
/* 100*/           con = new DBConnection().getConnection();
/* 101*/            PreparedStatement ps = con.prepareStatement("select * from CriminalArticlesMaster where ArticleId = ? ");
/* 102*/            ps.setInt(1, ArticleId);
/* 103*/            ResultSet rs = ps.executeQuery();
/* 104*/            if (rs.next()) {
/* 106*/                caform = new CriminalArticlesMasterForm();
/* 107*/                int id = rs.getInt(1);
/* 108*/                caform.setArticleId(rs.getInt(1));
/* 109*/                caform.setCriminalId(rs.getInt(2));
/* 110*/                caform.setArticleName(rs.getString(3));
/* 111*/                Blob b = rs.getBlob(4);
/* 112*/                byte b1[] = b.getBytes(1L, (int)b.length());
/* 113*/                OutputStream fout = new FileOutputStream((new StringBuilder(String.valueOf(storepath))).append("/").append(id).append(".gif").toString());
/* 114*/                fout.write(b1);
/* 115*/                caform.setArticleImage((new StringBuilder(String.valueOf(id))).append(".gif").toString());
/* 116*/                caform.setArticleCost(rs.getInt(5));
/* 117*/                caform.setEmployeId(rs.getInt(6));
                    }
                }
/* 121*/        catch (Exception e) {
/* 123*/            e.printStackTrace();
                }
/* 127*/        try {
/* 127*/            con.close();
                }
/* 129*/        catch (Exception e) {
/* 131*/            e.printStackTrace();
                }
/* 134*/        return caform;
            }

            public boolean deleteCriminalArticlesMaster(int ArticleId) {
/* 141*/        Connection con = null;
/* 142*/        boolean flag = false;
/* 145*/        try {
/* 145*/            con = new DBConnection().getConnection();
/* 146*/            PreparedStatement ps = con.prepareStatement("delete from CriminalArticlesMaster where ArticleId = ? ");
/* 147*/            ps.setInt(1, ArticleId);
/* 148*/            int i = ps.executeUpdate();
/* 149*/            if (i > 0) {
/* 150*/                flag = true;
                    }
                }
/* 153*/        catch (Exception e) {
/* 155*/            e.printStackTrace();
                }
/* 159*/        try {
/* 159*/            con.close();
                }
/* 161*/        catch (Exception e) {
/* 163*/            e.printStackTrace();
                }
/* 166*/        return flag;
            }

            public boolean UpdateCriminalArticlesMaster(CriminalArticlesMasterForm caform) {
/* 173*/        Connection con = null;
/* 174*/        boolean flag = false;
/* 177*/        try {
/* 177*/            con = new DBConnection().getConnection();
/* 178*/            PreparedStatement ps = con.prepareStatement("update CriminalArticlesMaster set CRIMINALID = ?,ARTICLENAME = ?,ARTICLEIMAGE = ?,ARTICLECOST = ?,EMPLOYEID = ? where ArticleId = ? ");
/* 179*/            ps.setInt(6, caform.getArticleId());
/* 180*/            ps.setInt(1, caform.getCriminalId());
/* 181*/            ps.setString(2, caform.getArticleName());
/* 182*/            File afile = new File(caform.getArticleImage());
/* 183*/            FileInputStream fs = new FileInputStream(afile);
/* 184*/            ps.setBinaryStream(3, fs, (int)afile.length());
/* 185*/            ps.setInt(4, caform.getArticleCost());
/* 186*/            ps.setInt(5, caform.getEmployeId());
/* 187*/            int i = ps.executeUpdate();
/* 188*/            if (i > 0) {
/* 189*/                flag = true;
                    }
                }
/* 192*/        catch (Exception e) {
/* 194*/            e.printStackTrace();
                }
/* 198*/        try {
/* 198*/            con.close();
                }
/* 200*/        catch (Exception e) {
/* 202*/            e.printStackTrace();
                }
/* 205*/        return flag;
            }
}

