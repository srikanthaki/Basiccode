package com.basic.com;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Student S1 = new Student(123,"mohan");
	   Student S2 = new Student(213,"gopian");
	   Student S3 = new Student(213,"gopian");
	   S1.display();
	   Student.change();
	   S2.display();
	   Student.college="VIT";
	   S3.display();
	}

}
