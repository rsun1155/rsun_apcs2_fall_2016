
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(6.0, 8.0));
		System.out.println(Calculate.average(1.0, 2.0, 3.0));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1, 4, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(7, 3));
		System.out.println(Calculate.absValue((-45)));
		System.out.println(Calculate.max(5, 7));
		System.out.println(Calculate.max(7,8,9));
		System.out.println(Calculate.min(6, 5));
		System.out.println(Calculate.round2(6.349));
		System.out.println(Calculate.exponent(5, 3));
		System.out.println(Calculate.factorial(3));
	}

}
