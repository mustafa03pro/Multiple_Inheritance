package com.may29.multipleInheritance;

public class Hybrid {
	private int id;

	public Hybrid(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Hybrid [id=" + id + "]";
	}
	
	

}
class a extends Hybrid{
	private String name;

	public a(int id, String name) {
		super(id);
		this.name = name;
	}

	@Override
	public String toString() {
		return "a [toString()=" + super.toString()
				+ ", name=" + name + "]";
	}
	
}
class b extends a{
	private double salary;

	public b(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "b [toString()=" + super.toString() 
				+ ", salary=" + salary + "]";
	}
	
	
}
class c extends a{
	private double tax;

	public c(int id, String name, double tax) {
		super(id, name);
		this.tax = tax;
	}
	

	@Override
	public String toString() {
		return "c [toString()=" + super.toString() 
				+ ", tax=" + tax + "]";
	}
	
	
	
}