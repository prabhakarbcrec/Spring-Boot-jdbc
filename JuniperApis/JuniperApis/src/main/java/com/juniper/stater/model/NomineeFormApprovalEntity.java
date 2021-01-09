package com.juniper.stater.model;

import java.sql.Date;

public class NomineeFormApprovalEntity {
	private int formid;
	private Date data_time;
	private String nominee;
	private String nominator;
	private String nomineeemail;
	private String awardcode;
	private int point;
	private int approvallevel;
	private String approval;

	public NomineeFormApprovalEntity() {

	}

	public NomineeFormApprovalEntity(int formid, Date data_time, String nominee, String nominator, String nomineeemail,
			String awardcode, int point, int approvallevel, String approval) {
		this.formid = formid;
		this.data_time = data_time;
		this.nominee = nominee;
		this.nominator = nominator;
		this.nomineeemail = nomineeemail;
		this.awardcode = awardcode;
		this.point = point;
		this.approvallevel = approvallevel;
		this.approval = approval;
	}

	public int getFormid() {
		return formid;
	}

	public void setFormid(int formid) {
		this.formid = formid;
	}

	public Date getData_time() {
		return data_time;
	}

	public void setData_time(Date data_time) {
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

	public String getAwardcode() {
		return awardcode;
	}

	public void setAwardcode(String awardcode) {
		this.awardcode = awardcode;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getApprovallevel() {
		return approvallevel;
	}

	public void setApprovallevel(int approvallevel) {
		this.approvallevel = approvallevel;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}
}
