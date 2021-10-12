package org.emp;
import org.company.Company;
import org.client.Client;
import org.project.Project;

public class Employee {

	private void empName() {
	System.out.println("Employee Name is Arun");
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		Company company = new Company();
		Client client = new Client();
		Project project = new Project();
	
		employee.empName();
		company.companyName();
		client.clientName();
		project.projectName();
		
	}
}
