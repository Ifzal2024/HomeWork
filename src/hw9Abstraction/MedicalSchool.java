package hw9Abstraction;

public abstract class MedicalSchool {
	
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


