package hw12Abstraction;
/*
 * MedicalSchool is an  abstract Class. One keyword is used for the inheritance in
 * Abstract Class which is "extends" in Java. An abstract class can inherit only
 * one abstract class or one regular class by extends key word.  Only one inheritance is possible by an Abstract Class with extends keyword.
 * An Abstract class can not inherit a regular class or abstract class by implements keyword.
 *An abstract class can't inherit an Interface by extends key word. Implements keyword is used to inherit Interface in Abstract Class. 
 * An abstract class can inherit more than one Interface. 
 * MedicalSchool and NursingSchool are Abstract Classes. And MedicalSchool inherits NursingSchool with extends keyword.
 * LawSchool is an Interface.Nursing School inherits Interface LawSchool with implements key Word.
  */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	
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


