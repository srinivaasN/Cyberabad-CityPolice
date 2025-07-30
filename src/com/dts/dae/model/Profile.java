package com.dts.dae.model;

import java.sql.Date;
import org.apache.struts.action.ActionForm;

public class Profile extends ActionForm {

            private int secretqid;
            private String id;
            private String branchaddress;
            private String password;
            private String newpassword;
            private String firstname;
            private String lastname;
            private String logintype;
            private int status;
            private String date;
            private int roleid;
            private int flogin;
            private String timezone;
            private String city;
            private String hno;
            private String street;
            private String phoneNo;
            private String email;
            private String bdate;
            private Date birthDate1;
            private String state;
            private String country;
            private String pincode;
            private String locale;
            private String secretqans;
            private String ownsecretq;
            private String passwordmoddate;
            private String profilemoddate;
            private int bankaccountno;
            private int accountInitialBalance;
            private int accountActivebalance;
            private String accountOpeningDate;
            private int branchid;

            public int getBankaccountno() {
/*  11*/        return bankaccountno;
            }

            public void setBankaccountno(int bankaccountno) {
/*  16*/        this.bankaccountno = bankaccountno;
            }

            public int getAccountInitialBalance() {
/*  21*/        return accountInitialBalance;
            }

            public void setAccountInitialBalance(int accountInitialBalance) {
/*  26*/        this.accountInitialBalance = accountInitialBalance;
            }

            public int getAccountActivebalance() {
/*  31*/        return accountActivebalance;
            }

            public void setAccountActivebalance(int accountActivebalance) {
/*  36*/        this.accountActivebalance = accountActivebalance;
            }

            public String getAccountOpeningDate() {
/*  41*/        return accountOpeningDate;
            }

            public void setAccountOpeningDate(String accountOpeningDate) {
/*  46*/        this.accountOpeningDate = accountOpeningDate;
            }

            public int getBranchid() {
/*  51*/        return branchid;
            }

            public void setBranchid(int branchid) {
/*  56*/        this.branchid = branchid;
            }


            public void setLoginID(String id) {
/*  65*/        this.id = id;
            }

            public void setPassword(String password) {
/*  70*/        this.password = password;
            }

            public void setNewPassword(String newpassword) {
/*  75*/        this.newpassword = newpassword;
            }

            public void setFirstName(String firstname) {
/*  80*/        this.firstname = firstname;
            }

            public void setLastName(String lastname) {
/*  85*/        this.lastname = lastname;
            }

            public void setLoginType(String logintype) {
/*  90*/        this.logintype = logintype;
            }

            public void setStatus(int status) {
/*  95*/        this.status = status;
            }

            public void setRegDate(String date) {
/* 100*/        this.date = date;
            }

            public void setSecretQuestionID(int secretqid) {
/* 105*/        this.secretqid = secretqid;
            }

            public void setOwnSecretQuestion(String ownsecretq) {
/* 110*/        this.ownsecretq = ownsecretq;
            }

            public void setSecretAnswer(String secretqans) {
/* 115*/        this.secretqans = secretqans;
            }

            public void setFirstLogin(int flogin) {
/* 120*/        this.flogin = flogin;
            }

            public void setRoleId(int roleid) {
/* 125*/        this.roleid = roleid;
            }

            public void setBirthDate(String bdate) {
/* 130*/        this.bdate = bdate;
            }

            public void setCity(String city) {
/* 135*/        this.city = city;
            }

            public void setState(String state) {
/* 140*/        this.state = state;
            }

            public void setCountry(String country) {
/* 145*/        this.country = country;
            }

            public void setLocale(String locale) {
/* 150*/        this.locale = locale;
            }

            public void setTimeZone(String timezone) {
/* 155*/        this.timezone = timezone;
            }

            public void setPasswordModifiedDate(String passwordmoddate) {
/* 160*/        this.passwordmoddate = passwordmoddate;
            }

            public void setProfileModifiedDate(String profilemoddate) {
/* 165*/        this.profilemoddate = profilemoddate;
            }

            public String getLoginID() {
/* 170*/        return id;
            }

            public String getPassword() {
/* 175*/        return password;
            }

            public String getNewPassword() {
/* 180*/        return newpassword;
            }

            public String getFirstName() {
/* 185*/        return firstname;
            }

            public String getLastName() {
/* 190*/        return lastname;
            }

            public String getLoginType() {
/* 195*/        return logintype;
            }

            public int getStatus() {
/* 200*/        return status;
            }

            public String getRegDate() {
/* 205*/        return date;
            }

            public int getSecretQuestionID() {
/* 210*/        return secretqid;
            }

