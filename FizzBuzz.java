class FizzBuzz {
	public static void main(String[] args) {
		String answer;
	
		for (int n = 1; n <= 100; n++) {
			answer = "";
			if (n % 3 == 0) {
				answer = "Fizz";
			}
			if (n % 5 == 0) {
				answer += "Buzz";
			}
			if (n % 3 != 0 && n % 5 != 0){
				answer = Integer.toString(n);
			}
			System.out.println(answer);
		}
	}
}
