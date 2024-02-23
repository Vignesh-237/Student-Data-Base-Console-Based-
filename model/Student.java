package model;

public class Student {
	static int id;
	private int s_id;
	private int s_age;
	private double s_marks;
	private String s_name;

	public Student() {// L.O.I
	}

	public Student(String s_name, int s_age, double s_marks) {
		// super();
		this.s_marks = s_marks;
		this.s_age = s_age;
		this.s_name = s_name;
		this.s_id = ++id;
	}

	// ID
	public int getS_id() {
		return s_id;
	}
	
	// NAME
	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	// AGE
	public int getS_age() {
		return s_age;
	}

	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	// AGE
	public double getS_marks() {
		return s_marks;
	}

	public void setS_marks(int s_marks) {
		this.s_marks = s_marks;
	}

	@Override
	public String toString() {
		return "\n ID : "+s_id+"\n Name : " + s_name + "\n Age : " + s_age + "\n Marks : " + s_marks + "\n";
	}

	public boolean equals(Student s) {
//		Student s = (Student) obj;
		return s_age == s.s_age && s_marks == s.s_marks && s_name == s.s_name;
	}

	@Override
	public int hashCode() {
		return s_age + Double.hashCode(s_age) + s_name.hashCode();
	}
}
