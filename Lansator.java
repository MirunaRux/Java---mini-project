package lab3;

import jucarii.Profesor;
import jucarii.Student;
import lab3.numarator.ClassCounter;

public class Lansator {
	static { System.out.println("static1");}
	public static int nr = 1;
	static { System.out.println("static2");}
	
	{System.out.println("bloc1");}
	public int altNr = 2;
	{System.out.println("bloc2");}

	public static void main(String args[]) {
		new Student();
		new Student();
		new Profesor();
		new Profesor();
		
		System.out.println(ClassCounter.getInstance().getCount("student"));
		System.out.println(new Student());
	}
}
