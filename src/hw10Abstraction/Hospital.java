package hw10Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("Default method Morgue is from Hospital Interface ");
	}

	public static void pharmacy() {
		System.out.println(" Static method Pharmacy is from Hospital Interface ");
	}

}
