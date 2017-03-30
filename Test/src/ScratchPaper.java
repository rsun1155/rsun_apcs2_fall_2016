
public class ScratchPaper {
	public static void main(String [] args) {
		System.out.println(starString(4));
	}
	public static String starString(int n) {
	    if (n <= 0)
	      return "*";
	    else {
	      String s = starString(n - 1);
	      return s + s;
	    }
	  }

}
