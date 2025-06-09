package com.may29.multipleInheritance;

import java.util.Scanner;



public class TicketDemo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int choice = Integer.parseInt(sc.nextLine());
        if(choice>=3){
            System.err.println("Invalid Choice!");
            System.exit(0);
        }
		switch (choice) {
		case 1:
			String name = sc.nextLine();
        int seatNumber= Integer.parseInt(sc.nextLine());
			
			double price = Integer.parseInt(sc.nextLine());
			String specialAccess=sc.nextLine();
			VIPTicket vipTicket = new VIPTicket(name, seatNumber, price, specialAccess);
			System.out.println(vipTicket);
			
			
			
			
			
			
			break;
		case 2:
			String name1 = sc.nextLine();
	        int seatNumber1= Integer.parseInt(sc.nextLine());
				
				double price1 = Integer.parseInt(sc.nextLine());
				boolean studentDiscount=sc.nextBoolean();
			
			StudentTicket studentTicket = new StudentTicket(name1, seatNumber1, price1, studentDiscount);
	        System.out.println(studentTicket);
	        

			
			break;

	}
		
		
       
        


}}
