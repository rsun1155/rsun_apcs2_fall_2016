

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;

	public class Prob03 {
	    private static final String INPUT_FILE_NAME = "Prob03.in.txt";
	    
	    public static void main(String[] args) {
	        try {
	            // prepare to read the file
	            File inFile = new File(INPUT_FILE_NAME); 
	            FileReader fr = new FileReader(inFile);
	            BufferedReader br = new BufferedReader(fr);
	            String inLine = null;
	            
	            // get the number of test cases
	            int T = Integer.parseInt(br.readLine());
	            int N = T;
	            
	            // loop through test cases
	            while (T-- > 0) {
	                // get the number of lines in each test case
	                
	                // loop through the lines
	                for (int i=0; i<N; i++) {
	                    // read the line of text
	                    inLine = br.readLine();
	                    String print = addiply(inLine);
	                    // print it out
	                    System.out.println(print);
	                    T--;
	                }
	            }
	            
	            // clean up
	            br.close();
	            fr.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	    public static String addiply (String input) {
	    	String [] split = input.split(" ");
	    	int firstNum = Integer.parseInt(split[0]);
	    	int secNum = Integer.parseInt(split[1]);
	    	return (firstNum + secNum) + " " + (firstNum * secNum);
	    }


}
