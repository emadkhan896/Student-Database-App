package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int  gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the first name: ");
		this.firstName = sc.next();
		
		System.out.print("Enter the last name: ");
		this.lastName = sc.next();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop , user hits 0
		
		do {
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {break;}
		} while(1 != 0);
		
		//System.out.println("Enrolled IN: " + courses);
		//System.out.println("Tution Balance: " + tuitionBalance);
		
	}
	
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// Pay tuition
	 public void payTuition() {
		 viewBalance();
		 System.out.print("Enter your Payment: $");
		 Scanner sc = new Scanner(System.in);
		 int payment = sc.nextInt();
		 tuitionBalance = tuitionBalance - payment;
		 System.out.println("Thankyou you for your payment of $" + payment);
		 viewBalance();
	 }
	
	// Show status
	 public String toString() {
		 return "Name: " + firstName + " " + lastName +
				 "\nstudent ID: " + id +
				 "\nGrade Level: " + gradeYear +
		        "\nCourses Enrolled: " + courses +
		        "\nBalance: $" + tuitionBalance;
		 
	 }
}
