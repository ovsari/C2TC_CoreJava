package com.cg.daysix;

public class Finalmethod {
	 final void run(){
		  System.out.println("running");
		  }  
	}  

	class Final2 extends Finalmethod{  
	   void run(){//can't override final method
		   System.out.println("running safely with 100kmph");
		   }  
}
