package com.bridgeLabz.model;

public class Patient {
	
	String patientName;
	int patienId;
	String mobileNo;
	int age;
	
	
	public Patient(String patientName,int patienId,String mobileNo,int age)
	{
		this.patientName=patientName;
		this.patienId=patienId;
		this.mobileNo=mobileNo;
		this.age=age;
	
	}
	
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatienId() {
		return patienId;
	}
	public void setPatienId(int patienId) {
		this.patienId = patienId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
