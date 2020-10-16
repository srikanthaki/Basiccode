package com.basic.com;



import java.sql.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLClassLoader;

public class CommitRollback {
	private static final String db = "jdbc:mysql://localhost:3306/repo";
	private static final String user = "root";
	private static final String pwd = "root";
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	private static PreparedStatement pstmt;
	
	
	public static void main(String args[])  {
		CommitRollback d1 = new CommitRollback();
		
	/*	ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)cl).getURLs();
        for(URL url: urls){
        	System.out.println(url.getFile());
        } */

		
		
	
	
		//hardcoding - run more than once and see what happens
		//String query2 = "Insert into coolthings.cars_tbl (car_regn, car_model, car_color, car_mileage) \n" +
		//				"values ('GA02 BB 1234','Lotus', 'Black', 2700)";
		
		//Prepared statement
		
		String query2 = "Insert into coolthings.cars_tbl (car_regn, car_model, car_color, car_mileage) values (?,?,?,?)";
		
		Scanner s2 = new Scanner(System.in	);
		
		char ans = ' ' ;
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con=DriverManager.getConnection(db, user, pwd);
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(query2);
			System.out.println("Car regn:");
			pstmt.setString(1, s2.nextLine());
			System.out.println("Car model:");
			pstmt.setString(2, s2.nextLine());
			System.out.println("Car color:");
			pstmt.setString(3, s2.nextLine());
			System.out.println("Kms run:");
			pstmt.setInt(4, s2.nextInt());
			s2.nextLine();
			
			int ret = pstmt.executeUpdate();
		
			if (ret == 1) {
				System.out.println("Enter C for Confirm  or A for Abort:");
				ans = s2.nextLine().charAt(0);
				if (ans == 'C') {
					con.commit();
					System.out.println("Successfully added a new record");
				}
				else {
					con.rollback();
					System.out.println("Aborted the transaction");
				}
			}
			else {
				System.out.println("Unable to add a new record");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
			con.close();
			pstmt.close();
			s2.close();
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
	}
	
	}
	
	}
	
	


	
