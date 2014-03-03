package com.rms.dao;
import javax.persistence.*;

@Entity
public class Agreement {

	public Agreement() {
		// TODO Auto-generated constructor stub
	}
	
	@Id	private int id;
	
	@Column(  name="room_id" )     		private String  roomId    ;   
	@Column(  name="tenant_id" )		private String  tenantId    ;  
	@Column(  name="electro_id" )		private String  electroId    ;
	@Column(  name="issue_on" )			private String  issueOn    ;
	@Column(  name="electro_rates" )	private String  electroRates    ;
	@Column(  name="deposit" )			private String  deposit    ;
	@Column(  name="exit_date" )		private String  exitDate    ;
	@Column(  name="exit_remarks" ) 	private String  exitRemarks    ;
	@Column(  name="agreement_letter" )	private String  agreementLetter    ;
	@Column(  name="last_modified" )	private String  lastModified    ;
	@Column(  name="room_rates" )		private String  roomRates    ;
	@Column(  name="status" )			private String  status    ;
	








     




}
