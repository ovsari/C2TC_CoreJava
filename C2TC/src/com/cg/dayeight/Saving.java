package com.cg.dayeight;

public class Saving extends Man implements Banks {
	private int acc_no;
	private float balance;
	public Saving() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Saving(int acc_no, float balance) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void deposit(float amount) {
		if(amount >30000) {
			System.out.println("exceeds daily limit rs.30000");
		}
		else {
			balance+=amount;
			System.out.println("the total balance is "+balance);
		}
	}
	public void withdraw(float amount) {
		if(amount>balance) {
			System.out.println("Insufficient amount");
		}
		else {
			balance-=amount;
			System.out.println("amount withdrawn "+amount);
			System.out.println("Your account balance "+balance);
		}
	}
	@Override
	public String toString() {
		return "Saving [acc_no=" + acc_no + ", balance=" + balance + "]";
	}
	
}
