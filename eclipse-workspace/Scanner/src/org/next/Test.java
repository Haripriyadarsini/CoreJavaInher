package org.next;

import java.util.Scanner;

public class Test {
	public int Addfivenumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the five numbers to add");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int sum = num1+num2+num3+num4+num5;
		return sum;
		
	}

	public static void main(String[] args) {
Test A= new Test();
int Addfivenumbers= A.Addfivenumbers();
System.out.println(Addfivenumbers);
	}

}
