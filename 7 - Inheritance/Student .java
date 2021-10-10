/* 1. class Student with enrollNum, examNum, studentName
   2. class Exam extends Student with fields to store marks for 3 subjects, it has a method to calculate() result
   3. print Details for 2 students
   4. Use super keyword
*/

import java.util.Scanner;

public class Student {
	public String enroll, examNum, name;

	public static void main(String[] args) {
		Exam student = new Exam();

		for (int i = 0; i < 2; i++) {
			student.getDetails();
			student.calculate();
		}
	}
}

class Exam extends Student {
	int[] marks = new int[3];
	double totalMarks;
	double result;
	Scanner scan = new Scanner(System.in);	

	void getDetails() {
		System.out.print("Enter enrollment number: ");
		super.enroll = scan.nextLine();
		System.out.print("Enter exam number: ");
		super.examNum = scan.nextLine();
		System.out.print("Enter student name: ");
		super.name = scan.nextLine();
		System.out.print("Enter total marks: ");
		totalMarks = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter marks for subject " + (i + 1) + ": ");
			marks[i] = scan.nextInt();
			scan.nextLine();
		}
		System.out.println(" ");
	}

	void calculate() {
		for (int i = 0; i < 3; i++) {
			result = (marks[i] / totalMarks) * 100;
			System.out.println("Result for subject " + (i + 1) + ": " + result + "%");
		}
		System.out.println(" ");
	}
}
