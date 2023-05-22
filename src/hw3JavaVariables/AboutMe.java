package hw3JavaVariables;

public class AboutMe {
	public int myCellPhoneNumber; // Variable Declared
	public String myName = "Muhammad A Ifzal"; // Variable Initialized.
	public byte age = 35;
	public short myCarPrice = 5000;
	public int myHouseNumber = 52152;
	public long myBankBalance = 452300000521l;
	public float myweight = 170.25360f;
	public double myGrade = 3.5621345658;
	public char myShirtSize = 'M';
	public boolean raceHispanic = false;

	public static void main(String[] args) {
		AboutMe myInfo = new AboutMe(); // Class Instantiated
		System.out.println("My age: " + myInfo.age + "\nMy race is Hispanic: " + myInfo.raceHispanic
				+ "\nMy Bank Balance: " + myInfo.myBankBalance);
	}

}
