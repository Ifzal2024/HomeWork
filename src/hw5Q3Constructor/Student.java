package hw5Q3Constructor;

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	// Default constructor Declared
	public Student() {
		System.out.println("This is from the default Constructor of Student class");

	}

    //	Parameterized Constructor Declared
	public Student(String StName, int stID, char sex, boolean programmer, float grade) {

		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;

		System.out.println("\nStudent name: " + StName + "\nStudent ID: " + stID + "\nSex: " + sex
				+ "\nIs Java Programmer? Ans: " + programmer + "\nGrade: " + grade);

	}

}
