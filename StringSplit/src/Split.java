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
		split = "I reallyreally like apples".split("really"); 
		System.out.println(split[(split.length-1)]);
		System.out.println(sandwich("applespineapplesbreadlettustomatobacomayohambreadcheese")); 
		System.out.println(sandwich("breadbayleafstrawberrybreadcheesemayomustardkiwibreadmelonbananacucumberbread"));
		
				
		 
	}
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static String sandwich(String ingredients) {
			String [] ingredientsArray = ingredients.split("bread");
			return(ingredientsArray[ingredientsArray.length/2]);
		}
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	

}


