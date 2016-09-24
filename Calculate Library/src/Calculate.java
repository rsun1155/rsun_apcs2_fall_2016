
public class Calculate {
	public static int square(int number) {
		int answer;
		answer = number * number;
		return (answer);
	}

	public static int cube(int number) {
		int answer;
		answer = number * number * number;
		return (answer);
	}

	public static double average(double number, double num) {
		double answer;
		answer = (number + num) / 2;
		return (answer);
	}

	public static double average(double number, double num, double numB) {
		double answer;
		answer = (number + num + numB) / 3;
		return (answer);
	}

	public static double toDegrees(double number) {
		double answer;
		answer = (number * (180 / 3.14159));
		return (answer);
	}

	public static double toRadians(double number) {
		double answer;
		answer = (number * (3.14159 / 180));
		return (answer);
	}

	public static double discriminant(double varA, double varB, double varC) {
		double answer;
		answer = (varB * varB - 4 * (varA) * (varC));
		return (answer);
	}

	public static String toImproperFrac(int numA, int numB, int numC) {
		String answer;
		answer = ("\"" + (numA * numC + numB) + "/" + numC + "\"");
		return (answer);
	}

	public static String toMixedNum(int numA, int numB) {
		String answer;
		answer = ("\"" + numA / numB + " " + numA % numB + "/" + numB + "\"");
		return (answer);
	}

	public static String foil(int numA, int numB, int numC, int numD, String varA) {
		String answer;
		answer = (numA * numC + " " + varA + "^2" + "+" + ((numA * numD) + (numB * numC)) + varA + "+" + numB * numD);
		return (answer);
	}

	public static boolean isDivisibleBy(int numA, int numB) {
		if (numA % numB == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static double absValue(double numA) {
		double answer;
		if (numA >= 0) {
			answer = numA;
			return (answer);
		} else {
			answer = (numA * -1);
			return (answer);
		}
	}

	public static int max(int numA, int numB) {
		int answer;
		if (numA > numB) {
			answer = numA;
			return (answer);
		} else {
			answer = numB;
			return (numB);
		}
	}

	public static double max(double numA, double numB, double numC) {
		if (numA > numB && numA > numB) {
			return (numA);
		} else if (numB > numA && numB > numC) {
			return (numB);
		} else {
			return (numC);
		}
	}

	public static int min(int num1, int num2) {
		if (num1 > num2) {
			return (num2);
		} else {
			return (num1);
		}
	}

	public static double round2(double num) {
		double num1 = (num + 0.005);

		int numA = (int) (num1 * 100.0);
		double answer = numA / 100.0;
		return (answer);
	}


  
  public static int exponent(double numA, int numB) { 
	  int answer = 1;
   for (int count = 1; count <=numB; count ++) { 
	   answer = (int) (answer * (int)numA);
	   } 
   	return (answer);
  }

  
   public static int factorial(int numA) { 
	  int count = 0; int result = 1;
	  while (numA - count>0) {
		result *= numA - count;
		count ++; 
	  }
	  return(result);
  }
  /* public static boolean isPrime(int varA) {
   * 	int count;
	 	while 
		  
	  }
  }
 */
 
  
 
  
  }

