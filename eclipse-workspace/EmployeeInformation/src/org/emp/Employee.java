package org.emp;
import org.company.*;
import org.client.*;
import org.project.*;

public class Employee {
	public void empName() {
		System.out.println("Hari");
	}

	public static void main(String[] args) {
		Employee x= new Employee();
		x.empName();
		Client y = new Client();
		y.clientName();
		Company z= new Company();
		z.companyName();
		Project l = new Project();
		l.projectName();
	}

}
