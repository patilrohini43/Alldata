package com.bridgeLabz.model;

public class Appointment {
	
	String doctorName;
	int doctorId;
	String patientName;
	int patientId;
	String Availibility;
    String patientPhone;
    
    
    public Appointment(String doctorName,int doctorId,String patientName,int patientId,String patientPhone,String Availibility)
	{
		this.doctorName=doctorName;
		this.doctorId=doctorId;
		this.patientName=patientName;
		this.patientId=patientId;
		this.Availibility=Availibility;
		this.patientPhone=patientPhone;
   }
    
    
    
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getAvailibility() {
		return Availibility;
	}
	public void setAvailibility(String availibility) {
		Availibility = availibility;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
    
    
    
    
    
    
    
    
    
    

}
