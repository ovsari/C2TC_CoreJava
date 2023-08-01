package com.cg.dayeight;

public interface Banks {
	static final float min_balance=5000; 
	static final float deposit_limit=35000;
	public void deposit(float amount);
	public void withdraw(float amount);

}
