package hw12Polymorphism;

public class Niece extends Sister {

	/*
	 * When different methods exist with the same method name with same parameters
	 * or signature but with different syntax or logic, it is called method
	 * overriding. Method Overriding occurs during run time. Method overriding also
	 * called Dynamic Polymorphism or late binding or method overriding or run time
	 * polymorphism
	 */

	// method-01
	@Override
	public void sister() {
		System.out.println("This is a void type method from Niece Class");
	}

	// method -02
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 / 2 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age of sister: " + total1);

	}

	// method -03
	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3 + 9;
		System.out.println("Total age of sister: " + total2);
		return total2;

	}

	/*
	 * The method sister can't override or implemented because static is a local
	 * method of a class. So, static method can't be override, if we
	 * remove @override, it will work as static method of this Niece Class.
	 */

	/*
	 * method -04
	 * 
	 * @Override public static int sister(int age1, int age2, String age4) { int
	 * total3 = age1 + age2 + Integer.parseInt(age4);
	 * System.out.println("Total age of sister: " + total3); return total3; }
	 */

	/*
	 * Final method can't be overridden because once it's final, we can't change or
	 * override anything.
	 */

	/*
	 * // method -05 public final int sister(int age5, String age4, int age6) { int
	 * total4 = age5 + Integer.parseInt(age4) + age6;
	 * System.out.println("Total age of sister: " + total4); return total4; }
	 */

}
