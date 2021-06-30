package com.info.constructor;
public class DefiningConstructor {
	private DefiningConstructor(){ // Defining a constructor
		System.out.println("Constructor is called");
	}
	public static void main(String[] args) {
		DefiningConstructor con = new DefiningConstructor();
	}
}
