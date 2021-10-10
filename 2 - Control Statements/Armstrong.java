import java.util.Scanner;

class Armstrong {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	
		int num, temp, count, digit, sum = 0;
		
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		temp = num;
		
		for (count = 0; temp > 0; count++) {
			temp /= 10; 	//temp = temp / 10
		}
		
		temp = num;
		while(temp > 0) {
			digit = temp % 10;
			temp /= 10;
			sum += Math.pow(digit, count);
		}
		
		if (num == sum) {
			System.out.println(num + " is an Armstrong number.");
		}
		else {
			System.out.println(num + " is not an Armstrong number.");
		}
	}
}


