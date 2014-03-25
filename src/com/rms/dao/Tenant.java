package com.rms.dao;
import javax.persistence.*;

@Entity
public class Tenant {

	public Tenant(){}
	
	public int getId() {
		return id;
	}


	public String getFname() {
		return fname;
	}


	public String getMname() {
		return mname;
	}


	public String getLname() {
		return lname;
	}


	public String getDob() {
		return dob;
	}


	public String getPermanentAddress() {
		return permanentAddress;
	}


	public String getIdCard() {
		return idCard;
	}


	public String getWorkingAs() {
		return workingAs;
	}


	public String getWorkingAddress() {
		return workingAddress;
	}


	public String getContactNum1() {
		return contactNum1;
	}


	public String getContactNum2() {
		return contactNum2;
	}


	public String getReferenceName() {
		return referenceName;
	}


	public String getReferenceContact() {
		return referenceContact;
	}


	public String getPanNum() {
		return panNum;
	}


	public String getAdhaarNum() {
		return adhaarNum;
	}


	public String getLastModified() {
		return lastModified;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public void setWorkingAs(String workingAs) {
		this.workingAs = workingAs;
	}


	public void setWorkingAddress(String workingAddress) {
		this.workingAddress = workingAddress;
	}


	public void setContactNum1(String contactNum1) {
		this.contactNum1 = contactNum1;
	}


	public void setContactNum2(String contactNum2) {
		this.contactNum2 = contactNum2;
	}


	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}


	public void setReferenceContact(String referenceContact) {
		this.referenceContact = referenceContact;
	}


	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}


	public void setAdhaarNum(String adhaarNum) {
		this.adhaarNum = adhaarNum;
	}


	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	@Id
	private int id;
	
	@Column(name="fname")				private String fname;
	@Column(name="mname")				private String mname;
	@Column(name="lname")				private String lname;
	@Column(name="dob")					private String dob;
	@Column(name="permanent_address")	private String permanentAddress;
	@Column(name="id_card")				private String idCard;
	@Column(name="working_as")			private String workingAs;
	@Column(name="working_address")		private String workingAddress;
	@Column(name="contact_num1")		private String contactNum1;
	@Column(name="contact_num2")		private String contactNum2;
	@Column(name="reference_name")		private String referenceName;
	@Column(name="reference_contact")	private String referenceContact;
	@Column(name="pan_num")				private String panNum;
	@Column(name="adhaar_num")			private String adhaarNum;
	@Column(name="last_modified")		private String lastModified;
	
	
	@Override
	public String toString() {
		return fname + " " + lname ; 
	}
	
	
	
}
