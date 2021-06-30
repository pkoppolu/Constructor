package com.info.constructor;
public class ConAccessModifiers {
	ConAccessModifiers(){ // default constructor
		System.out.println("Default constructor called");
	}
	public ConAccessModifiers(int a, int b) { // parameterized constructor
		System.out.println("Double parameter constructor called");
	}
	private ConAccessModifiers(int a, String b) { // parameterized constructor
		System.out.println("Two parameter constructor called ");
	}
	protected ConAccessModifiers(int a, String b, int c) { // parameterized constructor
		System.out.println("Three parameter constructor called");
	}
	public static void main(String[] args) {
		ConAccessModifiers am = new ConAccessModifiers();
		ConAccessModifiers am1 = new ConAccessModifiers(4,5);
		ConAccessModifiers am2 = new ConAccessModifiers(4,"abc");
		ConAccessModifiers am3 = new ConAccessModifiers(4,"dsg",5);
 }
}
