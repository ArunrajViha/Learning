package com.capgemini.concept;

public class ClassB extends ClassA{
	
	@Override
	void printMsg() {
		System.out.println("Hello Team");
	}

	@Override
	void calculateTax() {
		double income = 1247.50;
		double tax = income*0.07;
		System.out.println(tax);
	}

}
