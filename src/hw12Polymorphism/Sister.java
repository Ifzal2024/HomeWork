package hw12Polymorphism;

public class Sister {
	/*
	 * Method overloading - When different methods exist with the same method name
	 * but with different parameters or signature or different combination of
	 * parameter is called method overloading. Method overloading occurs during
	 * compile time. Method overloading has different name: Early binding or static
	 * binding or compile time polymorphism.
	 */

	// void type method is implemented
	public void sister() {
		System.out.println("This is a void type method from Sister Class");
	}

	// void type parameterized method is implemented
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age of sister: " + total1);
	}

	// return type parameterized method is implemented
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("Total age of sister: " + total2);
		return total2;

	}

	// static type method is implemented
	public static int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total age of sister: " + total3);
		return total3;

	}

	// final type method is implemented
	public final int sister(int age5, String age4, int age6) {
		int total4 = age5 + Integer.parseInt(age4) + age6;
		System.out.println("Total age of sister: " + total4);
		return total4;

	}

}
