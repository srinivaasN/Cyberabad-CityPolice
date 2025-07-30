package com.dts.dae.dao;

import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.DateWrapper;
//import com.dts.core.util.LoggerManager;
import com.dts.dae.model.Profile;

import java.sql.*;
import java.util.Date;

public class SecurityDAO extends AbstractDataAccessObject {

            Connection con;
            private String desc;
            private boolean flag;

            public SecurityDAO() {
            	//System.out.println("before connection");
/*  15*/        //con = getConnection();
                //System.out.println("connection successful");
            }

            public boolean checkPassword(Profile regbean) {
/*  20*/        String loginid = regbean.getLoginID();
/*  21*/        String oldpassword = regbean.getPassword();
/*  24*/        try {
/*  24*/            PreparedStatement pst = con.prepareStatement("select * from logindetails where password=? and loginname=?");
/*  25*/            pst.setString(1, oldpassword);
/*  26*/            pst.setString(2, loginid);
/*  27*/            ResultSet rs = pst.executeQuery();
/*  28*/            if (rs.next()) {
/*  30*/                flag = true;
                       System.out.println("login success");
/*  31*/                //LoggerManager.writeLogInfo("Login Success");
                    } else {
/*  34*/                flag = false;
                    }
                }
/*  37*/        catch (SQLException ex) {
/*  39*/            //LoggerManager.writeLogSevere(ex);
/*  40*/            //LoggerManager.writeLogInfo("Database Connection problem");
/*  41*/           System.out.println("database problem"); 
	               flag = false;
                }
/*  43*/        return flag;
            }

            public int checkFirstLogin(String loginname) {
/*  48*/        int fstatus = 2;
/*  51*/        try {
/*  51*/            con.setAutoCommit(true);
/*  52*/            PreparedStatement pst = con.prepareStatement("select firstlogin from logindetails where loginname=?");
/*  53*/            pst.setString(1, loginname);
/*  54*/            ResultSet rs = pst.executeQuery();
/*  55*/            if (rs.next()) {
/*  56*/                fstatus = rs.getInt(1);
                    }
/*  57*/            con.close();
                }
/*  59*/        catch (SQLException ex) {
/*  61*/            //LoggerManager.writeLogSevere(ex);
/*  62*/            //LoggerManager.writeLogInfo("Database Connection problem");
	                    System.out.println("database connection problem");
/*  63*/            flag = false;
                }
/*  65*/        return fstatus;
            }

            public String loginCheck(String loginid, String password) {
/*  70*/        String role = "";
                  System.out.println("before login check connection");
Connection con = new DBConnection().getConnection();
                 System.out.println("we got connection form db");
/*  73*/        try {
	                //con=getConnection();
/*  73*/            con.setAutoCommit(true);
/*  74*/            PreparedStatement pst = con.prepareStatement("select logintype from logindetails where loginname=? and password=?");
/*  75*/            pst.setString(1, loginid);
/*  76*/            pst.setString(2, password);
/*  77*/            ResultSet rs = pst.executeQuery();
/*  78*/            if (rs.next()) {
/*  80*/                role = rs.getString(1);
/*  81*/                desc = "Login Success";
                    } else {
/*  84*/                flag = false;
/*  85*/                desc = "Entered Invalid password";
                    }
                }
/*  88*/        catch (SQLException ex) {
/*  90*/            //LoggerManager.writeLogSevere(ex);
/*  91*/            //desc = "Database Connection problem";
	                 System.out.println("database connection problem");
/*  92*/            flag = false;
                }
/*  94*/        loginaudit(loginid, desc);
/*  95*/        return role;
            }

