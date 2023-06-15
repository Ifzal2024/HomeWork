package hw10Abstraction;
/*
 * MedicalSchool is an  abstract Class. One keyword is used for the inheritance in
 * Abstract Class which is "extends" in Java. An abstract class can inherit only
 * one abstract class or one regular class by extends key word. An abstract class
 * can't inherit an Interface by extends key word. Only one inheritance is possible by an Abstract Class.
 * MedicalSchool and NursingSchool are Abstract Classes. And MedicalSchool inherits NursingSchool
 * with extends keyword.
 * 
 */

public abstract class MedicalSchool extends NursingSchool {
	
	// Yes, we can create a Constructor inside Abstract Class.
	public MedicalSchool() {
		System.out.println("This default constructor is from Abstarct class--MedicalSchool");
		
	}
	
	// Method is implemented
	// This method is called non abstract method.
	public void anatomyLab() {
		System.out.println("This anatomyLab is a Non-abstract method and is  from class-MedicalSchool ");
	}
	
	// Method is declared.
	// This method is called abstract method
	public abstract void biochemistryLab();
	
	}


