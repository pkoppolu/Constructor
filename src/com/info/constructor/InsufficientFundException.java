package com.info.constructor;
 public class InsufficientFundException {
	 public static void main(String[] args) throws Exception {
		try {
			Account acc = new Account(75637452, "Prudhvi", 19000);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
