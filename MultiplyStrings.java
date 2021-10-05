class MultiplyStrings {
	public static void main(String[] args) {
		String num1 = "7";
		String num2 = "9";
		int product = 0;
		
		//Only works for 1 digit values
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
		
		//Converting integer to string
		String answer = "";
		String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		//product = 2002;
		int digit, count, temp = product;
		
		//Step 1: Count the number of digits
		for (count = 0; temp > 0; count++) {
			temp /= 10; 	
		}
		
		int[] nums = new int[count];
		int i = 0;
		temp = product;
		
		//Step 2: Split each digit and store them in array nums[]
		while (temp > 0) {
			digit = temp % 10;
			temp /= 10;
			nums[i++] = digit;
		}
		
		//Step 3: Compare each digit in num[] with elements in digits[]
		for (int j = count - 1; j >= 0; j--) {	
			for (int k = 0; k <= 9; k++) {
				if (nums[j] == k) {
					answer = answer + digits[k];
				}
			}
		}
		System.out.println("Product: " + answer);
		
	}
}
