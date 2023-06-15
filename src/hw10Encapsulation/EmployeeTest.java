package hw10Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Muhammad A Mughnee");
		employee.setEmpAge(40);
		employee.setEmpSex('M');
		employee.setEmpUSCitizen(true);
		

		System.out.println("Employee Name is: " + employee.getEmpName() + ". \nEmployee Age is: "
				+ employee.getEmpAge() + ". \nEmployee Sex is: " + employee.getEmpSex()
				+ ". \nThe Status of Employee's US Citizenship is: " + employee.isEmpUSCitizen());


}
}