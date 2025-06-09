package com.may27.multipleInheritance;

public class Student {
	protected int studentId;
	protected String name;
	protected double examFee;

	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
}

class DayScholar extends Student {
	protected double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
		if (examFee < 0){
			System.err.println("Exam fees cannot be negative");
			System.exit(0);
		}
		if (name == "") {
			System.err.println("Name cannot be negative");
			System.exit(0);
		}
	}

	@Override
	public String toString() {
		return "DayScholar =" + super.toString() + ", transportFee=" + transportFee + "]";
	}

	public double payFee(double amount) {
		if(amount<0) {
			System.err.println("amount cannot be negative");
			System.exit(0);
			}


		double totalfee = examFee + transportFee;
		if (totalfee < amount) {
			double payAmount = amount - totalfee;
			System.out.println("the payable amount " + payAmount);
			totalfee -= amount;
		} else if (totalfee > amount) {
			double refund = totalfee - amount;
			System.out.println("the refund amount " + refund);
			totalfee -= amount;
		}
		return amount;

	}

}

class Hosteller extends Student {
	protected double hostelFee;

	
		public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	

		if (examFee < 0){
			System.err.println("Exam fees cannot be negative");
			System.exit(0);
		}
		if (hostelFee < 0) {
			System.err.println("transport fee cannot be negative");
			System.exit(0);
		}
		if (name == "") {
			System.err.println("Name cannot be negative");
			System.exit(0);
		}
	}

	@Override
	public String toString() {
		return "Hosteller =" + super.toString() + ", hostelFee=" + hostelFee +"]";
	}

	public double payFee(double amount) {
		if(amount<0) {
			System.err.println("amount cannot be negative");
			System.exit(0);

			
		}

		double totalfee = examFee + hostelFee;
		if (totalfee < amount) {
			double payAmount = amount - totalfee;
			System.out.println("the payable amount " + payAmount);
			totalfee -= amount;

		} else if (totalfee > amount) {
			double refund = totalfee - amount;
			System.out.println("the refund amount " + refund);
			totalfee -= amount;
		}
		return amount;

	}
}
