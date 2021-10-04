import java.util.Scanner;

class Employee {
	String name, num, designation;
	Scanner scan = new Scanner(System.in);

	void basicDetails() {
		System.out.print("Employee name: ");
		name = scan.nextLine();
		System.out.print("Employee number: ");
		num = scan.nextLine();
		System.out.print("Employee designation: ");
		designation = scan.nextLine();
	}		
}

class Salary extends Employee {
	int basePay, HRA, salary;
	Scanner scan = new Scanner(System.in);

	void payDetails() {
		System.out.print("Base Pay: ");
		basePay = scan.nextInt();
		System.out.print("H.R.A: ");
		HRA = scan.nextInt();
	}

	int calcPay() {
		salary = basePay + HRA * (basePay + HRA);
		return salary;
	}

	void display() {
		System.out.println("Total Salary: " + salary);
		System.out.println(" ");
	}

	public static void main (String[] args) {
		Salary e = new Salary();

 		for (int i = 0; i < 5; i++) {
			e.basicDetails();
			e.payDetails();
			e.calcPay();
			e.display();
		}
	}
}
