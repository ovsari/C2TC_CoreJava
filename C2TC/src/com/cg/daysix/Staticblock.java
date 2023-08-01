package com.cg.daysix;

public class Staticblock {

		static{
			System.out.println("Static block is executed before the main function");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Its true when static block is there then main function will be executed after static ");
		}
	}
