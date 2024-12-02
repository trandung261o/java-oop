package oop.cnpm;

public class Manager {
	private Student[] students;
	public void initialize() {
		students = new Student[10];
		students[0] = new Student();
		//student[0].name = "Hung"; error
		students[0].setName("Hung");
	}
}	
