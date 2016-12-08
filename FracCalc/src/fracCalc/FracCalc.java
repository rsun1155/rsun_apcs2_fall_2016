//Ryan Sun 2nd Period 12/4/16 add comments later.
package fracCalc;
import java.util.*;

public class FracCalc {
	//Main method, prompts user for input. 
    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in); 
    	System.out.println("Input your expression."); //prompts user input 
    	String inputString = input.nextLine();
        // TODO: Read the input from the user and call produceAnswer with an equation
    //Pt. 3
    	while (inputString.equals("quit") == false) {
    		String answer = produceAnswer(inputString);
    		System.out.println(answer);
    		System.out.println("Input your expression.");
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
   
    //produceAnswer takes in user input as a String, breaks it up into two operands and an operator, 
    //and performs the operation on the two fractions. Finally, the method reduces the fraction and returns
    //the answer as an mixed simplified fraction String. 
    public static String produceAnswer(String inputString)
    {  
    	String answer;
    	String [] inputArray = inputString.split(" ");
        // TODO: Implement this function to produce the solution to the input
    	int [] resultFrac = new int [2];
        String operand1 = inputArray[0];
     int [] operand1Array = parseOperand(operand1);
        String operator = inputArray[1].trim();
        String operand2 = inputArray[2];
      int [] operand2Array = parseOperand(operand2);
      operand1Array = toImproperFrac(operand1Array);
      operand2Array = toImproperFrac(operand2Array);
        //do operations here
        if (operator.equals("+")) {
        	resultFrac = addFrac(operand1Array, operand2Array);
        }
        else if (operator.equals("-")) {
        	resultFrac = subFrac(operand1Array, operand2Array);
        }
        else if (operator.equals("*")) {
        	resultFrac = multFrac(operand1Array,operand2Array);
        }
        else if (operator.equals("/")) {
        	resultFrac = divFrac(operand1Array, operand2Array);
        }
        else {
        	System.out.println("need an operator");
        }
     int [] answerFrac =  reduceFrac(resultFrac);
     	if (answerFrac[0] == 0 && answerFrac[1] != 0) {
     		answer = answerFrac[1] + "/" + answerFrac[2];
     	}
     	else if (answerFrac[1] == 0) {
     		answer = "" + answerFrac[0];
     	}
     	else if (answerFrac[0] == 0 && answerFrac[0] == 0) {
     		answer = "0";
     	}
     	else {
     		answer = answerFrac[0] + "_" + answerFrac[1] + "/" + answerFrac[2];
     	}
        
        return answer;
        
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
    //Parses the fraction, separating the whole number, numerator, and denominator}
    public static int [] parseOperand(String operand) {
    	int wholeNum;
    	int numerator;
    	int denominator; 
    	int [] operandArray = new int [3];
    	if (operand.indexOf("/") >= 0 && operand.indexOf("_") >= 0) {
        	wholeNum = Integer.parseInt(operand.substring(0, operand.indexOf("_"))); 
        	 numerator = Integer.parseInt(operand.substring(operand.indexOf("_") + 1, operand.indexOf("/")));
        	 denominator = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
        }
        else if (operand.indexOf("_") == -1 && operand.indexOf("/") >= 0) {
        	wholeNum = 0;
        	numerator = Integer.parseInt(operand.substring(0, operand.indexOf("/")));
        	denominator = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
        }
        else {
        	wholeNum = Integer.parseInt(operand);
        	numerator = 0;
        	denominator = 1;
         }
    	operandArray[0] = wholeNum;
    	operandArray[1] = numerator;
    	operandArray[2] = denominator;
    	return operandArray;
    	
    	
    }
    public static int [] addFrac(int[] operand1, int[] operand2) {
    	int [] newFrac = new int [2];
    	int denominator = operand1[1] * operand2[1]; 
    	int numerator1 = operand1[0] * operand2[1];
    	int numerator2 = operand2[0] * operand1[1];
    	int numerator = numerator1 + numerator2;
    	newFrac[0] = numerator;
    	newFrac[1] = denominator; 
    	return newFrac;
    	
    }
    public static int [] subFrac(int [] operand1, int [] operand2) {
    	if (operand2[0] == 0) {
    	operand2[1] = -1 * operand2[1];
    	}
    	else {
    	operand2[0] = -1 * operand2[0];
    	}
    	int [] newFrac = addFrac(operand1, operand2);
    	return newFrac;
    	
    	
    	
    }
    public static int [] toImproperFrac(int [] operand) { 
    	int [] newFrac = new int [2];
    	if (operand[0] != 0) {
    	 if (operand[0] > 0 && operand.length != 2) {
    	newFrac[0] = (operand[0] * operand[2]) + operand[1]; 
    	newFrac[1] = operand[2];
    	//if the mixed number is positive, then multiply whole by denominator then add numerator
    	}   
    	else if (operand[0] < 0 && operand.length != 2){
    	newFrac[0] = (operand[0] * operand[2]) - operand[1];
    	newFrac[1] = operand[2];
    	}
    	else {
    		newFrac = operand;
    	}
    	}
    	else {
    		newFrac[0] = operand[1];
    		newFrac[1] = operand[2];
    	}
    	return newFrac;
    }
    public static int [] multFrac(int [] operand1, int [] operand2) { 
    	int numerator = operand1[0] * operand2[0];
    	int denominator = operand1[1] * operand2[1]; 
    	int [] product = {numerator, denominator};
    	return product;
    }
    public static int [] divFrac(int[] operand1, int[] operand2) { 
    	int denominator = operand2[1]; //flip the second operand
    	operand2[1] = operand2[0];
    	operand2[0] = denominator; 
    	int [] product = multFrac(operand1, operand2);
    	return product;
    }
    public static int gcf(int [] operand) {
    		int count = 1;
    		int factor = 1;
    		while (count <= Math.min(Math.abs(operand[0]), operand[1])) { //The gcf cannot be greater than the absolute value of smaller number
    			if (Math.abs(operand[0]%count) == 0 && Math.abs(operand[1]%count) ==0) {
    				factor = count; //Keep picking up factors until we get to that point. 
    			}
    			count++;
    		}
    		return (factor);
    	}
    public static int [] reduceFrac(int [] operand) {
    	int [] simpleFrac = new int [3]; //new array to hold the new whole value
    	int whole = operand[0]/operand[1];
    	operand[0] = (operand[0]%operand[1]);
    	if (whole != 0) {
    	operand[0] = Math.abs(operand[0]);
    	}
    	int factor = gcf(operand);
    	int numerator = operand[0]/factor;
    	int denominator = Math.abs(operand[1]/factor); //Reduced improper faction //if numerator is less than denominator, this will be zero. That's ok
    			simpleFrac[0] = whole; //remember to filter out whole in produceAnswer
    			simpleFrac[1] = numerator;
    			simpleFrac[2] = denominator; 
    		return simpleFrac; //Simplified fraction holding whole, numerator, and denominator. 

    }
    }
    

