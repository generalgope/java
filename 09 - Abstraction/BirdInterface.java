interface Bird {
	public void food();
	public void voice();
}

class Peacock implements Bird {
	public void food() {
		System.out.println("Peacock eats worms");
	}
	
	public void voice() {
		System.out.println("Peacock squawks");
	}
}

class Sparrow implements Bird {
	public void food() {
		System.out.println("Sparrow eats grains");
	}
	
	public void voice() {
		System.out.println("Sparrow chrips");
	}
}

class BirdInterface {
	public static void main(String[] args) {
		Peacock p = new Peacock();
		Sparrow s = new Sparrow();
		
		p.food();
		p.voice();
		s.food();
		s.voice();
	}
}
