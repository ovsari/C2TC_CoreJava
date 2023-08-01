package com.cg.dayeight;

public class Interfacemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving savings=new Saving();
		savings.setAcc_no(201021069);
		savings.setBalance(100000);
		savings.setCity("Banglore");
		savings.setName("Zara");
		savings.deposit(50000);
		savings.withdraw(10000);
		System.out.println(savings.toString());
	}

}
