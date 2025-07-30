package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalDutyDetails extends ActionForm {

            private String remarks;
            private int criminaldutyid;
            private String criminalname;


            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public String getRemarks() {
/*  24*/        return remarks;
            }

            public void setRemarks(String remarks) {
/*  29*/        this.remarks = remarks;
            }

            public int getCriminaldutyid() {
/*  34*/        return criminaldutyid;
            }

            public void setCriminaldutyid(int criminaldutyid) {
/*  39*/        this.criminaldutyid = criminaldutyid;
            }

            public String getCriminalname() {
/*  44*/        return criminalname;
            }

            public void setCriminalname(String criminalname) {
/*  49*/        this.criminalname = criminalname;
            }
}

