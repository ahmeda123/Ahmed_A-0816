import java.util.*;

public class ProcessingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		int nextNum; //next number to be added to sequence
		int max; //declare max and min
		int min;
		int maxEven; //the largest even number
		int evenTotal = 0; //total of all even numbers combined
			System.out.println("Enter the total number of integers you wish to process");
		int totalInts = userInput.nextInt(); //total number of integers the user wants
			System.out.println("Enter the numbers you would like to process separated by a space");
			max = userInput.nextInt();
			min = userInput.nextInt();
			maxEven = userInput.nextInt();
		for (int i = 0; i < totalInts; i++) {
			nextNum = userInput.nextInt();
			if (nextNum % 2 == 0) { //checks if number is even, if so adds it to evenTotal
				evenTotal += nextNum;
				if (nextNum > maxEven) { //if number is even, checks if greater than maxEven. if so it replaces maxEven
					maxEven = nextNum;
				}
			}
			if (nextNum > max) { //checks if number is greater than max, if so it replaces max
				max = nextNum;
			}
			else if (nextNum < min) { //checks if number is less than min, if so it replaces min
				min = nextNum;
			}
		}
	System.out.println("Maximum: " + max + ", " + "Minimum: " + min);
	System.out.println("Sum of even numbers: " + evenTotal);
	System.out.println("Max even number: " + maxEven);
	userInput.close();
	}
}



