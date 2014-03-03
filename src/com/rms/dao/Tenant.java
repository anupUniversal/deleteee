package com.rms.dao;
import javax.persistence.*;

@Entity
public class Tenant {

	public Tenant(){}
	
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
	
	
	
	
}
