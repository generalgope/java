import java.util.Scanner;

class Descending {
	public static void main (String[] agrs) {
		int[] marks = new int[5];
		int temp;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter marks for student " + (i + 1) + ": ");
			marks[i] = scan.nextInt();
		}
		
		System.out.println("Marks in descending order: ");
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (marks[j] > marks[i]) {
					temp = marks[j];
					marks[j] = marks[i];
					marks[i] = temp;
				}
			}
		System.out.println(marks[i] + " ");
		}
	}
}
