package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n-------Sister---------");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(15, 21, 10, "16", 30, 26);
		sister.sister(28, 14, 35);
		Sister.sister(34, 29, "12");
		sister.sister(13, "22", 19);

		System.out.println("\n---------Niece---------");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(15, 21, 10, "16", 30, 26);
		niece.sister(28, 14, 35);

	}

}
