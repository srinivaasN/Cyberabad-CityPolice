package com.dts.ManagePrison.model;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class EmployeDutyMasterForm extends ActionForm {

            private String fromTime;
            private String placeOfDuty;
            private int employeDutyId;
            private String dayOfDuty;
            private String toTime;
            private String employeename;


            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public String getFromTime() {
/*  24*/        return fromTime;
            }

            public void setFromTime(String fromTime) {
/*  29*/        this.fromTime = fromTime;
            }

            public String getPlaceOfDuty() {
/*  34*/        return placeOfDuty;
            }

            public void setPlaceOfDuty(String placeOfDuty) {
/*  39*/        this.placeOfDuty = placeOfDuty;
            }

            public int getEmployeDutyId() {
/*  44*/        return employeDutyId;
            }

            public void setEmployeDutyId(int employeDutyId) {
/*  49*/        this.employeDutyId = employeDutyId;
            }

            public String getDayOfDuty() {
/*  54*/        return dayOfDuty;
            }

            public void setDayOfDuty(String dayOfDuty) {
/*  59*/        this.dayOfDuty = dayOfDuty;
            }

            public String getToTime() {
/*  64*/        return toTime;
            }

            public void setToTime(String toTime) {
/*  69*/        this.toTime = toTime;
            }

            public String getEmployeename() {
/*  74*/        return employeename;
            }

            public void setEmployeename(String employeename) {
/*  79*/        this.employeename = employeename;
            }
}

