class InvalidPhoneNumberException extends Exception {
	public InvalidPhoneNumberException(String phone) {
		super(phone);
	}
}

class CustomException {
	static void check(String phone) throws InvalidPhoneNumberException{
		if (phone.length() > 10 || phone.length() < 10) {
			throw new InvalidPhoneNumberException("Invalid phone number");
		}
		else {
			System.out.println("Valid phone number");
		}
	}
	
	public static void main(String[] args) {
		try {
			check("123456789012");
		}
		catch (InvalidPhoneNumberException e) {
			System.out.println(e);
		}
	}
}
