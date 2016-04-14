import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int userIndex;
		int userInput;
		int counter = 5;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an array index between 0 and 5: ");
		userIndex = input.nextInt();
		
		System.out.println("Enter a replacement number: ");
		userInput = input.nextInt();
		
		while (counter >= userIndex){
			
			arr[counter] = arr[counter - 1];
			counter--;
			
		}
		arr[userIndex] = userInput;
		
		System.out.println("The new array is: " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
		
		input.close();
		System.exit(0);
		
		

	}

}
