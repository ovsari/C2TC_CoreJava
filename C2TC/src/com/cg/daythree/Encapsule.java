package com.cg.daythree;

public class Encapsule {
	private String name;
	private int id;
	private int num;
	public Encapsule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Encapsule(String name, int id, int num) {
		super();
		this.name = name;
		this.id = id;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", num=" + num + "]";
	}
	

}
