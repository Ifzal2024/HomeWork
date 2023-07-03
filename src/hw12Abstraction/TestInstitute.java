package hw12Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\n---------Regular Class ColumbiaUniversity---------");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.chemistry();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.caring();
		columbiaUniversity.lawInfo();
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.computerLab();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.morgue();
		columbiaUniversity.vocationalInfo();

		System.out.println("\n---------Interface University----------");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		// University.pharmacy(); //static methods of classes are inherited by subclasses, but static methods of interfaces aren't. 

		System.out.println("\n--------Abstract Class MedicalSchool--------");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.mechanicalLab();
		medicalSchool.anthropology();

	}

}
