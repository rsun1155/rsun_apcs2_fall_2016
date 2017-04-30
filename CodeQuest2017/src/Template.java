
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;

	public class Template {
	    private static final String INPUT_FILE_NAME = "Prob00.in.txt";
	    
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
	                    
	                    // print it out
	                    System.out.println(inLine);
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
	}


