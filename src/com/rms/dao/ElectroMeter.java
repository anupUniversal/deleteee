package com.rms.dao;
import javax.persistence.*;

@Entity
public class ElectroMeter {

	 public ElectroMeter() {
		// TODO Auto-generated constructor stub
	}
	
	@Id	private int id;
	@Column( name = "meter_num" )   	private String mNum;
	@Column( name = "installed_on" )  	private String	deployedOn;
	@Column( name = "receipt" )  		private String receipt;
	@Column( name = "recording" )  		private String	recording;
		
}
