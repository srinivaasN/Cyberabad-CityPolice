package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.ParolForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.core.util.DateWrapper;
import com.dts.dae.dao.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class ParoleDao extends AbstractDataAccessObject {


            public boolean register(ParolForm aform) {
/*  19*/        boolean flag = false;
/*  20*/        Connection con = null;
/*  23*/        try {
/*  23*/            int n = getSequenceID("PayRoleMaster", "Payroleid");
/*  24*/            con = new DBConnection().getConnection();
/*  25*/            PreparedStatement pst = con.prepareStatement("insert into PayRoleMaster values(?,?,?,?,?,?,?,?)");
/*  26*/            pst.setInt(1, n);
/*  27*/            pst.setString(2, DateWrapper.parseDate(new Date()));
/*  28*/            pst.setString(3, aform.getCriminalName());
/*  29*/            pst.setString(4, DateWrapper.parseDate(aform.getPayroleDateFrom()));
/*  30*/            pst.setString(5, DateWrapper.parseDate(aform.getPayRoleDateTo()));
/*  31*/            pst.setString(6, aform.getEmployeename());
/*  32*/            pst.setString(7, aform.getRemarks());
/*  33*/            pst.setString(8, aform.getReasonForPayrole());
/*  34*/            int n1 = pst.executeUpdate();
/*  35*/            if (n1 > 0) {
/*  36*/                flag = true;
                    }
                }
/*  38*/        catch (Exception e) {
/*  40*/            e.printStackTrace();
                }
/*  42*/        return flag;
            }

            public CoreList viewParols() {
/*  47*/        CoreList acorelist = new CoreList();
/*  48*/        Connection con = null;
/*  49*/        ParolForm aform = null;
/*  52*/        try {
/*  52*/            con = new DBConnection().getConnection();
/*  53*/            Statement st = con.createStatement();
/*  54*/            for (ResultSet rs = st.executeQuery("select * from payrolemaster"); rs.next(); acorelist.add(aform)) {
/*  56*/                aform = new ParolForm();
/*  57*/                aform.setPayroleid(rs.getInt(1));
/*  58*/                aform.setPayroledate(DateWrapper.parseDate(rs.getDate(2)));
/*  59*/                aform.setCriminalName(rs.getString(3));
/*  60*/                aform.setPayroleDateFrom(DateWrapper.parseDate(rs.getDate(4)));
/*  61*/                aform.setPayRoleDateTo(DateWrapper.parseDate(rs.getDate(5)));
/*  62*/                aform.setEmployeename(rs.getString(6));
/*  63*/                aform.setRemarks(rs.getString(7));
/*  64*/                aform.setReasonForPayrole(rs.getString(8));
                    }

                }
/*  68*/        catch (Exception exception) { }
/*  69*/        return acorelist;
            }

            public ParolForm viewParolsIDS(int paroleid) {
/*  74*/        CoreList acorelist = new CoreList();
/*  75*/        Connection con = null;
/*  76*/        ParolForm aform = null;
/*  79*/        try {
/*  79*/            con = new DBConnection().getConnection();
/*  80*/            Statement st = con.createStatement();
/*  81*/            for (ResultSet rs = st.executeQuery((new StringBuilder("select * from payrolemaster where Payroleid=")).append(paroleid).toString()); rs.next(); aform.setReasonForPayrole(rs.getString(8))) {
/*  83*/                aform = new ParolForm();
/*  84*/                aform.setPayroleid(rs.getInt(1));
/*  85*/                aform.setPayroledate(DateWrapper.parseDate(rs.getDate(2)));
/*  86*/                aform.setCriminalName(rs.getString(3));
/*  87*/                aform.setPayroleDateFrom(DateWrapper.parseDate(rs.getDate(4)));
/*  88*/                aform.setPayRoleDateTo(DateWrapper.parseDate(rs.getDate(5)));
/*  89*/                aform.setEmployeename(rs.getString(6));
/*  90*/                aform.setRemarks(rs.getString(7));
                    }

                }
/*  94*/        catch (Exception exception) { }
/*  95*/        return aform;
            }

            public boolean updatePayRole(ParolForm aform) {
/* 100*/        boolean flag = false;
/* 101*/        Connection con = null;
/* 104*/        try {
/* 104*/            con = new DBConnection().getConnection();
/* 105*/            PreparedStatement pst = con.prepareStatement("update PayRoleMaster payroledatefrom=?,PayRoleDateTo=?,Employeename=?,Remarks=?,ReasonForPayrole=? where Payroleid=?");
/* 106*/            pst.setString(1, DateWrapper.parseDate(aform.getPayroleDateFrom()));
/* 107*/            pst.setString(2, DateWrapper.parseDate(aform.getPayRoleDateTo()));
/* 108*/            pst.setString(3, aform.getEmployeename());
/* 109*/            pst.setString(4, aform.getRemarks());
/* 110*/            pst.setString(5, aform.getReasonForPayrole());
/* 111*/            pst.setInt(6, aform.getPayroleid());
/* 112*/            int n = pst.executeUpdate();
/* 113*/            if (n > 0) {
/* 114*/                flag = true;
                    }
                }
/* 116*/        catch (Exception exception) { }
/* 117*/        return flag;
            }
}

