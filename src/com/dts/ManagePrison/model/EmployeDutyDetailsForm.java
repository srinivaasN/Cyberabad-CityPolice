package com.dts.ManagePrison.model;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class EmployeDutyDetailsForm extends ActionForm {

    private int employeDutyId;
    private String employeename;
    private String remarks;
    private int employeId;


    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
    }

    public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
    }

    public int getEmployeDutyId() {
/*  24*/        return employeDutyId;
    }

    public void setEmployeDutyId(int employeDutyId) {
/*  29*/        this.employeDutyId = employeDutyId;
    }

    public String getRemarks() {
/*  34*/        return remarks;
    }

    public void setRemarks(String remarks) {
/*  39*/        this.remarks = remarks;
    }

    public int getEmployeId() {
/*  44*/        return employeId;
    }

    public void setEmployeId(int employeId) {
/*  49*/        this.employeId = employeId;
    }

    public String getEmployeename() {
/*  54*/        return employeename;
    }

    public void setEmployeename(String employeename) {
/*  59*/        this.employeename = employeename;
    }
}

