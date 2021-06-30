package com.info.constructor;
public class ConstructorParameters {
	String dogname;
	String color;
	int age;
	ConstructorParameters(String name, String color, int age){
		this.dogname = name;
		this.color = color;
		this.age =age;
		System.out.println("Constructor with parameters");
		System.out.println("Dog Name= "+name);
		System.out.println("Color= "+color);
		System.out.println("Age= "+age);
	}
		public static void main(String[] args) {
			ConstructorParameters cp = new ConstructorParameters("Golden Retreiver", "Black", 5);	
 }
}
