package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class NominalRoleMasterForm extends ActionForm {

            private int criminalId;
            private String cellno;
            private String balanceNo;
            private int employeRegId;
            private String roleDateTime;
            private int nominalRollId;
            private String criminalname;
            private String employeename;


            public String getEmployeename() {
/*  15*/        return employeename;
            }

            public void setEmployeename(String employeename) {
/*  20*/        this.employeename = employeename;
            }

            public String getCriminalname() {
/*  25*/        return criminalname;
            }

            public void setCriminalname(String criminalname) {
/*  30*/        this.criminalname = criminalname;
            }

            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  35*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public int getCriminalId() {
/*  44*/        return criminalId;
            }

            public void setCriminalId(int criminalId) {
/*  49*/        this.criminalId = criminalId;
            }

            public String getCellno() {
/*  54*/        return cellno;
            }

            public void setCellno(String cellno) {
/*  59*/        this.cellno = cellno;
            }

            public String getBalanceNo() {
/*  64*/        return balanceNo;
            }

            public void setBalanceNo(String balanceNo) {
/*  69*/        this.balanceNo = balanceNo;
            }

            public int getEmployeRegId() {
/*  74*/        return employeRegId;
            }

            public void setEmployeRegId(int employeRegId) {
/*  79*/        this.employeRegId = employeRegId;
            }

            public String getRoleDateTime() {
/*  84*/        return roleDateTime;
            }

            public void setRoleDateTime(String roleDateTime) {
/*  89*/        this.roleDateTime = roleDateTime;
            }

            public int getNominalRollId() {
/*  94*/        return nominalRollId;
            }

            public void setNominalRollId(int nominalRollId) {
/*  99*/        this.nominalRollId = nominalRollId;
            }
}

