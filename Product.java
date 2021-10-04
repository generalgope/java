import java.util.Scanner;

public class Product {
	public String productID, productName;
	public double price;

	public static void main(String[] args) {
	DisplayDetails product = new DisplayDetails();

		for (int i = 0; i < 2; i++) {
			product.details();
			product.display();
		}
	}
}

class ProductDetails extends Product{
	Scanner scan = new Scanner(System.in);

	void details() {
		System.out.print("Enter product ID: ");
		productID = scan.nextLine();
		System.out.print("Enter product name: ");
		productName = scan.nextLine();
		System.out.print("Enter product price: ");
		price = scan.nextInt();
		scan.nextLine();
		System.out.println(" ");
	}
}

class DisplayDetails extends ProductDetails {
	void display() {
		System.out.println("Product ID: " + productID);
		System.out.println("Product name: " + productName);
		System.out.println("Product price: " + price);
		System.out.println(" ");
	}
}
