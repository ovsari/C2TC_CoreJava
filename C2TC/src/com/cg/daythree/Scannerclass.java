package com.cg.daythree;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int marks = sc.nextInt();   
		if(marks>90&& marks<=100) {
			System.out.println("Pass");
		}
		else if(marks>=60&& marks<=90) {
			System.out.println("Just Pass");
		}
		else {
			System.out.println("Failed");
		}

	}

}
