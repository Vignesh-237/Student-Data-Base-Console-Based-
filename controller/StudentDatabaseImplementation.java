package controller;

import java.util.*;
import view.*;
import model.*;

import java.util.LinkedHashMap;

public class StudentDatabaseImplementation implements StudentDatabase {
	static LinkedHashMap<Integer, Student> s = new LinkedHashMap<>();

	@Override
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter Student Name : ");
		String name = sc.next();
		System.out.print("\n\tEnter Student age : ");
		int age = sc.nextInt();
		System.out.print("\n\tEnter Student mark : ");
		double mark = sc.nextDouble();
		Student std = new Student(name, age, mark);
		s.put(std.getS_id(), std);
		System.out.println("\n\t\t\t ~~~~~ STUDENT ADDED IN DATABASE ~~~~~");
	}

	@Override
	public void displayAllStudents() {
		Set<Integer> s1 = s.keySet();
		if (s.isEmpty()) {
			System.out.println("\n\t\t\t ~~~~~ NO STUDENTS ADDED ~~~~~");
		} else {
			System.out.println("\n\t\t\t --- ALL STUDENTS ---");
			for (Integer ele : s1) {
				System.out.println(s.get(ele) + " ");
			}
		}
	}

	@Override
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter Student ID : ");
		int id = sc.nextInt();
		if (s.containsKey(id)) {
			System.out.println(s.get(id));
		} else {
			System.out.println("\n\t\t\t!!!!! STUDENT NOT FOUND!!!!!");
		}
	}

	@Override
	public void removeStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter Student ID : ");
		int id =sc.nextInt();
		if (s.containsKey(id)) {
			System.out.println(s.remove(id));
			System.out.println("\n\t\t\t ~~~~~ STUDENT REMOVED ~~~~~");
		} else {
			System.out.println("\n\t\t\t ~~~~~ STUDENT NOT FOUND ~~~~~");
		}
	}
}
