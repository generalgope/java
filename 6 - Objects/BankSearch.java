import java.util.Scanner;

class BankSearch {
	Scanner scan = new Scanner(System.in);
	String[] name = new String[5];
	String[] num = new String[5];
	int[] balance = new int[5];
	int i = 0;
	
	void setDetails() {
		System.out.print("Enter name of account holder: ");
		name[i] = scan.nextLine();
		System.out.print("Enter an account number: ");
		num[i] = scan.nextLine();
		System.out.print("Enter a balance: ");
		balance[i] = scan.nextInt();
		System.out.println(" ");
		scan.nextLine();
	}
	
	void display() {
		System.out.println("Name of account holder is, " + name[i]);
		System.out.println("Account number is, " + num[i]);
		System.out.println("Current balance is, " + balance[i]);
		System.out.println(" ");
	}
	
	void search() {
		String account;
		System.out.print("Enter an account number: ");
		account = scan.nextLine();
		
		for (int i = 0; i < 5; i++) {
			if (account.equals(num[i])) {
				System.out.println("Details for account number " + num[i]);
				System.out.println("Account holder name: " + name[i]);
				System.out.println("Account balance: " + balance[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		BankSearch account = new BankSearch();
		
		for (int i = 0; i < 5; i++) {
			account.setDetails();
			account.display();
			account.i++;
		}
		account.search();
	}
}


