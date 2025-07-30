package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ParolForm extends ActionForm {

            private String reasonForPayrole;
            private String payroleDateFrom;
            private String payroledate;
            private String criminalName;
            private String payRoleDateTo;
            private String remarks;
            private int payroleid;
            private String employeename;


            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public String getReasonForPayrole() {
/*  24*/        return reasonForPayrole;
            }

            public void setReasonForPayrole(String reasonForPayrole) {
/*  29*/        this.reasonForPayrole = reasonForPayrole;
            }

            public String getPayroleDateFrom() {
/*  34*/        return payroleDateFrom;
            }

            public void setPayroleDateFrom(String payroleDateFrom) {
/*  39*/        this.payroleDateFrom = payroleDateFrom;
            }

            public String getPayroledate() {
/*  44*/        return payroledate;
            }

            public void setPayroledate(String payroledate) {
/*  49*/        this.payroledate = payroledate;
            }

            public String getCriminalName() {
/*  54*/        return criminalName;
            }

            public void setCriminalName(String criminalName) {
/*  59*/        this.criminalName = criminalName;
            }

            public String getPayRoleDateTo() {
/*  64*/        return payRoleDateTo;
            }

            public void setPayRoleDateTo(String payRoleDateTo) {
/*  69*/        this.payRoleDateTo = payRoleDateTo;
            }

            public String getRemarks() {
/*  74*/        return remarks;
            }

            public void setRemarks(String remarks) {
/*  79*/        this.remarks = remarks;
            }

            public int getPayroleid() {
/*  84*/        return payroleid;
            }

            public void setPayroleid(int payroleid) {
/*  89*/        this.payroleid = payroleid;
            }

            public String getEmployeename() {
/*  94*/        return employeename;
            }

            public void setEmployeename(String employeename) {
/*  99*/        this.employeename = employeename;
            }
}

