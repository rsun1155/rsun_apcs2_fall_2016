import java.util.Arrays;

public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS"; 
		int[] arrMain = {1, 2, 3, 4, 5};
		System.out.println(num); //Everything worked out
		System.out.println(strMain); //Everything worked out
		System.out.println(arrMain); //printed out gibberish, as expected.
		System.out.println(Arrays.toString(arrMain));
		changeMe(num, strMain, arrMain); 
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain); //printed out gibberish, as expected.
		System.out.println(Arrays.toString(arrMain));
		//The number didn't change, the String didn't change, and the Array somehow did...
		int a = 5; 
		String apple = "apple";
		int [] appleMain = {2, 3, 4, 5, 6};
		int b = a;
		String banana = apple; 
		int [] baboon = appleMain; 
		
		
		
		

	}
	public static void changeMe(int x, String str, int[] arr) { 
		x *= 3; 
		str = str.substring(0,str.length() -2);
		for (int i =0; i < arr.length - 1; i++) {
			arr[i] = 5 * i - 24; 
		}
		}
		
	}


