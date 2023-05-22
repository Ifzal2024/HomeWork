package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe ifzal = new AboutMe(); // Constructor is initialized here
		// variables are initialized below
		ifzal.name = "Muhammad A Mughnee";
		ifzal.myAge = 35;
		ifzal.myCarPayment = 600;
		ifzal.myHouseNumber = 3142;
		ifzal.myBankBalance = 123456213l;
		ifzal.myHeight = 5.5f;
		ifzal.myGrade = 3.894562;
		ifzal.myShirtSize = 'M';
		ifzal.vietnamWarVeteran = false;
		ifzal.aboutMe(); // Method is initialized here

		System.out.println("\n-----------------------------------------------------------------------\n");

		AboutMe alex = new AboutMe();// Constructor is initialized here
		// variables are initialized below
		alex.name = "Alex Rodriguez";
		alex.myAge = 55;
		alex.myCarPayment = 900;
		alex.myHouseNumber = 46523;
		alex.myBankBalance = 2356983l;
		alex.myHeight = 6.2f;
		alex.myGrade = 3.4562;
		alex.myShirtSize = 'L';
		alex.vietnamWarVeteran = true;
		alex.aboutMe(); // Method is initialized here

	}
	

}
