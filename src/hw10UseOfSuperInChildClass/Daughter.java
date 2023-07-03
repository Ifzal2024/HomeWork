package hw10UseOfSuperInChildClass;

public class Daughter extends Father  {
	// These are 2 variables which declared
		public String birthMonth;
		public int age;

		// Default Constructor declared
		public Daughter() {
			//super method is used to call the default constructor of super (parent) class
			super();
			// super keyword is used to initialize the methods of super (Parent) class
			super.father();
			super.fatherInfo("MD A Majeed", 50, 'M', false);

			// super keyword is used to initialize the variables from super (Parent) class.
			super.familyName = "A Majeed";
			System.out.println("The family name is: " + familyName);
			System.out.println("This is a default Constructor from Daughter Class");

		}

		// Parameterized Constructor declared
		public Daughter(String birthMonth, int age) {
		//super method is used to call the parameterized constructor of super (parent) class.
		// Constructor call should be the first call inside Para. Constructor body
			super("MD A Majeed", 45, 'M', true);
			super.father();
			super.fatherInfo("Abdul Majeed ", 40, 'M', false);
			super.familyName = "A Majeed ";
			System.out.println("The name of the family is: " + familyName);
			this.birthMonth = birthMonth;
			this.age = age;
			System.out.println("My daughter born on: " + birthMonth + ". Her age is: " + age);
		}

		// void type method declared
		public void daughter() {
			// we can't call constructor of super class inside a void type method of child class.
			//super();
			super.father();
			super.fatherInfo("A Majeed", 65, 'M', false);
			super.familyName = "A Majeed";
			System.out.println("Family name is: " + familyName);
			System.out.println("This is a void type method from Daughter Class");
		}

		// parameterized method declared
		public void daughterInfo(String birthMonth, int age) {
			// we can't call constructor of super class inside a parameterized method of child class.
			//super("A Majeed",56,'M', false );
			super.father();
			super.fatherInfo("A Majeed ", 55, 'M', true);
			super.familyName = "A Majeed";
			System.out.println("The name of the family is: " + familyName);
						System.out.println("My daughter born on: " + birthMonth + ". Her age is: " + age);
		}
}
