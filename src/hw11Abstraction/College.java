package hw11Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println(" Dorm is from College Interface ");

	}
	
	public static void studyRoom() {
		System.out.println(" StudyRoom is from College Interface ");
	}
	
}
