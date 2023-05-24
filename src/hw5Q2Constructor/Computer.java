package hw5Q2Constructor;

import java.lang.management.OperatingSystemMXBean;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

//	Default Constructor declared
	public Computer() {
		System.out.println("This is from the default Constructor of Computer class");

	}

//	Parameterized Constructor 01 Declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My brand: " + brand + "\nMy Model: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: $" + price + "\nGrade: " + grade + "\nMade In the USA? Ans: " + madeInUSA);
	}

	// Parameterized Constructor 02 Declared
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA, char grade) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println("My brand: " + brand + "\nMy Model: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: $" + price + "\nGrade: " + grade + "\nMade In the USA? Ans: " + madeInUSA);

	}

}
