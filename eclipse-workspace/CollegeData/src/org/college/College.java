package org.college;



public class Code {

	public void collegeName() {
		System.out.println("Anna Univ");
	}
	
	public void collegeCode() {
		System.out.println("Anna Univ");
		}
	
	public void collegeRank() {
		System.out.println("A grade");
		}
}
public class Student extends Code {
		
	public void studentName() {
			System.out.println("Hari");
		}
		
	public void studentDept() {
		System.out.println("BME");
	}	
	
	public void studentId() {
		System.out.println("10102");
	}
}


public class College {
	 public static void main() {
		Student X= new Student();
		X.collegeName();
		X.collegeCode();
		X.collegeRank();
		X.studentName();
		X.studentDept();
	}
}



