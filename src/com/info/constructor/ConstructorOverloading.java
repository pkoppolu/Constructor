package com.info.constructor;
public class ConstructorOverloading {
	int x, y, z;
	ConstructorOverloading(int x, int y){
		this.x = x;
		this.y=y;
		int addition = x+y;
		System.out.println("The addition of two numbers: "+addition);
	}
	ConstructorOverloading(int x, int y, int z){
		this(1,2);
		int addition = x+y+z;
		System.out.println("The addition of three numbers: "+addition);
	}
	ConstructorOverloading(int x){
		this(1,2,3);
		System.out.println("Addition is not possible with single number "+x);
	}
	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading(2,3,4);
		ConstructorOverloading c2 = new ConstructorOverloading(4,1);
		ConstructorOverloading c3 = new ConstructorOverloading(4);
	}
}
