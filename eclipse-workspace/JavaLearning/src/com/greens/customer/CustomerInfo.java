package com.greens.customer;//PACKAGE

public class CustomerInfo //CLASS
 {
	public void customerId() //METHOD
	{
	System.out.println("CustomerID is 1");
		}
	public void customerName() //METHOD
	{
		System.out.println("CustomerName is XYZ");
		
	}

	public static void main(String[] args) {
//Create object		
CustomerInfo x=new CustomerInfo();
x.customerId();
x.customerName();
	}

}
