//Ryan Sun 11/5/16 2nd period ArraysLab3. This assignment explores arrays and what we can do with them. 
package arrays_materials;

import java.util.Arrays;

public class ArraysLab3 
{
	/*
	 * Write a method named sum that accepts two arrays of integers arr1 and arr2 
	 * and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	 */
	public static int[] sum(int[] arr1, int[] arr2)
	{
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		int [] sumArr = new int [arr1.length]; //Declares a new Array to store the sum of the two arrays
		for (int i = 0; i < sumArr.length; i++) {
			sumArr[i] = arr1[i] + arr2[i]; 
			//At index i of our new array, the element is the sum of the respective index i's of the two input arrays
		} 
		return sumArr; 
		
	}
	
	/*
	 * Write a method named append that accepts an array of integers arr of length n 
	 * and an integer num, and returns an array of integers of length n+1 
	 * that consists of the elements of arr with num appended to the end.  
	 * You can assume array arr has at least one element.
	 */
	public static int[] append(int[] arr, int num)
	{
		assert (arr.length > 0);
		int [] hookOn = new int [arr.length + 1]; //Creates a new Array with one more element than arr[]. 
		for (int i = 0; i < hookOn.length - 1; i++) { 
			hookOn[i] = arr[i];  
			//For every common element of arr and hookOn, the loop transfers elements from arr to hookOn
		}
		hookOn[hookOn.length-1] = num; //The last element of hookOn gets num
		return hookOn; 
		
	}
	
	/*
	 * Write a method named remove that accepts an array of integers arr and an integer idx 
	 * and returns an array of integers consisting of all of the elements of arr 
	 * except for the element at index idx (thus, the returned array has a length of arr.length – 1).  
	 * You can assume arr has at least two elements.
	 */
	public static int[] remove(int[] arr, int idx)
	{
		assert (arr.length >= 2);
		int [] takeOff = new int [arr.length - 1]; //Declares a new array with one less element than arr
		for (int i = 0; i < idx; i++) { 
			takeOff[i] = arr[i]; //For all elements before idx.
			}
		for (int i = idx; i < takeOff.length; i++) {
			takeOff[i] = arr[i+1]; //For all elements including idx to the end of the array
			//(It's like a piecewise function)
		}
		return takeOff;
		
	}
	
		/*
	 * Write a method sumEven that accepts an array of integers arr 
	 * and returns an integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	 */
	public static int sumEven(int[] arr)
	{
		assert (arr.length > 0);
		int totalEven = 0; //Declares and assigns a storage variable
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				totalEven += arr[i]; //If the element at index i is even, add it to the storage variable
			}
			else {
			}
		}
		return totalEven;
		}
	
	/*
	 * Write a method rotateRight that accepts an array of integers arr 
	 * and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, …, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */
		public static void rotateRight(int[] arr)
	{
		assert (arr.length > 0);
		int lastValue = arr[arr.length - 1]; //just so we don't lose that last value
		for (int i = arr.length - 1; i >= 1; i--) {  
			//Starting at the end of the array, moves elements one to the right
			arr[i] = arr[i - 1];
		}
			arr[0] = lastValue; //Puts that last value as the first element
		
	}

	/*
	 * Write a main method that will 
		Contain
			integer arrays a1, a2, sumArr, appendArr, removeArr
			int variables appendNum, removeIdx, sumOfEvens
		Carry out the following actions
			Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 
			and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
			Form sumArr by calling the sum method with a1 and a2 as inputs
			Declare int appendNum and set it to 200.
			Form appendArr by calling the append method with a1 and appendNum as inputs
			Declare int removeIdx and set it to 5.
			Form removeArr by calling remove with a2 and removeIdx
			Form sumOfEvens by calling sumEven with appendArr as the input
			Call rotateRight with a1 as the input
			On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
				sumArr
				appendArr
				removeArr
				sumOfEvens (an int you don’t need Arrays.toString)
				a1
	 */
	
	public static void main(String[] args) 
	{
		//I did what the assignment sheet told me to do. 
		int [] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int [] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int [] sumArr = sum(a1, a2); 
		int appendNum = 200; 
		int [] appendArr = append(a1, appendNum);
		int removeidx = 5;
		int [] removeArr = remove(a2, removeidx);
		int sumOfEvens = sumEven(appendArr); 
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
		
		
	}

}
