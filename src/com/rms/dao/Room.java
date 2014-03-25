 /**
  * table Room exist for this entity class, which will be used for insertion, updation and deletion of the record in database
  **/


package com.rms.dao;
import javax.persistence.*;

@Entity
public class Room {
	
	public Room(){}
	
/**
	JPA allows persistent classes to inherit from non-persistent classes, persistent classes to inherit from other persistent classes, 
	and non-persistent classes to inherit from persistent classes.
	The entity class should have a default no-argument constructor.
	The entity class should not be final.
	Persistent classes cannot inherit from certain natively-implemented system classes such as java.net.Socket and java.lang.Thread.
	If a persistent class inherits from a non-persistent class, the fields of the non-persistent super class cannot be persisted
*/
	

	@Id	private int id;
	@Column(name = "type")		private String type;
	@Column(name = "room_name")	private String roomName;
	@Column(name = "features")	private String features;
	
	
	
	
	@Override
	public String toString() {
		return roomName + " " + type + " " + features ;		
	}
	
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getRoomName() {
		return roomName;
	}
	public String getFeatures() {
		return features;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	
}
