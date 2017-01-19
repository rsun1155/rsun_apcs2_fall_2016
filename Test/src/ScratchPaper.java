import java.util.Arrays;
public class ScratchPaper {
	public static void main(String [] args) {
		int [][] data = new int [4][7];
		for (int i = 0; i <7; i ++)
		{
			data [2][i] = i+1;
		}
		System.out.println(Arrays.deepToString(data));
	}

}
