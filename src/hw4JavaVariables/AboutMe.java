package hw4JavaVariables;

public class AboutMe {

	// Below variables are declared
	public String name;
	public byte myAge;
	public short myCarPayment;
	public int myHouseNumber;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myShirtSize;
	public boolean vietnamWarVeteran;

	// Below Constructor is declared
	public AboutMe() {
		System.out.println("This is all about us: ");
	}

	// Below method is implemented
	public void aboutMe() {
		System.out.println("My Name: " + name + "\nMy Age: " + myAge + "\nMy Car Payment: " + myCarPayment
				+ "\nMy House Number: " + myHouseNumber + "\nMy Bank Balance: " + myBankBalance + "\nMy Shirt Size: "
				+ myShirtSize + "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade
				+ "\nAm I Vietnam War Veteran? Ans: " + vietnamWarVeteran);
	}

}
