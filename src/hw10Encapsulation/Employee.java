package hw10Encapsulation;

public class Employee {
	private String empName;
	private int empAge;
	private char empSex;
	private boolean empUSCitizen;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public char getEmpSex() {
		return empSex;
	}
	public void setEmpSex(char empSex) {
		this.empSex = empSex;
	}
	public boolean isEmpUSCitizen() {
		return empUSCitizen;
	}
	public void setEmpUSCitizen(boolean empUSCitizen) {
		this.empUSCitizen = empUSCitizen;
	}
	
}