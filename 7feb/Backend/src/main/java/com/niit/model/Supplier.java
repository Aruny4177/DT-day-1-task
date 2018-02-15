package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SupId;
	private String SupName;
	private String SupCity;
	private String SupEmail;
	private String SupPin;
	private String SupMob;
	public int getSupId() {
		return SupId;
	}
	public void setSupId(int supId) {
		SupId = supId;
	}
	public String getSupName() {
		return SupName;
	}
	public void setSupName(String supName) {
		SupName = supName;
	}
	public String getSupCity() {
		return SupCity;
	}
	public void setSupCity(String supCity) {
		SupCity = supCity;
	}
	public String getSupEmail() {
		return SupEmail;
	}
	public void setSupEmail(String supEmail) {
		SupEmail = supEmail;
	}
	public String getSupPin() {
		return SupPin;
	}
	public void setSupPin(String supPin) {
		SupPin = supPin;
	}
	public String getSupMob() {
		return SupMob;
	}
	public void setSupMob(String supMob) {
		SupMob = supMob;
	}
	
	
	

}
