//Create an object for employee class and call methods- empName(),empDob(),empPhone(),empEmail(),empAddress()
package org.emp;

public class Employee {
	public void empId() {
		System.out.println("EmployeeId is 101");
	}
	public void empName() {
		System.out.println("EmployeeId is Hari");
	}
	public void empDob() {
		System.out.println("EmployeeDob is 2/25/2019");
	}
	public void empPhone() {
		System.out.println("EmployeePhone is 9789097657");
	}
	public void empEmail() {
		System.out.println("EmployeeEmail is XXX@gmail.com");
	}
	public void empAddress() {
		System.out.println("EmployeeAddress is #123 2nd st,Chennai");
	}
public static void main(String[] args) {
	Employee x =new Employee();
	x.empName();
	x.empDob();
	x.empPhone();
	x.empEmail();
	x.empAddress();
}
}


