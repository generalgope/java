import java.util.Scanner;

class Factorial {
	public static void main(String args[]) {
		int num, factorial = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		
		for (int i = num; i > 0; i--) { 
			factorial = factorial * i;
			System.out.println(factorial + " " + i);
		}
		
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
