package week1.day1;

import week1.day2.Calculator;

public class Student {
	public String getDetails(	int rollno,float mark) {
		return rollno + ", " + mark;
	
	}
	public String getName(String name,String collegeName) {
		return name + ", " + collegeName;
	}
	public float getMarks(float cgpa) {
		return cgpa;
	}
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println(stud.getDetails(1,1.0f));
		System.out.println(stud.getName("kalai","fx"));
		System.out.println(stud.getMarks(7.2f));
		Calculator ca =new Calculator();
		System.out.println(ca.mul(6,4));
	}
}
