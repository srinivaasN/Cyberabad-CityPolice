package com.dts.ManagePrison.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ReleasedCriminalsForm extends ActionForm {

	private int criminalId;
	private String criminalname;
	private String reasonForRelease;
	private String employeename;
	private int releaseId;
	private String remarks;
	private String anyConditions;
	private int employeId;
	private String releaseDateTime;

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		return null;
	}

	public void reset(ActionMapping actionmapping1,
			HttpServletRequest httpservletrequest1) {
	}

	public int getCriminalId() {
		return criminalId;
	}

	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}

	public String getReasonForRelease() {
		return reasonForRelease;
	}

	public void setReasonForRelease(String reasonForRelease) {
		this.reasonForRelease = reasonForRelease;
	}

	public int getReleaseId() {
		return releaseId;
	}

	public void setReleaseId(int releaseId) {
		this.releaseId = releaseId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAnyConditions() {
		return anyConditions;
	}

	public void setAnyConditions(String anyConditions) {
		this.anyConditions = anyConditions;
	}

	public int getEmployeId() {
		return employeId;
	}

	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}

	public String getReleaseDateTime() {
		return releaseDateTime;
	}

	public void setReleaseDateTime(String releaseDateTime) {
		this.releaseDateTime = releaseDateTime;
	}

	public String getCriminalname() {
		return criminalname;
	}

	public void setCriminalname(String criminalname) {
		this.criminalname = criminalname;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
}
