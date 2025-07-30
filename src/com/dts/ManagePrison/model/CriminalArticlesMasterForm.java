package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalArticlesMasterForm extends ActionForm {

            private String criminalnamel;
            private int criminalId;
            private String articleName;
            private int articleId;
            private int articleCost;
            private int employeId;
            private String articleImage;


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

            public String getArticleName() {
/*  34*/        return articleName;
            }

            public void setArticleName(String articleName) {
/*  39*/        this.articleName = articleName;
            }

            public int getArticleId() {
/*  44*/        return articleId;
            }

            public void setArticleId(int articleId) {
/*  49*/        this.articleId = articleId;
            }

            public int getArticleCost() {
/*  54*/        return articleCost;
            }

            public void setArticleCost(int articleCost) {
/*  59*/        this.articleCost = articleCost;
            }

            public int getEmployeId() {
/*  64*/        return employeId;
            }

            public void setEmployeId(int employeId) {
/*  69*/        this.employeId = employeId;
            }

            public String getArticleImage() {
/*  74*/        return articleImage;
            }

            public void setArticleImage(String articleImage) {
/*  79*/        this.articleImage = articleImage;
            }

            public String getCriminalnamel() {
/*  84*/        return criminalnamel;
            }

            public void setCriminalnamel(String criminalnamel) {
/*  89*/        this.criminalnamel = criminalnamel;
            }
}

