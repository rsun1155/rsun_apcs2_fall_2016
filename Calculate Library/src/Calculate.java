// Ryan Sun 9 24 16 This is a math library containing methods that do math without using class Math.
public class Calculate {
	// This method takes an integer "number" and returns the square of that integer.
	public static int square(int number) {
		int answer;
		answer = number * number;
		return (answer);
	}
	// This method takes an integer "number" and returns the cube of that integer.
	public static int cube(int number) {
		int answer;
		answer = number * number * number;
		return (answer);
	}
	// This method takes two doubles "num1" and "num2" and returns the average of those two doubles
	public static double average(double num1, double num2) {
		double answer;
		answer = (num1 + num2) / 2;
		return (answer);
	}
	// This method takes three doubles "num1", "num2" and "num3" and returns the average of those three doubles.
	public static double average(double num1, double num2, double num3) {
		double answer;
		answer = (num1 + num2 + num3) / 3;
		return (answer);
	}
	// This method takes a double "radian" and returns that double converted into degrees. 
	public static double toDegrees(double radian) {
		double answer;
		answer = (radian * (180 / 3.14159));
		return (answer);
	}
	// This method takes a double "degrees" and returns that double converted into radians. 
	public static double toRadians(double degrees) {
		double answer;
		answer = (degrees * (3.14159 / 180));
		return (answer);
	} 
	// This method takes three doubles "varA", "varB", and "varC" and returns the discriminant value as if those three doubles were plugged into the quadratic formula. 
	public static double discriminant(double varA, double varB, double varC) {
		double answer;
		answer = (varB * varB - 4 * (varA) * (varC));
		return (answer);
	}
	// This method receives three integers "whole", "numerator", and "denominator" and returns an improper fraction using those three values. 
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ("\"" + (whole * denominator + numerator) + "/" + denominator + "\"");
		return (answer);
	}
	
	// This method converts an improper fraction into a mixed number.
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = ("\"" + numerator / denominator + " " + numerator % denominator + "/" + denominator + "\"");
		return (answer);
	}
	// Given the coefficients and a variable of two polynomials, this method uses the foil method and returns the product of those two polynomials
	public static String foil(int numA, int numB, int numC, int numD, String varA) {
		String answer;
		answer = (numA * numC + " " + varA + "^2" + "+" + ((numA * numD) + (numB * numC)) + varA + "+" + numB * numD);
		return (answer);
	}
	// This method determines whether or not a dividend can be divided evenly by a divisor.
	// pre: divisor != 0
	// post: Returns whether a dividend is divisible by a divisor.
	public static boolean isDivisibleBy(int dividend, int divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException("Stop dividing by zero");
		}
		if (dividend % divisor == 0) {
			return true;
		} else {
			return false;
		}

	}
	// This method returns the absolute value of a given double. 
	public static double absValue(double num) {
		double answer;
		if (num >= 0) {
			answer = num;
		} else {
			answer = (num * -1);
		}
			return answer; 
	}
	// This method returns the greater of two numbers
	public static int max(int num1, int num2) {
		int answer;
		if (num1 > num2) {
			answer = num1;
			return (answer);
		} else {
			answer = num2;
			return (num2);
		}
	}
	//This method returns the greatest of three numbers
	public static double max(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num2) {
			return (num1);
		} else if (num2 > num1 && num2 > num3) {
			return (num2);
		} else {
			return (num3);
		}
	}
	//This method returns the smaller of two numbers
	public static int min(int num1, int num2) {
		if (num1 > num2) {
			return (num2);
		} else {
			return (num1);
		}
	}
	//This method returns a double rounded to two decimal places
	public static double round2(double num) {
		double num1 = (num + 0.005);

		int numA = (int) (num1 * 100.00);
		double answer = numA / 100.00;
		return (answer);
	}
	// pre: numB >= 0
	// post : returns a number num raised to an exponent exp.
	public static int exponent(double num, int exp) {
		if (exp < 0) {
			throw new IllegalArgumentException("Sorry, this method does not apply to negative exponents");
		}
		int answer = 1;
		for (int count = 1; count <= exp; count++) {
			answer = (int) (answer * (int) num);
		}
		return (answer);
	}
	// pre: n>=0
	// post: returns numA factorial
	public static int factorial(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("You cannot take the factorial of a negative");
		}
		int count = 0;
		int result = 1;
		while (num - count > 0) {
			result *= num - count;
			count++;
		}
		return (result);
	}
	//This method determines whether a number "num" is prime or not.
	public static boolean isPrime(int num) {
		int count = 2;
		boolean outcome = false;
		boolean found = false;
		while ((count < num) && (!found)) {
			outcome = Calculate.isDivisibleBy(num, count);
			if (outcome) {
				found = true;
				count++;
			}
		}
		return !found;
	}
	//This method returns the greatest common factor of two numbers. 
	public static int gcf(int numA, int numB) {
		int count = 1;
		int factor = 0;
		while (count <= Calculate.min(numA, numB)) {
			if (Calculate.isDivisibleBy(numA, count) && Calculate.isDivisibleBy(numB, count)) {
				factor = count;
			}
			count++;
		}
		return (factor);
	}

	
	// pre: numX >= 0
	// post: Returns the square root of a number numX
	public static double sqrt(double numX) {
		if (numX < 0) {
			throw new IllegalArgumentException("Can't take the square root of a negative");
		}
		numX = numX * 10000;
		double count = 0;
		while (Calculate.square((int) count) < numX) {
			count++;
		}
		count = (double) count / 100.00;
		return (count);
	}

	// pre: varA != 0
	// post: this method returns the real roots of a quadratic expression
	public static String quadForm(int varA, int varB, int varC) {
		if (varA == 0) {
			throw new IllegalArgumentException("This is not a quadratic expression, just solve for x.");
		}
		String output;
		if (Calculate.discriminant(varA, varB, varC) <= 0) {
			output = "no real roots";
		}

		double rootA = ((-1 * (double) varB) + Calculate.sqrt(Calculate.discriminant(varA, varB, varC))) / (2 * varA);
		double rootB = ((-1 * (double) varB) - Calculate.sqrt(Calculate.discriminant(varA, varB, varC))) / (2 * varA);
		Calculate.round2(rootA);
		Calculate.round2(rootB);
		if (rootA == rootB) {
			output = String.valueOf(rootA);
		} else if (rootA > rootB) {
			output = String.valueOf(rootB) + " and " + String.valueOf(rootA);
		}
		else {
			output = String.valueOf(rootA) + " and " + String.valueOf(rootB);
		}
		return (output);
	}
}
