package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalDutyMasterForm extends ActionForm {

            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			private String placeOfDuty;
            private int criminalDutyId;
            private String criminalname;
            private String formTime;
            private String dayOfDuty;
            private String toTime;


            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public String getPlaceOfDuty() {
/*  24*/        return placeOfDuty;
            }

            public void setPlaceOfDuty(String placeOfDuty) {
/*  29*/        this.placeOfDuty = placeOfDuty;
            }

            public int getCriminalDutyId() {
/*  34*/        return criminalDutyId;
            }

            public void setCriminalDutyId(int criminalDutyId) {
/*  39*/        this.criminalDutyId = criminalDutyId;
            }

            public String getFormTime() {
/*  44*/        return formTime;
            }

            public void setFormTime(String formTime) {
/*  49*/        this.formTime = formTime;
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

            public String getCriminalname() {
/*  74*/        return criminalname;
            }

            public void setCriminalname(String criminalname) {
/*  79*/        this.criminalname = criminalname;
            }
}

