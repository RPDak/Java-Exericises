import java.util.Scanner;



public class Circle {
	private static final double PI = 3.14;
	private double radius;

	//default constructor
	public Circle() {

		radius = 1;

	}
	//overloaded constructor
	public Circle(double radius1) {

		radius = radius1;

	}

	public void setRadius(double newRadius) {

		radius = newRadius;

	}

	public double area() {
		double circleArea = 0;

		circleArea = PI * radius * radius;
		return circleArea;

	}

	public double getRadius() {

		return radius;

	}
	public double circumference() {
		double circleCircumference = 0;
		
		circleCircumference = (radius * 2) * PI;
		
		return circleCircumference;
	}

	public static void main(String[] args) {
		Circle spot = new Circle(10);
		Scanner input = new Scanner(System.in);
		double radius = 0;
		String[] arr = new String[1];
		arr[0] = "hi";
		
		
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();

		spot.setRadius(radius);
		System.out.println("Circle area = " + spot.area());
		System.out.println("Circle circumference = " + spot.circumference());

		input.close();
	}

}
