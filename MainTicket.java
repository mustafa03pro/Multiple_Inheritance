package com.may29.multipleInheritance;

public class MainTicket {

	public static void main(String[] args) {
		 Ticket regularTicket = new Ticket("Concert", 101, 50.0);
         VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
         StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
         System.out.println("regular:"+vipTicket.getEventName());
         System.out.println("regular:"+vipTicket.getPrice());
         System.out.println("regular:"+vipTicket.getSeatNumber());
         System.out.println("regular:"+vipTicket.getSpecialAccess());
         System.err.println("-----------------------------------------");
         System.out.println("regular:"+studentTicket.getEventName());
         System.out.println("regular:"+studentTicket.getPrice());
         System.out.println("regular:"+studentTicket.getSeatNumber());
         System.out.println("regular:"+studentTicket.isStudentDiscount());
         



	}

}
