package com.may27.multipleInheritance;

import java.util.Scanner;

public class StudentFeesCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a particular type of Student :\r\n" + "		 1) Hosteller Student :\r\n"
				+ "		 2) DayScholer Student :");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1:
			int studentId = Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			double examFee = Double.parseDouble(sc.nextLine());
			double hostelFee = Double.parseDouble(sc.nextLine());
			double amount = Double.parseDouble(sc.nextLine());
			Hosteller h1 = new Hosteller(studentId, name, examFee, hostelFee);
			System.out.println(h1);
			h1.payFee(amount);
			break;
		case 2:
			int studentId1 = Integer.parseInt(sc.nextLine());
			String name1 = sc.nextLine();
			double examFee1 = Double.parseDouble(sc.nextLine());

			double transportFee = Double.parseDouble(sc.nextLine());
			double amount1 = Double.parseDouble(sc.nextLine());
			DayScholar d1 = new DayScholar(studentId1, name1, examFee1, transportFee);
			System.out.println(d1);
			d1.payFee(amount1);
			break;

		}
		sc.close();

	}

}
