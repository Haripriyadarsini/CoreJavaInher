package org.colleges;

class Colleges {

	public void collegeName() {
		System.out.println("Anna Univ");
	}
	
	public void collegeCode() {
		System.out.println("Anna Univ");
		}
	
	public void collegeRank() {
		System.out.println("A grade");
		}

class Student extends Colleges {
		
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
//public class Hostel extends Student{
	
//	public void hostelName() {
	//		System.out.println("MGM");
		//}
//public class Dept extends Hostel {
	
	//public void deptName() {
		//System.out.println("BME dept");
	//}
//}

public static void main(String args[])
{
		Student X = new Student();
		X.collegeName();
		X.collegeCode();
		X.collegeRank();
		X.studentName();
		X.studentDept();
		X.studentId();
		//X.hostelName();
      //  X.deptName();
		
 	}
}





