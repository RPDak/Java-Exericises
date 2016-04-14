


public class Circle1 {
	private double radius;
	private double area;
	private double PI = 3.141592654;
	
	public Circle1(double r){
		
		radius = r;
		area = r * r * PI;
		
	}
	
	public void setRadius(double r1){
		
		radius = r1;
		area = r1 * r1 * PI;
		
	}
	public double getRadius(){
		
		return radius;
		
	}
	public void setArea(double a){
		
		area = a;
		radius = Math.sqrt((a/PI));
		
	}
	public double getArea(){
		
		return area;
		
	}
	
	

}
