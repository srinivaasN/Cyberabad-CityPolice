package com.dts.ManagePrison.model;

import java.sql.Blob;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CriminalMasterForm extends ActionForm {

	private int noOfyears;
	private String expectedreleasedate;
	private String crimeperiod;
	private String dor;
	private String loginname;
	private String courtPlace;
	private String lawyerName;
	private String expectedRelDate;
	private String criminalLastName;
	private int criminalRegEmpId;
	private String crimeNo;
	private String convictionNo;
	private int criminalId;
	private String criminalMiddleName;
	private String courtName;
	private String dob;
	private Blob criminalPhoto;
	private String criminalFristName;
	
	
	public void setCriminalPhoto(Blob criminalPhoto) {
		this.criminalPhoto = criminalPhoto;
	}
	
	
	public Blob getCriminalPhoto() {
		return criminalPhoto;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		/* 15 */ return null;
	}

	public void reset(ActionMapping actionmapping1, HttpServletRequest httpservletrequest1) {
	}

	public int getNoOfyears() {
		/* 24 */ return noOfyears;
	}

	public void setNoOfyears(int noOfyears) {
		/* 29 */ this.noOfyears = noOfyears;
	}

	public String getDor() {
		/* 34 */ return dor;
	}

	public void setDor(String dor) {
		/* 39 */ this.dor = dor;
	}

	public String getCourtPlace() {
		/* 44 */ return courtPlace;
	}

	public void setCourtPlace(String courtPlace) {
		/* 49 */ this.courtPlace = courtPlace;
	}

	public String getLawyerName() {
		/* 54 */ return lawyerName;
	}

	public void setLawyerName(String lawyerName) {
		/* 59 */ this.lawyerName = lawyerName;
	}

	public String getExpectedRelDate() {
		/* 64 */ return expectedRelDate;
	}

	public void setExpectedRelDate(String expectedRelDate) {
		/* 69 */ this.expectedRelDate = expectedRelDate;
	}

	public String getCriminalLastName() {
		/* 74 */ return criminalLastName;
	}

	public void setCriminalLastName(String criminalLastName) {
		/* 79 */ this.criminalLastName = criminalLastName;
	}

	public int getCriminalRegEmpId() {
		/* 84 */ return criminalRegEmpId;
	}

	public void setCriminalRegEmpId(int criminalRegEmpId) {
		/* 89 */ this.criminalRegEmpId = criminalRegEmpId;
	}

	public String getCrimeNo() {
		/* 94 */ return crimeNo;
	}

	public void setCrimeNo(String crimeNo) {
		/* 99 */ this.crimeNo = crimeNo;
	}

	public String getConvictionNo() {
		/* 104 */ return convictionNo;
	}

	public void setConvictionNo(String convictionNo) {
		/* 109 */ this.convictionNo = convictionNo;
	}

	public int getCriminalId() {
		/* 114 */ return criminalId;
	}

	public void setCriminalId(int criminalId) {
		/* 119 */ this.criminalId = criminalId;
	}

	public String getCriminalMiddleName() {
		/* 124 */ return criminalMiddleName;
	}

	public void setCriminalMiddleName(String criminalMiddleName) {
		/* 129 */ this.criminalMiddleName = criminalMiddleName;
	}

	public String getCourtName() {
		/* 134 */ return courtName;
	}

	public void setCourtName(String courtName) {
		/* 139 */ this.courtName = courtName;
	}

	public String getDob() {
		/* 144 */ return dob;
	}

	public void setDob(String dob) {
		/* 149 */ this.dob = dob;
	}

	/*
	 * public String getCriminalPhoto() { 154 return criminalPhoto; }
	 * 
	 * public void setCriminalPhoto(String criminalPhoto) { 159 this.criminalPhoto =
	 * criminalPhoto; //this.criminalPhoto =
	 * "C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg"; }
	 */

	public String getCriminalFristName() {
		/* 164 */ return criminalFristName;
	}

	public void setCriminalFristName(String criminalFristName) {
		/* 169 */ this.criminalFristName = criminalFristName;
	}

	public String getCrimeperiod() {
		/* 174 */ return crimeperiod;
	}

	public void setCrimeperiod(String crimeperiod) {
		/* 179 */ this.crimeperiod = crimeperiod;
	}

	public String getLoginname() {
		/* 184 */ return loginname;
	}

	public void setLoginname(String loginname) {
		/* 189 */ this.loginname = loginname;
	}

	public String getExpectedreleasedate() {
		/* 194 */ return expectedreleasedate;
	}

	public void setExpectedreleasedate(String expectedreleasedate) {
		/* 199 */ this.expectedreleasedate = expectedreleasedate;
	}
}
