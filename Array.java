import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] arr;
		int search;
		int arrcounter = 0;
		int counter = 0;
		Scanner input = new Scanner(System.in);

		arr = new int[10];

		System.out.println("Enter 10 digits");
		arr[0] = input.nextInt();
		arr[1] = input.nextInt();
		arr[2] = input.nextInt();
		arr[3] = input.nextInt();
		arr[4] = input.nextInt();
		arr[5] = input.nextInt();
		arr[6] = input.nextInt();
		arr[7] = input.nextInt();
		arr[8] = input.nextInt();
		arr[9] = input.nextInt();

		System.out.println("The digits you entered were: " + arr[0] + " "
				+ arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " "
				+ arr[5] + " " + arr[6] + " " + arr[7] + " " + arr[8] + " and "
				+ arr[9]);
		
		System.out.println(" ");
		System.out.println("Enter a number to search for: ");
		search = input.nextInt();
		
		while (arrcounter <= 9){
			
			if(arr[arrcounter] == search){
				
				counter ++;
				
			}
			
			arrcounter ++;
			
		}
		
		System.out.println("You entered " + search + " this many times: " + counter);
		
		input.close();

		System.exit(0);

	}

}
