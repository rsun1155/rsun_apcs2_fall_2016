package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in); 
    	String inputString = input.nextLine();
        // TODO: Read the input from the user and call produceAnswer with an equation
    //Pt. 2
    	while (inputString.equals("quit") == false) {
    		System.out.println(produceAnswer(inputString));
    		inputString = input.nextLine(); 
    	}
    	input.close();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String inputString)
    {  
    	String [] inputArray = inputString.split(" ");
        // TODO: Implement this function to produce the solution to the input
        String operand1 = inputArray[0];
        operand1 = parseFrac(operand1);
        String operator = inputArray[1];
        String operand2 = inputArray[2];
        operand2 = parseFrac(operand2);
        return operand2;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
    //Parses the fraction, separating the whole number, numerator, and denominator
    public static String parseFrac(String operand) {
    	String wholeNum;
    	String numerator;
    	String denominator; 
    	if (operand.indexOf("/") >= 0 && operand.indexOf("_") >= 0) {
        	wholeNum = "whole:" + operand.substring(0, operand.indexOf("_")); 
        	 numerator = "numerator:" + operand.substring(operand.indexOf("_") + 1, operand.indexOf("/"));
        	 denominator = "denominator:" + operand.substring(operand.indexOf("/") + 1);
        }
        else if (operand.indexOf("_") == -1 && operand.indexOf("/") >= 0) {
        	wholeNum = "whole:0";
        	numerator = "numerator:" + operand.substring(0, operand.indexOf("/"));
        	denominator = "denominator:" + operand.substring(operand.indexOf("/") + 1);
        }
        else {
        	wholeNum = "whole:" + operand;
        	numerator = "numerator:0";
        	denominator = "denominator:1";
         }
    	operand = wholeNum + " " + numerator + " " + denominator; 
    	return operand;
    	
    }
}
