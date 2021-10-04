/* 1. abstract class Department with university, college and method display(), abstract method subject_list()
   2. subclasses CE and EE which implement subject_list() method
   3. Display subjects offered by CE and EE dept.
*/

abstract class Department {
	String university, college;
	
	abstract void subjectList();

	void display() {
		subjectList();
	}
}

class CE extends Department {
	void subjectList() {
		System.out.println("CE Subjects:");
		System.out.println("Engineering Math 3");
		System.out.println("Compiler Design");
		System.out.println("OOP with Java");
		System.out.println(" ");
	}
}

class EE extends Department {
	void subjectList() {
		System.out.println("EE Subjects:");
		System.out.println("Electrical Engineering");	
		System.out.println("Engineering Math 3");
		System.out.println("Circuit Design");
		System.out.println(" ");
	}
}

class Abstract {
	public static void main(String[] args) {
		CE ce = new CE();
		EE ee = new EE();

		ce.display();
		ee.display();
	}
}
