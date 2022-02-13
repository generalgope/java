class Circle {
    double radius;
    double PI = 3.1415d;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Area method
    public void area() {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
    }

    // Circumference method
    public void circumference() {
        double circumference = 2 * PI * radius;
        System.out.println("Circumference: " + circumference);
    }

    //Main method
    public static void main(String[] args) {

        // Object instantiation
        Circle myCircle = new Circle(5d);

        // Object method call
        myCircle.area();
        myCircle.circumference();
    }
}
