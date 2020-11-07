package com.basic.com;

public class Student {
int rollno;
String Name;
static String college ="MGT";
static void change() {
	college="MGIT";
}
Student (int r,String n){
	rollno=r;
	Name=n;
}
void display() {
	System.out.println(rollno+""+Name+""+college);
}
}
