package com.cg.dayone;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WIDENING");//lower to higher data type
		byte b=100;
		System.out.println(b);
		short s=b;
		System.out.println(s);
		int i=s;
		System.out.println(i);
		long l=i;
		System.out.println(l);
		float f=l;
		System.out.println(f);
		double d=l;
		System.out.println(d);
		System.out.println("************************");
		System.out.println("NARROWING");//higher to lower data type
		double d1=109.87;
		System.out.println(d1);
		float f1=(float) d1;
		System.out.println(f1);
		long l1=(long)f1;
		System.out.println(l1);
		int i1=(int)l1;
		System.out.println(i1);
		short s1=(short)i1;
		System.out.println(s1);
		byte b1=(byte)s1;
		System.out.println(b1);
	}

}
