package hw9Abstraction;

public interface University {
	public void classSize();

	public void playGround();

	public abstract void teacher();

	/*
	 * Its not possible to create Constructor inside Interface. 
	 * public University()  { 
	  } 
	  Following Informations are taken from Tutorialspoint. In Java, We can not create a
	 * Constructor inside Interface because all data members in interfaces are
	 * public static final by default, They are constant. They are abstract by
	 * nature. In Interface, methods don't have a body. So, there is no need for
	 * calling the methods in an Interface. Since we cannot call the methods, there
	 * is no need to create an object for an Interface and there is no need of
	 * having a constructor in it.
	 */

}
