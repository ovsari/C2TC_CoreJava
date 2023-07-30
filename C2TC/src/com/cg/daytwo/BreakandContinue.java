package com.cg.daytwo;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		while(a<=10) {
			System.out.println(a);
			a+=5;
			System.out.println(a);
			break;
		}
		System.out.println("****************************");
		while(a<=10) {
			System.out.println(a);
			a+=1;
			continue;
		}
		
	}

}
