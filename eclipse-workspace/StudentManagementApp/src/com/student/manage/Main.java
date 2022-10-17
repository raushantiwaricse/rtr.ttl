package com.student.manage;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws IOException {
		System.out.println(" Welcome to Student Management Application ");
		while(true) 
		{
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Press 1 to Add Student");
		System.out.println("Press 2 to Delete Student");
		System.out.println("Press 3 to Display Student");
		System.out.println("Press 4 to exit Student App");		
		int choice = scan.nextInt();
		
		if(choice==1) {
			// add student
			System.out.println("Enter Student Name:");
			String name = scan.next();
			
			System.out.println("Enter Student phone Number:");
			String phone = scan.next();
			
			System.out.println("Enter your city name : ");
			String city = scan.next();
			
			Student st1 = new Student(name,phone,city);
			
			boolean ans = StudentDataSave.insertStudentToDB(st1);
			if(ans) {
				System.out.println("Student is added successfully");
			}
			else {
				System.out.println("Something went wrong");
			}
		}
		else if(choice ==2) {
			// delete student
		}
		else if(choice==3) {
			//display student
		}
		else if(choice==4) {
			//exit
			break;
		}
		else 
		{
			
		}
		}
		System.out.println("Thank you for using my App");
		System.out.println("See you again");
	}

}