            public void loginaudit(String loginid, String desc) {
            	Connection con = new DBConnection().getConnection();
            	System.out.println("loginaudit method");
/* 102*/        try {
/* 102*/            String newdate = DateWrapper.parseDate(new Date());
/* 103*/            PreparedStatement pst = con.prepareStatement("insert into loginaudit values(?,?,?)");
/* 104*/            pst.setString(1, loginid);
/* 105*/            pst.setString(2, newdate);
/* 106*/            pst.setString(3, desc);
/* 107*/            int i = pst.executeUpdate();
/* 108*/            if (i == 1) {
/* 109*/                con.commit();
                    } else {
/* 111*/                con.rollback();
                    }
/* 112*/            con.close();
                }
/* 114*/        catch (Exception e) {
/* 118*/            try {
/* 118*/                con.rollback();
                    }
/* 120*/            catch (SQLException ex) {
/* 122*/                //LoggerManager.writeLogSevere(ex);
	                   ex.printStackTrace();
                    }
/* 124*/            e.printStackTrace();
                }
            }

            public boolean changePassword(Profile regbean) {
/* 130*/        String loginid = regbean.getLoginID();
/* 131*/        String oldpassword = regbean.getPassword();
/* 132*/        String newpassword = regbean.getNewPassword();
                con = new DBConnection().getConnection();
/* 135*/        try {
/* 135*/            con.setAutoCommit(false);
/* 136*/            String newdate = DateWrapper.parseDate(new Date());
/* 137*/            PreparedStatement pst = con.prepareStatement("UPDATE logindetails SET password=?,passmodifieddate=? WHERE loginname=? and password=?");
/* 138*/            pst.setString(1, newpassword);
/* 139*/            pst.setString(2, newdate);
/* 140*/            pst.setString(3, loginid);
/* 141*/            pst.setString(4, oldpassword);
/* 142*/            int i = pst.executeUpdate();
/* 143*/            if (i == 1) {
/* 145*/                flag = true;
/* 146*/                con.commit();
                    } else {
/* 149*/                flag = false;
/* 150*/                con.rollback();
                    }
/* 152*/            con.close();
                }
/* 154*/        catch (SQLException ex) {
	                    ex.printStackTrace();
/* 156*/            //LoggerManager.writeLogSevere(ex);
/* 157*/            flag = false;
/* 160*/            try {
/* 160*/                con.rollback();
                    }
/* 162*/            catch (SQLException sex) {
	                     sex.printStackTrace();
/* 164*/                //LoggerManager.writeLogSevere(sex);
                    }
                }
/* 167*/        catch (Exception e) {
/* 169*/            e.printStackTrace();
/* 170*/            flag = false;
/* 173*/            try {
/* 173*/                con.rollback();
                    }
/* 175*/            catch (SQLException sex) {
	                         sex.printStackTrace();
/* 177*/                //LoggerManager.writeLogSevere(sex);
                    }
                }
/* 180*/        return flag;
            }

            public boolean changeQuestion(Profile regbean) {
/* 185*/        String loginid = regbean.getLoginID();
/* 186*/        String password = regbean.getPassword();
/* 187*/        int secretquestid = regbean.getSecretQuestionID();
/* 188*/        String ownsecretquest = regbean.getOwnSecretQuestion();
/* 189*/        String secretans = regbean.getSecretAnswer();
/* 190*/        int i = 0;
con = new DBConnection().getConnection();
/* 193*/        try {
/* 193*/            con.setAutoCommit(false);
/* 194*/            if (checkPassword(regbean)) {
                        PreparedStatement pst;
/* 197*/                if (secretquestid == 0) {
/* 199*/                    Statement st = con.createStatement();
/* 200*/                    ResultSet rs = st.executeQuery("select (max(questionid))+1 from questionbase");
/* 201*/                    if (rs.next()) {
/* 202*/                        secretquestid = rs.getInt(1);
                            }
/* 203*/                    pst = con.prepareStatement("INSERT INTO questionbase VALUES(?,?)");
/* 204*/                    pst.setInt(1, secretquestid);
/* 205*/                    pst.setString(2, ownsecretquest);
/* 206*/                    pst.executeUpdate();
                        }
/* 208*/                pst = con.prepareStatement("UPDATE logindetails SET squestionid=?,sanswer=? WHERE loginname=? and password=?");
/* 209*/                pst.setInt(1, secretquestid);
/* 210*/                pst.setString(2, secretans);
/* 211*/                pst.setString(3, loginid);
/* 212*/                pst.setString(4, password);
/* 213*/                i = pst.executeUpdate();
/* 214*/                if (i == 1) {
/* 216*/                    flag = true;
/* 217*/                    con.commit();
                        } else {
/* 220*/                    flag = false;
/* 221*/                    con.rollback();
                        }
                    }
/* 224*/            con.close();
                }
/* 226*/        catch (SQLException ex) {
/* 228*/            //LoggerManager.writeLogSevere(ex);
	                     ex.printStackTrace();
/* 229*/            flag = false;
/* 232*/            try {
/* 232*/                con.rollback();
                    }
/* 234*/            catch (SQLException sex) {
/* 236*/                //LoggerManager.writeLogSevere(sex);
	sex.printStackTrace();
                    }
                }
/* 239*/        catch (Exception e) {
/* 241*/            //LoggerManager.writeLogSevere(e);
	e.printStackTrace();
/* 242*/            flag = false;
/* 245*/            try {
/* 245*/                con.rollback();
                    }
/* 247*/            catch (SQLException sex) {
/* 249*/                //LoggerManager.writeLogSevere(sex);
	sex.printStackTrace();
                    }
                }
/* 252*/        return flag;
            }

