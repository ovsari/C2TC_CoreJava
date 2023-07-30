package com.cg.daytwo;

public class Nestedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=0;i<=a;i++) 
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
