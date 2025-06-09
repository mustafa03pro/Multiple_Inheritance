package com.may29.multipleInheritance;

public class Ticket {
	private String eventName;

	private int seatNumber;

	private double price;

	public Ticket(String eventName, int seatNumber, double price) {
		super();
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket eventName=" + eventName + "\nseatNumber=" + seatNumber + "\nprice=" + price ;
	}
	
	


}
class VIPTicket extends Ticket{
	private String specialAccess;

	public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
		if(seatNumber<0||price<0) {
			System.err.println("Invalid input");
			System.exit(0);
		}
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	@Override
	public String toString() {
		return "VIPTicket EventName=" + getEventName() + "\nSeatNumber=" + getSeatNumber() + "\nPrice= $"
				+ getPrice() 
				+ "\nspecialAccess=" + specialAccess +"\n------------------------------------------------";
	}
	
	
}
class StudentTicket extends Ticket{
	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
		
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
		if(seatNumber<0||price<0) {
			System.err.println("Invalid input");
			System.exit(0);
		}
	}
	









	@Override
	public String toString() {
		return "StudentTicket= " + getEventName() + "\nSeatNumber =" + getSeatNumber()
				+ "\nprice= $" + getPrice() 			 + "\nstudentDiscount=" + studentDiscount ;
	}










	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	
}
