package com.dts.ManagePrison.model;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalCaseRegisterForm extends ActionForm {

            private String caseno;
            private String remandno;
            private String convectionno;
            private String sectioncovered;
            private String crimeperiod;
            private int criminalId;
            private String criminalname;
            private String caseRegDate;
            private String firNo;
            private String firDate;
            private int caseRegId;
            private String inspectorName;
            private String policeStationName;


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

            public String getCaseRegDate() {
/*  34*/        return caseRegDate;
            }

            public void setCaseRegDate(String caseRegDate) {
/*  39*/        this.caseRegDate = caseRegDate;
            }

            public String getFirNo() {
/*  44*/        return firNo;
            }

            public void setFirNo(String firNo) {
/*  49*/        this.firNo = firNo;
            }

            public String getFirDate() {
/*  54*/        return firDate;
            }

            public void setFirDate(String firDate) {
/*  59*/        this.firDate = firDate;
            }

            public int getCaseRegId() {
/*  64*/        return caseRegId;
            }

            public void setCaseRegId(int caseRegId) {
/*  69*/        this.caseRegId = caseRegId;
            }

            public String getInspectorName() {
/*  74*/        return inspectorName;
            }

            public void setInspectorName(String inspectorName) {
/*  79*/        this.inspectorName = inspectorName;
            }

            public String getPoliceStationName() {
/*  84*/        return policeStationName;
            }

            public void setPoliceStationName(String policeStationName) {
/*  89*/        this.policeStationName = policeStationName;
            }

            public String getCaseno() {
/*  94*/        return caseno;
            }

            public void setCaseno(String caseno) {
/*  99*/        this.caseno = caseno;
            }

            public String getRemandno() {
/* 104*/        return remandno;
            }

            public void setRemandno(String remandno) {
/* 109*/        this.remandno = remandno;
            }

            public String getConvectionno() {
/* 114*/        return convectionno;
            }

            public void setConvectionno(String convectionno) {
/* 119*/        this.convectionno = convectionno;
            }

            public String getSectioncovered() {
/* 124*/        return sectioncovered;
            }

            public void setSectioncovered(String sectioncovered) {
/* 129*/        this.sectioncovered = sectioncovered;
            }

            public String getCrimeperiod() {
/* 134*/        return crimeperiod;
            }

            public void setCrimeperiod(String crimeperiod) {
/* 139*/        this.crimeperiod = crimeperiod;
            }

            public String getCriminalname() {
/* 144*/        return criminalname;
            }

            public void setCriminalname(String criminalname) {
/* 149*/        this.criminalname = criminalname;
            }
}

