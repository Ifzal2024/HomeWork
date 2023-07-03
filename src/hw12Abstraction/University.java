package hw12Abstraction;

/*
 *  Interface is a Blueprint of the Class. 
 An Interface can't inherit a regular class or an abstract class by extends keyword
 An Interface can inherit more than one Interface (separated by coma) by only one  keyword i.e. "extends"
University, College, Hospital are Interface. And University inherits College and Hospital with extends keyword.

 */

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public abstract void teacher();

	/*
	 * Its not possible to create Constructor inside Interface. 
	 * public University() { 
	 * } 
	 * Following Informations are taken from Tutorialspoint. In Java, We can not
	 * create a Constructor inside Interface because all data members in interfaces
	 * are public static final by default, They are constant. They are abstract by
	 * nature. In Interface, methods don't have a body. So, there is no need for
	 * calling the methods in an Interface. Since we cannot call the methods, there
	 * is no need to create an object for an Interface and there is no need of
	 * having a constructor in it.
	 */

	// This default is not access modifier. 2 Exceptions From Java 1.8, JAVA
	// implemented static and default type method in interface which are implemented
	// in nature
	public default void gymnasium() {
		System.out.println("This default method gymnasium is from University Interface");
	}

// static type method in interface which is implemented in Nature.
	public static void library() {
		System.out.println("This static methodlibrary is from University Interface");
	}

}
