import java.util.Scanner;

public class CircleMain {
	
	public static void main(String[] args){
		Circle1 r = new Circle1(3.0);
		Scanner input = new Scanner(System.in);
		double userinput = 0;
		
		System.out.println("Radius = " + r.getRadius());
		System.out.println("Area = " + r.getArea() );
		System.out.println("Enter a radius: ");
		
		userinput = input.nextDouble();
		
		r.setRadius(userinput);
		
		System.out.println("Radius = " + r.getRadius());
		System.out.println("Area = " + r.getArea() );
		
		System.out.println("Enter an area");
		
		userinput = input.nextDouble();
		
		r.setArea(userinput);
		
		System.out.println("Radius = " + r.getRadius());
		System.out.println("Area = " + r.getArea() );
		
		System.exit(0);
		
		
		input.close();
	}

}
