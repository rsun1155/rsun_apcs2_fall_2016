
public class CrosswordAP2016 {

	public static boolean toBeLabeled(int r, int c, boolean [][] blackSquares) {
		if (blackSquares[r][c] != true && blackSquares[r-1][c] == true && blackSquares[r][c-1] == true && blackSquares[r][c+1] == true) {
			return true;
		}
		else {
			return false;
		}

		
		}
	public static void main(String [] args) {
		boolean [][] blackSquares = {{false, true, false, false}, {false, true, false, false}};
		boolean work = toBeLabeled(0, 3, blackSquares);
		System.out.println(work);
	}
	}

