package hw10UseOfSuperInChildClass;

// Variables declared
public class Father {
public String name;
public int age;
public char sex;
public boolean usCitizen;
public String familyName;

//Default Constructor declared
public Father () {
	System.out.println("This is a default constructor from Father/Parent Class");
}


// Parameterized Constructor declared
public Father(String name, int age, char sex, boolean usCitizen) {
	this.name= name;
	this.age = age;
	this.sex = sex;
	this.usCitizen = usCitizen;
	System.out.println("My father name is: " + name + ". His age is: " + age + ". His sex is " + sex
			+ ". Is he a US Citizen? " + usCitizen);
}

//Void type method declared
	public void father() {
		System.out.println("This is a void type method from Father/Parent  Class");
	}
	
	// Parameterized method declared
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
			System.out.println("My father name is: " + name + ". His age is: " + age + ". His sex is " + sex
				+ ". Is he a US Citizen? " + usCitizen);

}
}