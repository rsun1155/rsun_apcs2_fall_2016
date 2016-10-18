//Ryan Sun 2nd period 10/18/16 Program prints out an hourglass in the console.
public class TopsyTurvy {

	public static void main(String[] args) {
		printBase(); // Print the first line
		topHalf(); // Print the top half
		System.out.println("     ||     "); //Print the middle 
		bottomHalf(); // Print the bottom half
		printBase(); // Print the last line
	}

	public static void topHalf() {
		for (int i = 1; i <= 4; i++) {// print each line
			// print spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j = 4; j >= i; j--) {
				System.out.print("::");
			}
			System.out.println("/");
		}
	}
	public static void bottomHalf() {
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" "); 
			}
			System.out.print("/");
			for (int j = 4; j >= i; j--) {
				System.out.print("::");
			}
			System.out.println("\\");
	}

			}
	

	public static void printBase() {
		System.out.print("|");
		for (int i = 1; i <= 10; i++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}

}
