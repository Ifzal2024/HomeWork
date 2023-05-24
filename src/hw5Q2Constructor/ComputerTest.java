package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default constructor Initialized
		Computer computer01 = new Computer();
		System.out.println("-----------------------------------------------------------------------");
		// Paramterized Constructor 01 Initialized
		Computer computer02 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		System.out.println("-----------------------------------------------------------------------");
		// Below: My Computer Configuration & Paramterized Constructor 02 Initialized
		Computer computer03 = new Computer("Windows", "Dell Inspiron 14", "Windows 11 Home", 989, true, 'A');
	}

}
