package hw11Abstraction;

/*
 * ColumbiaUniversity is a regular Class. One keyword is used for the inheritance in
 * Regular Class which is "extends" in Java. A Regular class can inherit only
 * one abstract class or one regular class by extends keyword. . Only one inheritance is possible by a Regular Class with extends Keyword.
 *  ColumbiaUniversity is a Regular Class and MedicalSchool is an Abstract Class. And ColumbiaUniversity inherits MedicalSchool
 * with extends keyword.
  * A Regular Class can't inherit an Interface by extends key word.  A regular class cannot inherit a regular class or abstract class by implements keyword. A Regular can inherit more than one Interface with implements Keyword. 
  * Regular Class ColumbiaUniversity inherits Interfaces University and Vocational School with implements Keyword.
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// Method is implemented
	// This method is called non abstract method.
	public void chemistry() {
		System.out.println("This non abstract method is from ColumbiaUniversity Class");
	}

	/*
	 * Method declared . This method is called abstract method. We can not create an
	 * abstract method in Regular Class. To create an abstract method, we must have
	 * an Abstract Class or an interface. 
	 * public abstract void biology(); 
	 * If we try  to create an abstract method inside regular class we get an error in Java.
	 * See the error below.
	 * "Error :  The abstract method biology in type ColumbiaUniversity can only be defined by an abstract class"
	 */

	// Yes, we can create a Constructor in Regular Class.
	public ColumbiaUniversity() {

	}

	/*
	 * MedicalSchool is an Abstract Class and it has method biochemistryLab which is
	 * declared. If we call Abstract Class, then it has an abstract method that will
	 * be converted to an implemented method.
	 */

	@Override
	public void biochemistryLab() {

	}

	/*
	 * MedicalSchool is an Abstract Class and it inherits another Abstract Class
	 * which is NursingSchool. And Nursing School has method caring which is
	 * declared. If we call Abstract Class, then it has an abstract method that will
	 * be converted to an implemented method.
	 */

	@Override
	public void caring() {

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

}
