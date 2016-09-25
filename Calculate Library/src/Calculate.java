// Ryan Sun 9 24 16 This is a math library containing methods that do math without using class Math.
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
	public static int factorial(int numA) {
		if (numA < 0) {
			throw new IllegalArgumentException("You cannot take the factorial of a negative");
		}
		int count = 0;
		int result = 1;
		while (numA - count > 0) {
			result *= numA - count;
			count++;
		}
		return (result);
	}

	public static boolean isPrime(int varA) {
		int count = 2;
		boolean outcome = false;
		boolean found = false;
		while ((count < varA) && (!found)) {
			outcome = Calculate.isDivisibleBy(varA, count);
			if (outcome) {
				found = true;
				count++;
			}
		}
		return !found;
	}

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
	// pre: Returns the square root of a number numX
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
		if (rootA == rootB) {
			output = String.valueOf(rootA);
		} else {
			output = String.valueOf(rootA) + " and " + String.valueOf(rootB);
		}
		return (output);
	}
}
