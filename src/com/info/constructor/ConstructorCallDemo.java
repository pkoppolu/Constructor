package com.info.constructor;

import java.util.Scanner;

public class ConstructorCallDemo   {
public static void main(String[] args) {
	System.out.println("Which datatype you want to print: ");
	System.out.println("Print 1 for INTEGER");
	System.out.println("Print 2 for CHARACTER");
	System.out.println("Print 3 for STRING");
	System.out.println("Print 4 for DOUBLE\n");
	int num;
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	if(num == 1) {
		Constructorcall cc = new Constructorcall(10);		
	}
	else if(num == 2) {
		Constructorcall cc1 = new Constructorcall('A');		
	}
	else if(num == 3) {
		Constructorcall cc2 = new Constructorcall("Riya");		
	}
	else if(num == 4) {
		Constructorcall cc3 = new Constructorcall(10.5);		
	}
	else {
		System.out.println("You have entered INVALID number");
	}
	sc.close();
}
}
