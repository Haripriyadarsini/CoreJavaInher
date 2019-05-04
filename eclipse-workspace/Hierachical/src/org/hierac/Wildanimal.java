package org.hierac;
public class Wildanimal extends BigAnimal{
	
	public void Forest() {
		System.out.println("Elephant,Zebra,Hippo");
	}

	public static void main(String[] args) {
		Wildanimal Y = new Wildanimal();
		Y.Zoo();
		Y.Forest();
	}

}
