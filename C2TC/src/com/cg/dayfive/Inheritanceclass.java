package com.cg.dayfive;

public class Inheritanceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s=new Single();
	    s.child();
		//s.parent();
		//Multilevel inheritance
		Multilevel2 m=new Multilevel2();
		m.happiest();
		m.happier();
		m.happy();
		//Hierarchy inheritance
		Hierarchy_1 h1=new Hierarchy_1();
		//
		Hierarchy_2 h2=new Hierarchy_2();
		h2.tiger();
		h1.lion();
		h2.animal()	;


	}

}
