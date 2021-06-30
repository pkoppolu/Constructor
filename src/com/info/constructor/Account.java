package com.info.constructor;
 class Account {
	long acno;
	String name;
	double balance;
	int amount;
	public Account(long acno, String name, int amount) throws Exception {
		this.acno = acno;
		this.name = name;
		this.balance = 20000; // needs to maintain minimum balance is 5000
		int x= (int) (balance-amount);
		System.out.println("Balance is "+x);
		this.amount= amount;
		if((balance-amount) < 5000) {
			throw new Exception("Low Balance");
		}
		else {
			balance = balance - amount;
			}
		}
		
}
