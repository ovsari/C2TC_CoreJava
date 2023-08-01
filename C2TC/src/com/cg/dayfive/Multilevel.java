package com.cg.dayfive;

public class Multilevel {
	void happy() {
		System.out.println("Main layer");
}
}
class Multilevel1 extends Multilevel{
	void happier() {
		System.out.println("sublayer");
}
}
class Multilevel2 extends Multilevel1{
	void happiest() {
		System.out.println("subsublayer");
}
}
