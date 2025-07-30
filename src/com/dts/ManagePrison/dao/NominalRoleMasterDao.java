package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.NominalRoleMasterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class NominalRoleMasterDao extends AbstractDataAccessObject {


            public boolean insertNominalRoleMaster(NominalRoleMasterForm dmform) {
/*  19*/        Connection con = null;
/*  20*/        boolean flag = false;
/*  23*/        try {
/*  23*/            int n = getSequenceID("NominalRollMaster", "NominalRollid");
/*  24*/            con = new DBConnection().getConnection();
/*  25*/            PreparedStatement ps = con.prepareStatement("insert into NominalRollMaster values(?,?,?,?,?)");
/*  26*/            ps.setInt(1, n);
/*  27*/            ps.setString(2, DateWrapper.parseDate(dmform.getRoleDateTime()));
/*  28*/            ps.setString(3, dmform.getCriminalname());
/*  29*/            ps.setString(4, dmform.getEmployeename());
/*  30*/            ps.setString(5, dmform.getCellno());
/*  31*/            int i = ps.executeUpdate();
/*  32*/            if (i > 0) {
/*  33*/                flag = true;
                    }
                }
/*  36*/        catch (Exception e) {
/*  38*/            e.printStackTrace();
                }
/*  42*/        try {
/*  42*/            con.close();
                }
/*  44*/        catch (Exception e) {
	e.printStackTrace();
/*  46*/           // LoggerManager.writeLogInfo(e);
                }
/*  48*/        return flag;
            }

            public CoreList ViewNominalRoleMaster() {
/*  55*/        CoreList v = new CoreList();
/*  56*/        Connection con = null;
/*  57*/        NominalRoleMasterForm dmform = null;
/*  60*/        try {
/*  60*/            con = new DBConnection().getConnection();
/*  61*/            Statement st = con.createStatement();
/*  63*/            for (ResultSet rs = st.executeQuery("select * from NominalRollMaster"); rs.next(); v.add(dmform)) {
/*  65*/                dmform = new NominalRoleMasterForm();
/*  66*/                dmform.setNominalRollId(rs.getInt(1));
/*  67*/                dmform.setRoleDateTime(rs.getString(2));
/*  68*/                dmform.setCriminalname(rs.getString(3));
/*  69*/                dmform.setEmployeename(rs.getString(4));
/*  70*/                dmform.setCellno(rs.getString(5));
                    }

                }
/*  75*/        catch (Exception e) {
/*  77*/            e.printStackTrace();
                }
/*  81*/        try {
/*  81*/            con.close();
                }
/*  83*/        catch (Exception e) {
	e.printStackTrace();
/*  85*/            //LoggerManager.writeLogInfo(e);
                }
/*  88*/        return v;
            }

            public NominalRoleMasterForm ViewNominalRoleMasterById(int NominalRoleId) {
/*  95*/        NominalRoleMasterForm dmform = new NominalRoleMasterForm();
/*  96*/        Connection con = null;
/*  99*/        try {
/*  99*/            con = new DBConnection().getConnection();
/* 100*/            PreparedStatement ps = con.prepareStatement("select * from NominalRoleMASTER where NominalRollId = ? ");
/* 101*/            ps.setInt(1, NominalRoleId);
/* 102*/            ResultSet rs = ps.executeQuery();
/* 103*/            if (rs.next()) {
/* 105*/                dmform = new NominalRoleMasterForm();
/* 106*/                dmform.setNominalRollId(rs.getInt(1));
/* 107*/                dmform.setRoleDateTime(rs.getString(2));
/* 108*/                dmform.setCriminalId(rs.getInt(3));
/* 109*/                dmform.setEmployeRegId(rs.getInt(4));
/* 110*/                dmform.setBalanceNo(rs.getString(5));
/* 111*/                dmform.setCellno(rs.getString(6));
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
/* 125*/           // LoggerManager.writeLogInfo(e);
                }
/* 128*/        return dmform;
            }

            public boolean deleteNominalRoleMaster(int NominalRoleId) {
/* 135*/        Connection con = null;
/* 136*/        boolean flag = false;
/* 139*/        try {
/* 139*/            con = new DBConnection().getConnection();
/* 140*/            PreparedStatement ps = con.prepareStatement("delete from NominalRoleMASTER where NominalRollId = ? ");
/* 141*/            ps.setInt(1, NominalRoleId);
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
/* 157*/           // LoggerManager.writeLogInfo(e);
                }
/* 160*/        return flag;
            }

            public boolean UpdateNominalRoleMaster(NominalRoleMasterForm dmform) {
/* 167*/        Connection con = null;
/* 168*/        boolean flag = false;
/* 171*/        try {
/* 171*/            con = new DBConnection().getConnection();
/* 172*/            PreparedStatement ps = con.prepareStatement("update NominalRoleMASTER set ROLEDATETIME = ?,CRIMINALID = ?,EMPLOYEREGID = ?,BALANCENO = ?,CELLNO = ? where NominalRollId = ? ");
/* 173*/            ps.setInt(6, dmform.getNominalRollId());
/* 174*/            ps.setString(1, DateWrapper.parseDate(dmform.getRoleDateTime()));
/* 175*/            ps.setInt(2, dmform.getCriminalId());
/* 176*/            ps.setInt(3, dmform.getEmployeRegId());
/* 177*/            ps.setString(4, dmform.getBalanceNo());
/* 178*/            ps.setString(5, dmform.getCellno());
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
/* 194*/           // LoggerManager.writeLogInfo(e);
                }
/* 197*/        return flag;
            }
}

