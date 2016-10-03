
//Programmer 1: Ryan Sun, Programmer 2: Takahiro Mollenkamp, 9/29/16 2nd period 
//This class prints out the minimum and maximum of numbers supplied by the user and prints the sum of all even numbers that the user input as well as the largest even number typed. 
import java.util.*;

public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many numbers are you going to put in? ");
		int x = userInput.nextInt();
		System.out.print("Enter your numbers ");
		int max = userInput.nextInt();
		int maxEven = max;
		int min = max;
		int evenTotal;
		if (max % 2 == 0) {
			evenTotal = max;
		} else {
			evenTotal = 0;
		}
		for (int i = 1; i < x; i++) {
			int nextInt = userInput.nextInt();
			if (nextInt > max) {
				max = nextInt;
			} else if (nextInt < min) {
				min = nextInt;
			}
			if (nextInt % 2 == 0) {
				evenTotal += nextInt;
				if (nextInt > maxEven) {
					maxEven = nextInt;
				}
			}
		}

		System.out.println("The minimum is " + min); 
		System.out.println("The maximum is " + max);
		System.out.println("The sum of all the even numbers is " + evenTotal);
		System.out.println("The largest even number is " + maxEven);
		userInput.close();

	}

}
