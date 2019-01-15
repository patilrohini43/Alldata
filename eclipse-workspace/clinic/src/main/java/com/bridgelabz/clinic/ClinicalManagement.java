package com.bridgelabz.clinic;

import java.util.Scanner;

import com.bridgelabz.clinic.DoctorPatient;

import com.bridelabz.util.Jsonutil;

public class ClinicalManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DoctorPatient doctorpatient=new DoctorPatient();
		DataDoctorPatient data=new DataDoctorPatient();
		SearchImpl search=new SearchImpl();
		
		int choice=0;
		System.out.println("**************Welcome To Clinical Managament****************");
		
		do
		{
			System.out.println("1.Operation of Doctor Patient Appointment");
			System.out.println("2.Searching");
			System.out.println("3.Show Data");
			System.out.println("4.Exit");
		    choice=Jsonutil.getInt();
			switch(choice)
			{
			case 1:
				   doctorpatient.Operation1();
				   break;
				   
				   
			case 2:
				  search.Opeartion();
				   break;
				   
				   
			case 3:
				data.opeartion();
				   break;
				   
				   
				   
			case 4:
				System.out.println("Exit");
				   
				  break;
				  default:
					  System.out.println("Please Enter Correct Choice");
					  
			}
			
		}while(choice!=4);

	}
}
