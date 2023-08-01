package com.cg.daysix;

public class Staticvar {
	String name;
	int id;
	static String college = "IFET";

	public Staticvar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staticvar(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	static void methodStatic() {
		college =" IFET College Of Engineering";
	}
	public void display(String name, int id) {
		System.out.println(name +" "+id +" "+college);

	}
}
