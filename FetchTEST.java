public class FetchTEST {

	public static void main(String[] args) {
		try {
			double average;
			double above100;
			Fetch.getAverageAndMax("src/numbers.txt");
			
			average = Fetch.average;
			above100 = Fetch.above100;
			System.out.println("Average: " + average);
			System.out.println("Numbers Above 100: " + above100);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
