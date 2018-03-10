package jucarii;

import lab3.numarator.ClassCounter;

public class Student {
	private String nume;
	private int varsta;
	private Student coleg;
	
	
	public Student() {
		ClassCounter.getInstance().instantaNoua("student");
	}
	
	public Student(Student original) {
		this.nume = original.nume;
		this.varsta = original.varsta;
		this.coleg = original.coleg;
	}
	
	public String toString() {
		return "Studentul are numele " + nume;
	}
}
