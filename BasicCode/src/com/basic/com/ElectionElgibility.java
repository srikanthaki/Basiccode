package com.basic.com;
import java.util.Scanner;


public class ElectionElgibility {

	public static void main(String[] args) {
		Enrollment em =new Enrollment();
		Scanner sc =new Scanner(System.in);
		System.out.println("What is the age of the person");
		if (em.setAge(sc.nextInt()) >= 18 ) {
		System.out.println("The age of the person is "+ em.getAge());
		
		System.out.println("The age of the person is elgible for vote");
		}
		else{
			System.out.println("The age of the person is "+ em.getAge());
			
			System.out.println("The age of the person is not elgible for vote");	
	
		
	 }
	}

}
