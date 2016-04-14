import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int counter = 0;
		int reverseCounter;
		int stringLength;
		char[] backwardsArray;
		String startingString;
		char[] startingStringArray;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String to be reversed: ");
		startingString = input.next();
		stringLength = startingString.length();
		reverseCounter = stringLength - 1;
		startingStringArray = startingString.toCharArray();
		backwardsArray = new char[stringLength + 1];

		while (reverseCounter >= 0) {

			backwardsArray[counter] = startingStringArray[reverseCounter];

			counter++;
			reverseCounter--;

		}
		
		System.out.println(backwardsArray);
		
		input.close();
		System.exit(0);

	}

}
