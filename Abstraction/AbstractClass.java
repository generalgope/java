abstract class Department {
	String university, college;
	
	abstract void subjectList();

	void display() {
		subjectList();
	}
}

class ComputerEngg extends Department {
	void subjectList() {
		System.out.println("CE Subjects:");
		System.out.println("Engineering Math 3");
		System.out.println("Compiler Design");
		System.out.println("OOP with Java");
		System.out.println(" ");
	}
}

class ElectricalEngg extends Department {
	void subjectList() {
		System.out.println("EE Subjects:");
		System.out.println("Electrical Engineering");	
		System.out.println("Engineering Math 3");
		System.out.println("Circuit Design");
		System.out.println(" ");
	}
}

class AbstractClass {
	public static void main(String[] args) {
		ComputerEngg ce = new ComputerEngg();
		ElectricalEngg ee = new ElectricalEngg();

		ce.display();
		ee.display();
	}
}
