package hw9Abstraction;

public class ColumbiaUniversity {
	// Method is implemented
	// This method is called non abstract method.
	public void chemistry() {
		System.out.println("This non abstract method is from ColumbiaUniversity Class");
	}

	 /*
	 * Method declared . This method is called abstract method. We can not create an
	 * abstract method in Regular Class. To create an abstract method, we must have
	 * an Abstract Class or an interface. public abstract void biology(); If we try
	 * to create an abstract method inside regular class we get an error in Java.
	 * See the error below.
	 * "Error :  The abstract method biology in type ColumbiaUniversity can only be defined by an abstract class"
	 */

	// Yes, we can create a Constructor in Regular Class.
	public ColumbiaUniversity() {

	}

}
