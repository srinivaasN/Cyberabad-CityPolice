package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalMovementMasterForm extends ActionForm {

            private String reasonForMovement;
            private int criminalId;
            private String criminalActrelDate;
            private int movementId;
            private int employeId;
            private String criminalname;
            private String employeename;
            private String fromMovementDateTime;
            private String criminalExprelDate;
            private String toMovementDateTime;
            private String reasonFordelay;
            private String fromjail;
            private String tojail;


            public String getFromjail() {
/*  15*/        return fromjail;
            }

            public void setFromjail(String fromjail) {
/*  20*/        this.fromjail = fromjail;
            }

            public String getTojail() {
/*  25*/        return tojail;
            }

            public void setTojail(String tojail) {
/*  30*/        this.tojail = tojail;
            }

            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  35*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public String getReasonForMovement() {
/*  44*/        return reasonForMovement;
            }

            public void setReasonForMovement(String reasonForMovement) {
/*  49*/        this.reasonForMovement = reasonForMovement;
            }

            public int getCriminalId() {
/*  54*/        return criminalId;
            }

            public void setCriminalId(int criminalId) {
/*  59*/        this.criminalId = criminalId;
            }

            public String getCriminalActrelDate() {
/*  64*/        return criminalActrelDate;
            }

            public void setCriminalActrelDate(String criminalActrelDate) {
/*  69*/        this.criminalActrelDate = criminalActrelDate;
            }

            public int getMovementId() {
/*  74*/        return movementId;
            }

            public void setMovementId(int movementId) {
/*  79*/        this.movementId = movementId;
            }

            public int getEmployeId() {
/*  84*/        return employeId;
            }

            public void setEmployeId(int employeId) {
/*  89*/        this.employeId = employeId;
            }

            public String getFromMovementDateTime() {
/*  94*/        return fromMovementDateTime;
            }

            public void setFromMovementDateTime(String fromMovementDateTime) {
/*  99*/        this.fromMovementDateTime = fromMovementDateTime;
            }

            public String getCriminalExprelDate() {
/* 104*/        return criminalExprelDate;
            }

            public void setCriminalExprelDate(String criminalExprelDate) {
/* 109*/        this.criminalExprelDate = criminalExprelDate;
            }

            public String getToMovementDateTime() {
/* 114*/        return toMovementDateTime;
            }

            public void setToMovementDateTime(String toMovementDateTime) {
/* 119*/        this.toMovementDateTime = toMovementDateTime;
            }

            public String getReasonFordelay() {
/* 124*/        return reasonFordelay;
            }

            public void setReasonFordelay(String reasonFordelay) {
/* 129*/        this.reasonFordelay = reasonFordelay;
            }

            public String getCriminalname() {
/* 134*/        return criminalname;
            }

            public void setCriminalname(String criminalname) {
/* 139*/        this.criminalname = criminalname;
            }

            public String getEmployeename() {
/* 144*/        return employeename;
            }

            public void setEmployeename(String employeename) {
/* 149*/        this.employeename = employeename;
            }
}

