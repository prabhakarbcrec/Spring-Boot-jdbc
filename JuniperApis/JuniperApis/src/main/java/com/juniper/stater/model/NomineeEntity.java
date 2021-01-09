package com.juniper.stater.model;

import java.sql.Date;

public class NomineeEntity {
	private int formId;
	private Date data_time;
	private String nominee;
	private String nominator;
	private String nomineeemail;
	private String awardcode;
	private int point;
	private String formstatus;
	private String typeteamorindv;
	private int approvallevel;
	private int whichstageapprovalnow;
	private String approval;

	public NomineeEntity() {

	}

	public NomineeEntity(int formId, Date data_time, String nominee, String nominator, String nomineeemail,
			String awardcode, int point, String formstatus, String typeteamorindv, int approvallevel,
			int whichstageapprovalnow, String approval) {
		// super();
		this.formId = formId;
		this.data_time = data_time;
		this.nominee = nominee;
		this.nominator = nominator;
		this.nomineeemail = nomineeemail;
		this.awardcode = awardcode;
		this.point = point;
		this.formstatus = formstatus;
		this.typeteamorindv = typeteamorindv;
		this.approvallevel = approvallevel;
		this.whichstageapprovalnow = whichstageapprovalnow;
		this.approval = approval;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Date getDate_time() {
		return data_time;
	}

	public void setDate_time(Date data_time) {
		this.data_time = data_time;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public String getNominator() {
		return nominator;
	}

	public void setNominator(String nominator) {
		this.nominator = nominator;
	}

	public String getNomineeemail() {
		return nomineeemail;
	}

	public void setNomineeemail(String nomineeemail) {
		this.nomineeemail = nomineeemail;
	}

	public String getAwarCode() {
		return awardcode;
	}

	public void setAwarCode(String awardcode) {
		this.awardcode = awardcode;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getFormstatus() {
		return formstatus;
	}

	public void setFormstatus(String formstatus) {
		this.formstatus = formstatus;
	}

	public String getTypeteamorindv() {
		return typeteamorindv;
	}

	public void setTypeteamorindv(String typeteamorindv) {
		this.typeteamorindv = typeteamorindv;
	}

	public int getApprovallevel() {
		return approvallevel;
	}

	public void setApprovallevel(int approvallevel) {
		this.approvallevel = approvallevel;
	}

	public int getWhichstageapprovalnow() {
		return whichstageapprovalnow;
	}

	public void setWhichstageapprovalnow(int whichstageapprovalnow) {
		this.whichstageapprovalnow = whichstageapprovalnow;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

}
