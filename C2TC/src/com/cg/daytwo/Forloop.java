package com.cg.daytwo;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
		int a=5;
		for(int i=0;i<=a;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

