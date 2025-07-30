package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalCaseRegDetailsForm extends ActionForm {

            private String convictionNo;
            private String caseNo;
            private int noOfdays;
            private int caseRegId;
            private String sectionCovered;
            private String remandNo;
            private String sentenceStatus;


            public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
/*  15*/        return null;
            }

            public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
            }

            public String getConvictionNo() {
/*  24*/        return convictionNo;
            }

            public void setConvictionNo(String convictionNo) {
/*  29*/        this.convictionNo = convictionNo;
            }

            public String getCaseNo() {
/*  34*/        return caseNo;
            }

            public void setCaseNo(String caseNo) {
/*  39*/        this.caseNo = caseNo;
            }

            public int getNoOfdays() {
/*  44*/        return noOfdays;
            }

            public void setNoOfdays(int noOfdays) {
/*  49*/        this.noOfdays = noOfdays;
            }

            public int getCaseRegId() {
/*  54*/        return caseRegId;
            }

            public void setCaseRegId(int caseRegId) {
/*  59*/        this.caseRegId = caseRegId;
            }

            public String getSectionCovered() {
/*  64*/        return sectionCovered;
            }

            public void setSectionCovered(String sectionCovered) {
/*  69*/        this.sectionCovered = sectionCovered;
            }

            public String getRemandNo() {
/*  74*/        return remandNo;
            }

            public void setRemandNo(String remandNo) {
/*  79*/        this.remandNo = remandNo;
            }

            public String getSentenceStatus() {
/*  84*/        return sentenceStatus;
            }

            public void setSentenceStatus(String sentenceStatus) {
/*  89*/        this.sentenceStatus = sentenceStatus;
            }
}

