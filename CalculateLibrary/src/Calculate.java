
public class Calculate {
	public static int square(int number) { 
		int answer;
		answer = number * number;
		return(answer);
	}
	public static int cube(int number) {
		int answer;
		answer = number * number; 
		return(answer);
	}
	public static double average(double number, double num) {
		double answer;
		answer = (number + num)/2; 
		return(answer);
		}
	public static double average(double number, double num, double numb) { 
		double answer;
		answer = (number + num + numb)/3;
		return(answer);
	}
	public static double toDegrees(double number) {
		double answer;
		answer = (number * (180*3.14159));
		return(answer); 
	} 
	public static double toRadians(double number) {
		double answer;
		answer = (number * (3.14159/180));
		return(answer);
	} 
	public static double discriminant(double vara, double varb, double varc) {
		double answer;
		answer = (varb * varb - 4*(vara)*(varc));
		return(answer);
	}
	public static String toImproperFrac(int numa, int numb, int numc) {
		String answer;
		answer = ("\"" + (numa * numc + numb)+"/"+numc+"\"");
		return(answer);
	}
	public static String toMixedNum(int numa, int numb) {
		String answer;
		answer = ("\"" + numa/numb + " " + numa%numb + "/" + numb + "\"");
		return(answer); 
	}
	public static String foil(int numa, int numb, int numc, int numd, String vara) { 
		String answer;
		answer = (numa * numc + " " + vara + "^2" + "+" + (numa * numd) + (numb * numc) + "vara +" + numb * numd);
		return(answer);
	}
	public static boolean isDivisibleBy(int numa, int numb) {
		int answer;
		if (numa%numb == 0) {
			return true;
		} else {
			return false; 
		} 
			
	}
	public static double absValue(double numa) {
		double answer;
		if (numa >= 0) {
		answer = numa;
		return(answer);
		} else { 
			answer = (numa * -1);
		return(answer);
		} 
	}
	public static int max(int numa, int numb) {
		int answer;
		if (numa > numb) { 
			answer = numa;
			return(answer);
		} else {
			answer = numb;
			return (numb);
		}
	}
	public static double max(double numa, double numb, double numc) { 
		if (numa > numb && numa > numb) {
			return(numa);
		}
		else if (numb > numa && numb > numc) { 
			return(numb);
		} 
		else { 
			return(numc);
		} 
	}
	public static int min(int numa, int numb) {
		if (numa > numb) {
			return (numa);
		} else {
			return (numb);
		}
	}
	public static double round2(double num) { 
		double num1 = (num + 0.05);
		
		int numa = (int)(num*100.0); 
		double answer = numa/100.0; 
		return(answer);
	} 
	}
} 
	public static int exponent(double numA, int numB) { 
		for (int count = 1, double numA, int numB; count >=numB; count ++) { 
			double answer = numA * numA;  
		}
	}
	public static int factorial(int numA) {
		int count = 0;
		while (numA>0);
		int next = numA - count;
		
		
			
				
				
			
		}
	}
		
		
