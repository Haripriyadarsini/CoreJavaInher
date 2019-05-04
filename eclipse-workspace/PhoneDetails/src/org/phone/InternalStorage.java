package org.phone;

public class InternalStorage {

	public void processorName() {
		System.out.println("processorName is Intel");
	}
	public void ramSize() {
		System.out.println("RAM size is 5GB");
	}
public static void main(String[] args) {
	InternalStorage X = new InternalStorage();
	X.processorName();
	X.ramSize();
	ExternalStorage Y = new ExternalStorage();
	Y.size();
}
}