            public String getOwnSecretQuestion() {
/* 215*/        return ownsecretq;
            }

            public String getSecretAnswer() {
/* 220*/        return secretqans;
            }

            public int getFirstLogin() {
/* 225*/        return flogin;
            }

            public int getRoleId() {
/* 230*/        return roleid;
            }

            public String getBirthDate() {
/* 235*/        return bdate;
            }

            public String getCity() {
/* 240*/        return city;
            }

            public String getState() {
/* 245*/        return state;
            }

            public String getCountry() {
/* 250*/        return country;
            }

            public String getLocale() {
/* 255*/        return locale;
            }

            public String getTimeZone() {
/* 260*/        return timezone;
            }

            public String getPasswordModifiedDate() {
/* 265*/        return passwordmoddate;
            }

            public String getProfileModifiedDate() {
/* 270*/        return profilemoddate;
            }

            public Date getBirthDate1() {
/* 275*/        return birthDate1;
            }

            public void setBirthDate1(Date birthDate1) {
/* 280*/        this.birthDate1 = birthDate1;
            }

            public String getHno() {
/* 285*/        return hno;
            }

            public void setHno(String hno) {
/* 290*/        this.hno = hno;
            }

            public String getStreet() {
/* 295*/        return street;
            }

            public void setStreet(String street) {
/* 300*/        this.street = street;
            }

            public String getPhoneNo() {
/* 305*/        return phoneNo;
            }

            public void setPhoneNo(String phoneNo) {
/* 310*/        this.phoneNo = phoneNo;
            }

            public String getEmail() {
/* 315*/        return email;
            }

            public void setEmail(String email) {
/* 320*/        this.email = email;
            }

            public String getPincode() {
/* 325*/        return pincode;
            }

            public void setPincode(String pincode) {
/* 330*/        this.pincode = pincode;
            }

            public int getSecretqid() {
/* 335*/        return secretqid;
            }

            public void setSecretqid(int secretqid) {
/* 340*/        this.secretqid = secretqid;
            }

            public String getId() {
/* 345*/        return id;
            }

            public void setId(String id) {
/* 350*/        this.id = id;
            }

            public String getNewpassword() {
/* 355*/        return newpassword;
            }

            public void setNewpassword(String newpassword) {
/* 360*/        this.newpassword = newpassword;
            }

            public String getFirstname() {
/* 365*/        return firstname;
            }

            public void setFirstname(String firstname) {
/* 370*/        this.firstname = firstname;
            }

            public String getLastname() {
/* 375*/        return lastname;
            }

            public void setLastname(String lastname) {
/* 380*/        this.lastname = lastname;
            }

            public String getLogintype() {
/* 385*/        return logintype;
            }

            public void setLogintype(String logintype) {
/* 390*/        this.logintype = logintype;
            }

            public String getDate() {
/* 395*/        return date;
            }

            public void setDate(String date) {
/* 400*/        this.date = date;
            }

            public int getRoleid() {
/* 405*/        return roleid;
            }

            public void setRoleid(int roleid) {
/* 410*/        this.roleid = roleid;
            }

            public int getFlogin() {
/* 415*/        return flogin;
            }

            public void setFlogin(int flogin) {
/* 420*/        this.flogin = flogin;
            }

            public String getTimezone() {
/* 425*/        return timezone;
            }

            public void setTimezone(String timezone) {
/* 430*/        this.timezone = timezone;
            }

            public String getBdate() {
/* 435*/        return bdate;
            }

            public void setBdate(String bdate) {
/* 440*/        this.bdate = bdate;
            }

            public String getSecretqans() {
/* 445*/        return secretqans;
            }

            public void setSecretqans(String secretqans) {
/* 450*/        this.secretqans = secretqans;
            }

            public String getOwnsecretq() {
/* 455*/        return ownsecretq;
            }

            public void setOwnsecretq(String ownsecretq) {
/* 460*/        this.ownsecretq = ownsecretq;
            }

            public String getPasswordmoddate() {
/* 465*/        return passwordmoddate;
            }

            public void setPasswordmoddate(String passwordmoddate) {
/* 470*/        this.passwordmoddate = passwordmoddate;
            }

            public String getProfilemoddate() {
/* 475*/        return profilemoddate;
            }

            public void setProfilemoddate(String profilemoddate) {
/* 480*/        this.profilemoddate = profilemoddate;
            }

            public String getBranchaddress() {
/* 485*/        return branchaddress;
            }

            public void setBranchaddress(String branchaddress) {
/* 490*/        this.branchaddress = branchaddress;
            }
}

