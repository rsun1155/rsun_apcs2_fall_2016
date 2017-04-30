
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;

	public class Prob1 {
	    private static final String INPUT_FILE_NAME = "Prob02.in.txt";
	    
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
	                    
	                    String parsedString = parsedString(inLine);
	                    
	                    // print it out
	                    System.out.println(parsedString);
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
	    
	    public static String parsedString(String input){
	    	String[] split = input.split(" ");
	    	int index = Integer.parseInt(split[1]);
	    	String word = split[0];
	    	if(index == 0){
	    		return word.substring(1);
	    	}else{
	    		return word.substring(0, index) + word.substring(index + 1);
	    	}
	    	
	    }
	}
	



