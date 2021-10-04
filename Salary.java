timport java.util.Scanner;

public class Employee {
	String name, designation;
	int num; 
	Scanner scan = new Scanner(System.in);
	
	void basicData() {
		System.out.print("Employee name: ");
		name = scan.nextLine();
		System.out.print("Employee designation: ");
		designation = scan.nextLine();
		System.out.print("Employee number: ");
		num = scan.nextInt();
	}
	
	void edata() {
		System.out.print("Basic Pay: ");
		basePay = scan.nextInt();
		System.out.print("H.R.A: ");
		HRA = scan.nextInt();
	}
		
	void calcSalary() {
		int salary = basePay + HRA * (basePay + HRA);
		System.out.println("Salary: " + salary);
	}
}

public class Salary extends Employee {
	public static void main(String[] args) {
		int basePay, HRA;
		Scanner scan = new Scanner();
		Salary e = new Salary();
		
		e.basicData();
		e.edata();
		e.calcSalary();
		
	}
}
