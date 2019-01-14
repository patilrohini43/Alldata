package com.bridgelabz.clinic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgeLabz.model.*;
import com.bridgeLaz.addressbook.Person;

public class DoctorPatient {
	
	Scanner scanner=new Scanner(System.in);
	DoctorPatient object=new DoctorPatient();
		Doctor doctor=new Doctor();
		
static	List<Doctor> doctorlist=new ArrayList<>();
static 	List<Patient> patientlist=new ArrayList<>();
	
	
	
	public void Operation()
	{
		int choice=0;
		do {
		System.out.println("1.Add_Dcotor");
		System.out.println("2.Edit_Doctor");
		System.out.println("3.Delete_Doctor");
		System.out.println("4.Add_Patient");
		System.out.println("5.Edit_Patient");
		System.out.println("6.Delete_Patient");
		System.out.println("7.Save");
		System.out.println("8.AppointMent");
		System.out.println("7.Exit");
	   choice=scanner.nextInt();
		switch(choice)
		{
		case 1: 
			addDoctor();
			      break;
			      
			      
		case 2:
			editDoctor();
			      break;
			      
			      
			      
	    case 3:
	    	deleteDoctor();   
				   break;
		
					    
	    case 4:
							   
				   break;
				    
				    
				      
	    case 5:
						   
			     break;
						      
						      
	    case 6:
						   
			   break;
						      
	     case 7:
	    	 System.out.println("Exiting");
						   
			    break;
			    default:
			    	 System.out.println("Wrong Choice! please enter correct choice");
						      
			      
			      
			      
		}
		
	}while(choice!=7);
	}
	
	
	
	
	
	
	public void addDoctor()
	{
		try {
		System.out.println("Enter Doctor Id");
		String doctorId1=scanner.nextLine();
		doctor.setDoctorId(doctorId1);
		
		System.out.println("Enter Doctor Name");
		String doctorName1=scanner.nextLine();
		doctor.setDoctorName(doctorName1);
		
		System.out.println("Enter Time of Doctor Availability");
		String doctorAvailibity1=scanner.nextLine();
		doctor.setDoctorAvailibity(doctorAvailibity1);
		
		System.out.println("Enter Doctor in Specialization");
		String doctorSpecalization1=scanner.nextLine();
		doctor.setDoctorSpecalization(doctorSpecalization1);
	
	   Doctor temp=new Doctor(doctorId1, doctorSpecalization1, doctorSpecalization1, doctorSpecalization1); {
		   doctorlist.add(temp);
	   }
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		System.out.println("Records Added");
		
	}
	
	
	public void editDoctor()
	{
		
		System.out.println("Enter Doctor Id You Want Editied");
		String dId=scanner.nextLine();
		
		for(int i=0;i<doctorlist.size();i++)
		{
			Doctor temp=doctorlist.get(i);
			
			if(temp.getDoctorName().equals(dId))
			{
				int choice1=0;
			
				do {
			
				System.out.println("1.DoctorId");
				System.out.println("2.Doctor Name");
				System.out.println("3.Doctor Availibility");
				System.out.println("4.Doctor specialization");
				System.out.println("5.Exit");
				choice1=scanner.nextInt();
				switch(choice1)
				{
				case 1:
					  System.out.println("Enter Doctor Id");
					  String id=scanner.nextLine();
					  doctorlist.get(i).setDoctorId(id);
					  break;
					  
					  
				case 2:
					System.out.println("Enter Doctor Name");
					String name=scanner.nextLine();
					doctorlist.get(i).setDoctorName(name);
					break;
					
					
				case 3:
					System.out.println("Enter Doctor Availability");
					String available=scanner.nextLine();
					doctorlist.get(i).setDoctorAvailibity(available);
					break;
					
				case 4:
					System.out.println("Enter Doctor Specilization");
					String special=scanner.nextLine();
					doctorlist.get(i).setDoctorSpecalization(special);
					break;
					
					
				case 5:
					System.out.println("Exit");
					  break;
					  default:
						  System.out.println("Wrong choice");
					
					  
				}
				
			}while(choice1!=5);
			
		
		
		
		}
		
		
	}
		
		if(doctorlist.size()>0)
		{
			System.out.println("Record Not Exist");
		}

}
	
	
	public void deleteDoctor()
	{
		try {
		System.out.println("Enter Doctor Id");
	    String id=scanner.nextLine();
	    int i=0;
	    for(i=0;i<doctorlist.size();i++)
	    {
	    	 Doctor temp=doctorlist.get(i);
	    	if(temp.getDoctorId().equals(id));
	    	{
	    		doctorlist.remove(i);
	    	}
	    }
	    System.out.println("Record Deleted");
	}catch(Exception e)
		{
		System.out.println("User Id Not Match");
		}
	
	}
}
