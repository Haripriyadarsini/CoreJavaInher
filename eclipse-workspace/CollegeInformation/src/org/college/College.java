package org.college;

public class College {

	public void collegeName() {
		System.out.println("CollegeName SSN");
	}
		public void collegeCode() {
			System.out.println("CollegeCode 501");
		}
			public void collegeRank() {
				System.out.println("CollegeRank First");
			}		
				
				
	public static void main(String[] args) {
		College M = new College();
		M.collegeName();
		M.collegeCode();
		M.collegeRank();
	Dept N = new Dept();
	N.deptName();
	Hostel H = new Hostel();
	H.hostelName();
	Student S = new Student();
	S.studentName();
	}

}
