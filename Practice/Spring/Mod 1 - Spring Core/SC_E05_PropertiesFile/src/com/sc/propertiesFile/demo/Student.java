package com.sc.propertiesFile.demo;

public class Student {

	private int rollno;
	private String name;
	private double fee;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fee=" + fee + "]";
	}

}
