import java.util.Scanner;

class StudentDetails {
	String name, enroll, phone;
	Scanner scan = new Scanner(System.in);
		
	void setDetails() {
		System.out.print("Student Name: ");
		name = scan.nextLine();
		System.out.print("Enrollment No: ");
		enroll = scan.nextLine();
		System.out.print("Phone number: ");
		phone = scan.nextLine();
	}
	
	void display() {
		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("Enrollment no: " + enroll);
		System.out.println("Phone no: " + phone);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setDetails();
		s.display();
	}
}
