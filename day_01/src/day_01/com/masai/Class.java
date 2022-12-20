package day_01.com.masai;

public class Class {
	
	/*
	Q1) Write the difference between JRE, JDK and JVM?
	Ans:- JRE:- it is java RunTime Enviroment.jre is way to the communicate between complier to java Program and they
	will provide some types of RunTiem Enviroment.
	
	JDK:- it is a software tools. they will provide devlopment enviroment of java program;
	
	JVM:- jvm excute the byte code.
	      
	
	
			Q2) Write the difference between JSE, JEE and JME?
			Q3) How does java achieve platform independency?
			Q4) What are features of Java and explain them?
			Q5) Write a Java Application which prints your details? */
	
	String name;
	int roll;
	int  marks;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		this.roll = roll;
	}




	public int getMarks() {
		return marks;
	}




	public void setMarks(int marks) {
		this.marks = marks;
	}

	



	public Class(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	



	@Override
	public String toString() {
		return "Class [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}


	void display() {
		System.out.println(marks+" "+roll+" "+name);
	}


	public static void main(String[] args) {
		Class obj= new Class("Nitish", 1,523);
		
		 obj.display();
		
	}
	



}
