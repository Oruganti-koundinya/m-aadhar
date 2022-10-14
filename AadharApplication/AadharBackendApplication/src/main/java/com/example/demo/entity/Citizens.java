package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int citizenid;
	private String name;
	private String dob;
	private String emailid;
	private long mobileno;
	private String gender;
	private String address;
	
	public int getcitizenid() {
		return citizenid;
	}
	public void setcitizenId(int citizenid) {
		this.citizenid = citizenid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Citizens [citizenId=" + citizenid + ", name=" + name + ", dob=" + dob + ", emailid=" + emailid
				+ ",mobileno=" + mobileno + ", gender=" + gender + ", address=" + address
				+ "]";
	}
	

}
