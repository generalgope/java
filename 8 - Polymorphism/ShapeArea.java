public class ShapeArea {
	final double PI = 3.14159265359;
	
	public int area(int length) {
		return length * length;
	}
	
	public int area(int length, int width) {
		return length * width;
	}
	
	public double area(double radius) {
		return PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		ShapeArea shape = new ShapeArea();
		
		System.out.println("Square area: " + shape.area(7));
		System.out.println("Rectangle area: " + shape.area(7, 5));
		System.out.println("Cirlce area: " + shape.area(7.47));
	}
}