            public String recoverPasswordByExistQuestion(Profile regbean) {
/* 257*/        String loginid = regbean.getLoginID();
/* 258*/        int secretquestid = regbean.getSecretQuestionID();
/* 259*/        String secretans = regbean.getSecretAnswer();
                String password;
                con = new DBConnection().getConnection();
/* 263*/        try {
/* 263*/            con.setAutoCommit(true);
/* 264*/            PreparedStatement pst = con.prepareStatement("SELECT password FROM logindetails  WHERE loginname=? and squestionid=? and sanswer=?");
/* 265*/            pst.setString(1, loginid);
/* 266*/            pst.setInt(2, secretquestid);
/* 267*/            pst.setString(3, secretans);
/* 268*/            ResultSet rs = pst.executeQuery();
/* 269*/            if (rs.next()) {
/* 270*/                password = rs.getString(1);
                    } else {
/* 272*/                password = "";
                    }
/* 273*/            con.close();
                }
/* 275*/        catch (SQLException ex) {
/* 277*/            //LoggerManager.writeLogSevere(ex);
	ex.printStackTrace();
/* 278*/            password = "";
                }
/* 280*/        catch (Exception e) {
/* 282*/           // LoggerManager.writeLogSevere(e);
	e.printStackTrace();
/* 283*/            password = "";
                }
/* 285*/        return password;
            }

            public String recoverPasswordByOWNQuestion(Profile regbean) {
/* 290*/        String loginid = regbean.getLoginID();
/* 291*/        String ownsecretquest = regbean.getOwnSecretQuestion();
/* 292*/        String secretans = regbean.getSecretAnswer();
                String password;
                con = new DBConnection().getConnection();
/* 296*/        try {
/* 296*/            con.setAutoCommit(true);
/* 297*/            PreparedStatement pst = con.prepareStatement("SELECT password FROM logindetails  WHERE loginname=? and squestionid=(select qb.questionid from questionbase qb,logindetails ld where qb.questiondetail=? and ld.loginname=? and qb.questionid=ld.squestionid) and sanswer=?");
/* 298*/            pst.setString(1, loginid);
/* 299*/            pst.setString(2, ownsecretquest);
/* 300*/            pst.setString(3, loginid);
/* 301*/            pst.setString(4, secretans);
/* 302*/            ResultSet rs = pst.executeQuery();
/* 303*/            if (rs.next()) {
/* 304*/                password = rs.getString(1);
                    } else {
/* 306*/                password = "";
                    }
/* 307*/            con.close();
                }
/* 309*/        catch (SQLException ex) {
/* 311*/           // LoggerManager.writeLogSevere(ex);
	ex.printStackTrace();
/* 312*/            password = "";
                }
/* 314*/        catch (Exception e) {
/* 316*/            //LoggerManager.writeLogSevere(e);
	e.printStackTrace();
/* 317*/            password = "";
                }
/* 319*/        return password;
            }
}

