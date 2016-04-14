public class Employee {

	private String name;
	private double payRate;
	private int employeeID;
	private static int nextID = 1000;

	public static final double STARTING_PAY_RATE = 7.75;

	public Employee(String n) {

		name = n;
		payRate = STARTING_PAY_RATE;
		employeeID = getNextID();
		nextID++;

	}

	public Employee(String n1, double sp) {

		name = n1;
		payRate = sp;
		employeeID = getNextID();
		nextID++;

	}

	public String getName() {

		return name;

	}

	public int getEmployeeID() {

		return employeeID;

	}

	public double getPayRate() {

		return payRate;

	}

	public void changeName(String newName) {

		name = newName;

	}

	public void changePayRate(double newRate) {

		payRate = newRate;

	}

	private int getNextID() {

		return nextID;

	}

}
