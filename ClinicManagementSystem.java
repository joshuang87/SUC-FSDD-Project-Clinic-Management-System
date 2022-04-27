//Student Name      : Joshua Ng Wei Qi
//Student ID        : D210256C
//Butch Number      : IT_FSDD_2021C
//Submission Date   : 13/1/2022
//Title             : Clinic Management System

//Project Objective :
// - Clinic Management System allow the clinic more easier to manage.
// - Clinic Management System allow the clinic operate systematic.
// - Let employee working convenitent and saving theit time.

//Description:
// This is a program that can be used for manage clinic.Below are the following function:
// I   )The program will separate the patient and employee. 
// II  )Patient can register at the program and take a number to wait for the doctor.
// III )Patient can make an appointment to doctor.
// IV  )Patient can decide his appointment date and time.
// V   )Employee may login his employee account.(user name:Joshua)(user password:D210256C)
// VI  )Employee may clock in at this program.
// VII )Employee may view the medicine stock of clinic at this program.
// VIII)Employee may view the amount of appointment for patients on that day.
// IX  )Employee may keep a recording about patient name,patient gender and patient symtoms.
// X   )Employee may clock out at this program.
// XI  )Employee may exit and logout the program. 


import java.util.Scanner;
import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ClinicManagementSystem{ 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int exit = 0;
		
		do{
			System.out.println("");
			System.out.println("******************************************");
		    System.out.println("           Clinic Doctor Joseph           ");
		    System.out.println("******************************************");
		    System.out.println("You are patient or employee?");
		    System.out.println("1.Patient      2.Employee      3.Exit");
		    System.out.println("------------------------------------------");
		    int inputNumber = input.nextInt();
		 
		    String name;
		    String gender;
		    String ic;
		
		    if(inputNumber == 1){
		    	System.out.println("------------------------------------------");
			    System.out.println("1.Register      2.Appointment");
			    System.out.println("------------------------------------------");
			    
			    int numberSelection = input.nextInt();
			    
			    if(numberSelection == 1){
			    	System.out.println("");
			    	System.out.print("Please enter your name:");
			    	name = input.next();
			    	System.out.println("");
			    	System.out.print("Please enter your number IC:");
			    	ic = input.next();
			    	System.out.println("");
			    	System.out.print("Please enter your gender:");
			    	gender = input.next();
			    	
			    	Random random_1 = new Random();
				    Random random_2 = new Random();
				    Random random_3 = new Random();
				    Random random_4 = new Random();
				
				    int registerNumber_1 = random_1.nextInt(10);
				    int registerNumber_2 = random_2.nextInt(10);
				    int registerNumber_3 = random_3.nextInt(10);
				    int registerNumber_4 = random_4.nextInt(10);
				
				    System.out.println("");
				    System.out.print("Please wait for a while until counter call your number:");
				    System.out.print(registerNumber_1);
		            System.out.print(registerNumber_2);
	                System.out.print(registerNumber_3);
		            System.out.print(registerNumber_4);
		    }
		        
		        else if (numberSelection == 2){
		        	
		        	String date;
		    	    String time;
		
		    	    System.out.println("");
		    	    System.out.print("Please enter your name:");
		    	    name = input.next();
		    	
		    	    System.out.println("");
		    	    System.out.print("Please enter the date your want(example:10/6/2021):");
		    	    date = input.next();
		    	
		    	    System.out.println("");
		    	    System.out.print("Please enter the time yout want(example:5.13 p.m.):");
		    	    time = input.next();
		    	
		    	    System.out.println("");
		    	    System.out.print("Reservation Successfully!");
		    }
		 
		       else{
		       	System.out.println("");
		    	System.out.print("System Error!! Please enter the number according to the selection!");
		    } 					
	    }
	    
	        else if(inputNumber == 2){
	        	employeeLogin();
	    	
	    	    int quit = 0;
	    	
	    	do{
	    		System.out.println("");
	    		System.out.println("*****    MAIN MENU   *****");
	    		System.out.println("[1] Clock in");
	    		System.out.println("[2] Medicine Stock Checking");
	    		System.out.println("[3] Appointment View");
	    		System.out.println("[4] Keep a recroding");
	    		System.out.println("[5] Clock out");
	    		System.out.println("[6] Exit");
	    		System.out.println("");
	    		System.out.print("Please enter your selection:");
	    		
	    		int choice = input.nextInt();
	    		
	    		switch(choice){
	    			case 1:
	    				clockIn();
	    				break;
	    			case 2:
	    				medicineStockChecking();
	    				break;
	    			case 3:
	    				appointmentView();
	    				break;
	    			case 4:
	    				recroding();
	    				break;
	    			case 5:
	    				clockOut();
	    				break;
	    			case 6:
	    				exit();
	    				quit++;
	    				break;
	    			default:
	    			System.out.println("System Error!! Please enter the number according to the selection!");						
	    	}
	    	}while(quit != 1);
	    	
	    }
	    
	    else if(inputNumber == 3){
		    	System.out.println("");
		    	System.out.print("The program have been stop.Thank You.");
		    	exit++;
		    }
		}while(exit != 1);
		
		    	 	
	}
	
	public static void clockIn(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.print("Time arrive to work has been recorded! " + dtf.format(now));
	}
	
	public static void medicineStockChecking(){
		String[] medicineList_0 = {"Abamectin", "Abciximab", "Ablukast", "Absinthol", "Abunidazole", "Acamylophenine", "Acarbose", "Acebrochol"};
		String[] medicineList_1 = {"Amitriptylinoxide","Amlodipine","Sulfadiazine","Batilol","Azimexon","Azumolene","Azatadine","Azamethonium Bromide","Avizafone","Atracurium Besilate",};
		
		for(int i = 0; i < medicineList_0.length; i++){
			Random random_5 = new Random();
			int randomX = random_5.nextInt(50);
			System.out.println(randomX + " :  " + medicineList_0[i] + " "); 
		}
		
		for(int i = 0; i < medicineList_1.length; i++){
			Random random_5 = new Random();
			int randomX = random_5.nextInt(50);
			System.out.println(randomX + " :  " + medicineList_1[i] + " ");
		}
		
		System.out.println("");
		System.out.print("These are the all medicine we have.");
	}
	
	public static void appointmentView(){
		
		Random randomAppointment = new Random();
		
		int amountOfAppointment = randomAppointment.nextInt(7);
		
		if(amountOfAppointment == 1){
			System.out.print("Today has " + amountOfAppointment + " appointment for patient.");
		}
		else if(amountOfAppointment > 1){
			System.out.print("Today have " + amountOfAppointment + " appointment for patient.");
		}
		else
			System.out.print("Today haven't appointment.");
	}
	
	public static void recroding(){
		Scanner input = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		String patientName;
		String patientGender;
		String patientSymtomsOfDisease;
		
		System.out.println("");
		System.out.print("Patient name:");
		patientName = input.next();
		
		System.out.print("Patient gender:");
		patientGender = input.next();
		
		System.out.print("Patient's symtoms:");
		patientSymtomsOfDisease = input.next();
		
		System.out.println("");
		System.out.println("Patient's data has been saved at " + dtf.format(now));
	}
	
	public static void clockOut(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.print("Time to get off work has been recorded! " + dtf.format(now));
	}
	
	public static void exit(){
		System.out.print("Emlpoyee account has been logout.Program has been stop.");
		System.exit(0);
	}
	
	public static void employeeLogin(){
		Scanner input = new Scanner(System.in);
		
		String userName;
		String userPassword;
		int count = 0;
		int chance = 3;
		while(count < 3){
			System.out.println("Please login your employee account.");
			System.out.print("Please enter user name:");
			userName = input.next();
			
			System.out.print("Please enter user password:");
			userPassword = input.next();
			
			if(userName.equals("Joshua") && userPassword.equals("D210256C")){
				System.out.println("");
				System.out.print("Login Successfully!");
				break;
			}
			
			else if(userName.equals("Joshua")){
				System.out.println("");
				System.out.println("User password is wrong.Please enter the correct password.");
				chance--;
				System.out.println("You have " + chance + " chance to enter the correct password.");
				System.out.println("");
				
				if(chance == 0){
					System.out.println("");
					System.out.println("You have not any chance to enter the password!Please try again after 30 second.");
					System.exit(0);
					break;
			    }
			}  
			 else if(userPassword.equals("D210256C")){
			 	System.out.println("");
				System.out.println("User name is wrong.Please enter the correct user name.");
				chance--;
				System.out.println("You have " + chance + " chance to enter the correct user name.");
				System.out.println("");
				
				if(chance == 0){
					System.out.println("");
					System.out.println("You have not any chance to enter the user name!Please try again after 30 second.");
					System.exit(0);
					break;
			 }
	   }
			 	 
			 else if(!userName.equals("Joshua") && !userPassword.equals("D210256C")){
			 	System.out.println("");
				System.out.println("User name and user password are wrong.Please enter the correct user name and user password.");
				chance--;
				System.out.println("You have " + chance + " chance to enter the correct user name and user password.");
				System.out.println("");
				
				if(chance == 0){
					System.out.println("");
					System.out.println("You have not any chance to enter the user name and user password!Please try again after 30 second.");
					System.exit(0);
					break;	
			}
		}
			count++;
		}
	}
} 