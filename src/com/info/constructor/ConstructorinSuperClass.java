package com.info.constructor;
class SuperClass{
	String name;
	SuperClass(){
		System.out.println("This is Super class constructor");
	}
	SuperClass(String name){
		this.name = name;
		System.out.println("Super class constructor with single parameter");
	}
}
public class ConstructorinSuperClass extends SuperClass{
	ConstructorinSuperClass(){
		super();
		System.out.println("Child class constructor");
	}
	ConstructorinSuperClass(String name, int id){
		super("prudhvi");
		System.out.println("Child class constructor with two parameters");
	}
	public static void main(String[] args) {
		ConstructorinSuperClass cs = new ConstructorinSuperClass();
}
}
