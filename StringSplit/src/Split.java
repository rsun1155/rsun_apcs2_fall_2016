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
		String ingredients = "breadbread.";
		sandwich(ingredients);
		ingredients = "breadstrawberrykiwilimebreadduck";
		ingredients = "breadbreadbreadbread";
		sandwich(ingredients);
		String ingredientes = "apples pineapples bread lettus bread kiwi";
		sandwichWSpaces(ingredientes);
		ingredientes = "bread bread bread bread";
		sandwichWSpaces(ingredientes);
		
				
		 
	}
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static void sandwich(String foods)
		{
			if (foods.indexOf("bread") >= 0 && foods.lastIndexOf("bread") != foods.indexOf("bread") && foods.lastIndexOf("bread") != foods.indexOf("bread") +5)
			{
				foods = foods.substring(foods.indexOf("bread"), foods.lastIndexOf("bread"));
				String [] ingredients = foods.split("bread");
				System.out.println(ingredients[ingredients.length/2]);
				
			}
			else {
				System.out.println("Fix your sandwich please.");
			}
		}
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		public static void sandwichWSpaces(String foods) {
			foods.trim(); 
			if (foods.indexOf("bread") >= 0 && foods.lastIndexOf("bread") != foods.indexOf("bread") && foods.lastIndexOf("bread") != foods.indexOf("bread") +6)
			{
				foods = foods.substring(foods.indexOf("bread"), foods.lastIndexOf("bread")); 
				String [] ingredients = foods.split(" ");
				System.out.println(ingredients[(ingredients.length)/2]);
			}
			else {
				System.out.println("Please make sure that your sandwich is in order.");
			}
		}

	

}


