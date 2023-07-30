package com.cg.daytwo;

import java.util.Scanner;

public class Switchclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the choice:");  
		int ch= sc.nextInt(); 
		switch(ch) {
		case 1:
			System.out.println("APPLE");
			break;
		case 2:
			System.out.println("BANANA");
			break;
		case 3:
			System.out.println("GRAPE");
			break;
		case 4:
			System.out.println("ORANGE");
			break;
		}

	}

}
