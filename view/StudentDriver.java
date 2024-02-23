package view;

import java.util.*;
import model.*;
import controller.*;

import controller.StudentDatabaseImplementation;

public class StudentDriver {
	static Scanner sc=new Scanner(System.in);
	static boolean choice = true;

	public static void main(String[] args) {
		StudentDatabase s = new StudentDatabaseImplementation();
		
		do {
			System.out.println("\n\t\t\tWELCOME TO JSPIDER's");
			System.out.println("\n\t\t\t 1. Add A Student. \n\t\t\t 2. Display All Students. \n\t\t\t 3. Search Student. \n\t\t\t 4. Remove Student. \n\t\t\t 5. Exit.");
			System.out.print("\n\t\t Enter your choice : ");
			int user_choice=sc.nextInt();
			switch (user_choice) 
			{
				case 1:{//add student
					s.addStudent();				
					break;
				}
				case 2:{//display all student
					s.displayAllStudents();
					break;
				}
				case 3:{//search student
					s.searchStudent();
					break;
				}
				case 4:{//remove student
					s.removeStudent();
					break;
				}
				case 5:{
					System.out.println("\n\t\t\t ~~~~~ THANK YOU ~~~~~");
					choice = false;
					break;
				}

				default:{
					System.out.println("\n\t\t\t~~~~~INVALID INPUT~~~~~");
					break;
				}
			}
		} while (choice);
	}
}
