package com.may27.multipleInheritance;



import java.util.Scanner;

public class TesterDayScholarHosteller  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = Integer.parseInt(sc.nextLine());
        if(choice>=3){
            System.out.println("Invalid Choice!");
            System.exit(0);
        }
		switch (choice) {
		case 1:
        int studentId1 = Integer.parseInt(sc.nextLine());
			String name1 = sc.nextLine();
			double examFee1 = Double.parseDouble(sc.nextLine());

			double transportFee = Double.parseDouble(sc.nextLine());
			double amount1 = Double.parseDouble(sc.nextLine());
			DayScholar1 d1 = new DayScholar1(studentId1, name1, examFee1, transportFee);
			System.out.println(d1);
			d1.payFee(amount1);
			break;
		case 2:
			int studentId = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			double examFee = Double.parseDouble(sc.nextLine());
			double hostelFee = Double.parseDouble(sc.nextLine());
			double amount = Double.parseDouble(sc.nextLine());
			if(amount<0){
				System.out.println("amount should be Positive.");
				System.exit(0);
			}
			Hosteller1 h1 = new Hosteller1(studentId, name, examFee, hostelFee);
			
			
			System.out.println(h1);
			h1.payFee(amount);
			
			break;

		}
		sc.close();

	}

}


 class Student1 {
	protected int studentId;
	protected String name;
	protected double examFee;

	public Student1(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name+ ", examFee=" + examFee + "]";
	}
}

class DayScholar1 extends Student1 {
	protected double transportFee;

	public DayScholar1(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
		if (examFee < 0){
			System.out.println("Exam Fee should be Positive.");
			System.exit(0);
		}
		if (name == "") {
			System.err.println("Name cannot be negative");
			System.exit(0);
		}
		if(studentId<0){
			System.out.println("Id Should be positive.");
			System.exit(0);
		}
	}

	@Override
	public String toString() {
		return  "DayScholar[TransportFee="+transportFee+",name="+super.name+",studentId="+super.studentId+",examFee="+super.examFee+"]";
	}

	public double payFee(double amount) {
		if(amount<0) {
			System.out.println("amount should be Positive.");
			System.exit(0);
			}


		double totalfee = examFee + transportFee;
		if (totalfee < amount) {
			double payAmount = amount - totalfee;
			System.out.println("the payable amount " + payAmount);
			totalfee -= amount;
		} else if (totalfee > amount) {
			double refund = totalfee - amount;
			System.out.println("Remaining amount to pay is: " + refund);
			totalfee -= amount;
		}
        else if(totalfee==amount){
            System.out.println("All Fees are clear");
        }
		return amount;

	}

}

class Hosteller1 extends Student1 {
	protected double hostelFee;

	
		public Hosteller1(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	

		if (examFee < 0){
			System.out.println("Exam fees cannot be negative");
			System.exit(0);
		}
		if (hostelFee < 0) {
			System.out.println("transport fee cannot be negative");
			System.exit(0);
		}
		if (name == "") {
			System.out.println("Name cannot be negative");
			System.exit(0);
		}
		
	}
		@Override
	public String toString() {
		return "Hosteller[HostelFee="+hostelFee+",name="+super.name+",studentId="+super.studentId+",examFee="+super.examFee+"]";
	}

	

	public double payFee(double amount) {
		if(amount<0) {
			System.out.println("amount should be Positive.");
			System.exit(0);

			
		}
	

		double totalfee = examFee + hostelFee;
		if (totalfee < amount) {
			double payAmount = amount - totalfee;
			System.out.println("the payable amount " + payAmount);
			totalfee -= amount;

		} else if (totalfee > amount) {
			double refund = totalfee - amount;
			System.out.println("Remaining amount to pay is: " + refund);
			totalfee -= amount;
		}
		return amount;

	}

}
