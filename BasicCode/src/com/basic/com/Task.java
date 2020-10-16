package com.basic.com;
import java.util.Scanner;


public class Task {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		UserDetails us = new UserDetails ();
		System.out.println("ENter the Name");
		us.setName(s.nextLine());
		System.out.println("Enter the age");
		us.setAge(s.nextLine());
		System.out.println("Name:"+us.getName()+"Age:"+us.getAge());
		
		
	

	}

}
