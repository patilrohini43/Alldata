package com.bridgelabz.clinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeLabz.model.Doctor;
import com.bridgeLabz.model.Patient;
import com.bridgeLaz.addressbook.Person;

import json.bridgelabz.util.Jsonutil;

public class DataDoctorPatient {
	int choice=0;
	static	List<Doctor> doctorlist=new ArrayList<>();
	static 	List<Patient> patientlist=new ArrayList<>();

	Scanner sc=new Scanner(System.in);
	public void opeartion()
	{
	
	do
	{
		System.out.println("**********Data*********");
		System.out.println("1.Doctor Data");
		System.out.println("2.Patient Data");
	  	System.out.println("Exit");
		choice=Jsonutil.getInt();
		switch(choice)
		{
		case 1:
		      printDoctorData(doctorlist);
			  break;
			  
		case 2:
			  printPatientData(patientlist);
			  break;
			  
		case 3:
			System.out.println("Exit");
			 break;
			 default:
				 System.out.println("Please! enter correct choice");
		}
	}while(choice!=3);

}
	
	public void printDoctorData(List<Doctor> list)
	{
		System.out.println("ID       Name            Availability            Specialization");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getDoctorId()+"  "+list.get(i).getDoctorName()+"       "+list.get(i).getDoctorAvailibity()+"       "+list.get(i).getDoctorSpecalization());
      }
	}
	
	
	
	
	public void printPatientData(List<Patient> list)
	{
		System.out.println("ID    Name     Age    Mobile Number");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getPatientId()+"  "+list.get(i).getPatientName()+"       "+list.get(i).getAge()+"       "+list.get(i).getMobileNo());
      }
	}
	
	}


