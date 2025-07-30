package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalCourtMasterForm extends ActionForm {

            private int criminalId;
            private String crimnalname;
            private String employeename;
            private String hearingDate;
            private int courtId;
            private int employeId;
            private String courtName;
            private String nextHearingDate;


            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public int getCriminalId() {
/*  24*/        return criminalId;
            }

            public void setCriminalId(int criminalId) {
/*  29*/        this.criminalId = criminalId;
            }

            public String getHearingDate() {
/*  34*/        return hearingDate;
            }

            public void setHearingDate(String hearingDate) {
/*  39*/        this.hearingDate = hearingDate;
            }

            public int getCourtId() {
/*  44*/        return courtId;
            }

            public void setCourtId(int courtId) {
/*  49*/        this.courtId = courtId;
            }

            public int getEmployeId() {
/*  54*/        return employeId;
            }

            public void setEmployeId(int employeId) {
/*  59*/        this.employeId = employeId;
            }

            public String getCourtName() {
/*  64*/        return courtName;
            }

            public void setCourtName(String courtName) {
/*  69*/        this.courtName = courtName;
            }

            public String getNextHearingDate() {
/*  74*/        return nextHearingDate;
            }

            public void setNextHearingDate(String nextHearingDate) {
/*  79*/        this.nextHearingDate = nextHearingDate;
            }

            public String getCrimnalname() {
/*  84*/        return crimnalname;
            }

            public void setCrimnalname(String crimnalname) {
/*  89*/        this.crimnalname = crimnalname;
            }

            public String getEmployeename() {
/*  94*/        return employeename;
            }

            public void setEmployeename(String employeename) {
/*  99*/        this.employeename = employeename;
            }
}

