package hw6IfElseCondition01;
/*
 * Q 1: HW06A: Create a package name --> "hw6IfElseCondition01" inside your HW project. Create a Class, named "Voter". Type the main method. Inside the main method, define an int-type variable, age, and initialize your age. Now write some conditions. a) your age is equal to 18, the outcome will be "I am a Voter" b) your age is less than 18, the outcome will be "I am not a Voter" c) your age is greater than 18, the outcome will be "I am a Voter from age 18" d) And finally the outcome will be "Please add a valid age". In the above 4 conditions, use an appropriate keyword like if, else if, or else to say that you are a voter. Please organize the code (very important). don't give any white space. push the code to GitHub and add the link below.
 */

public class Voter {
	public static void main(String[] args) {
		int myAge = 40;

		if (myAge == 18) {
			System.out.println("I am a voter");
		} else if (myAge < 18) {
			System.out.println("I am not a voter");
		} else if (myAge > 18) {
			System.out.println("I am a voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
