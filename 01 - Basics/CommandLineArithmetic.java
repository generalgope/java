class CommandLineArithmetic {
	public static void main (String args[]) {
		int i, sum = 0;
		double doubleSum, avg;
		int num = Integer.parseInt(args[1]);
		
		switch (args[0]) {
			case "odd":
				for (i = 0; i <= num; i++) {
					if ((i %2 ) != 0)
						System.out.print(i + " ");
				}
				System.out.println();
				break;			
			case "even":
				for (i = 0; i <= num; i++) {
					if ((i % 2) == 0)
						System.out.print(i + " ");
				}
				System.out.println();
				break;	
			case "sum":
				for (i = 0; i <= num; i++) {
					sum += i;
				}
				System.out.println("Sum = " + sum);
				break;	
			case "avg":
				for (i = 0; i <= num; i++) {
					sum += i;
				}
				doubleSum = sum;
				avg = doubleSum / num;
				System.out.println("Average = " + avg);
				break;
		}
	}
}
