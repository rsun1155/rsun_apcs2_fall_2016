// Ryan Sun 2nd Period APCS StringSplit Lab. This program explores String.split(), and the two methods print out the middle of a sandwich, given a String of ingredients
import java.util.Arrays;
public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		apples(); //part 0 playing around with the split method
		String ingredients = "breadbread.";
		sandwich(ingredients);
		String ingredient2 = "cheese lettuce bread kiwi carrot bread pepper butter salad bread strawberry bread";
		sandwichWSpaces(ingredient2);
		
		
			}
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	
	
		public static void sandwich(String foods) //method that deals with strings without spaces. 
		//It prints out the contents of the middle of the sandwich
		{
			foods.toLowerCase();
			if ((foods.indexOf("bread") >= 0) && 
					(foods.lastIndexOf("bread") != foods.indexOf("bread")) && 
					(foods.lastIndexOf("bread") != foods.indexOf("bread") + 5)) {
				//Makes sure 1) 1 piece of bread exists, 2) two distinct pieces of bread exist, and 3) those pieces are not next to each other.
				
				while (foods.indexOf("bread") >= 0 && foods.lastIndexOf("bread") >= foods.indexOf("bread")) {
					if (foods.lastIndexOf("bread") == foods.indexOf("bread")) { 
						//In the scenario that there are an odd number of bread slices
						String [] oddBread = foods.split("bread");
						foods = oddBread[0];
						//I returned the one on the left because both sides could be constituted as the middle
					}
					else {
					foods = foods.substring(foods.indexOf("bread")+5, foods.lastIndexOf("bread"));
				}
				}
				System.out.println(foods);
			}
			else if (foods.lastIndexOf("bread") == foods.indexOf("bread") + 5) {
				System.out.println("Please put something in your two pieces of bread");
			}
			else {
				System.out.println("Please get some bread");
			}
		}
		

	//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		public static void sandwichWSpaces(String foods)
		{
			foods.toLowerCase(); //In case someone gets cheeky with capitalization
			if (foods.indexOf("bread") >= 0 && foods.lastIndexOf("bread") != foods.indexOf("bread") && 
					foods.lastIndexOf("bread") != foods.indexOf("bread") + 6) 
				//Makes sure 1) 1 piece of bread exists, 2) two distinct pieces of bread exist, and 3) those pieces are not next to each other.
			{
					while (foods.indexOf("bread") >= 0) 
					{
						//Loops the String and eliminates exterior breads through substring method.
						if (foods.lastIndexOf("bread") == foods.indexOf("bread")) 
						{
							String [] oddBread = foods.split("bread");
							//If there are an odd number of bread pieces
							foods = oddBread[0];
							//Returned the ingredients to the left
						}
							else {
							foods = foods.substring(foods.indexOf("bread")+6, foods.lastIndexOf("bread")-1);
							}
					}
					//After determining the middle of the sandwich
								System.out.println(foods);
			}
			else if (foods.lastIndexOf("bread") == foods.indexOf("bread") + 6) {
				System.out.println("Please put something in your two pieces of bread");
			}
			else {
				System.out.println("Please get some bread");
			}
			
		}

	public static void apples() { //playing around with the method split
		String [] split = "I like apples!".split(" ");
		System.out.println(split [0]);
		split = "I really like really red apples".split("really");
		System.out.println(split[2]);
		System.out.println(Arrays.toString(split));
		split = "I reallyreally like apples".split("really"); 
		System.out.println(split[(split.length-1)]);
		split = "I really do not really kinda sorta really now".split("really");
		System.out.println(Arrays.toString(split));
		System.out.println(split[2]);
	}

}
//I'm keeping the original comments in case I need to revise this later. 

