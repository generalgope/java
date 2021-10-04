class ExceptionHandling {
	public static void main(String[] args) {
	
		//StringIndexOutOfBoundsException
		String hello = "Hello World";
		
		try {
			System.out.println(hello.charAt(-1));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.err.println("StringIndexOutOfBoundsException: Invalid index");
			System.out.println(e);
			System.out.println(" ");
		}
		
		//NullPointerException	
		String str = null;
		
		try {
			System.out.println(str.length());
		}
		catch (NullPointerException e) {
			System.err.println("NullPointerException: Cannot operate on a null value");
			System.out.println(e);
			System.out.println(" ");
		}
		
		//NumberFormatException
		String temp = "H3ll0";
		
		try {
			int n = Integer.parseInt(temp);
		}
		catch (NumberFormatException e) {
			System.err.println("NumberFormatException: Cannot convert characters to numbers");
			System.out.println(e);
			System.out.println(" ");
		}
	}
}
