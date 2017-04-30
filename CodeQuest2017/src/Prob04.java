
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.util.ArrayList; 
	public class Prob04 {
	    private static final String INPUT_FILE_NAME = "Prob04.in.txt";
	    
	    public static void main(String[] args) {
	        try {
	            // prepare to read the file
	            File inFile = new File(INPUT_FILE_NAME); 
	            FileReader fr = new FileReader(inFile);
	            BufferedReader br = new BufferedReader(fr);
	            
	            // get the number of test cases
	            int T = Integer.parseInt(br.readLine());
	            // loop through test cases
	            while (T-- > 0) {
	            	int N = Integer.parseInt(br.readLine());
	            	System.out.println( N + " = " + fibonacci(N) + "");
	               
	            }
	            
	            // clean up
	            br.close();
	            fr.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static int fibonacci (int limit) { 
	    	ArrayList<Integer> store = new ArrayList<Integer>();
	    	store.add(0);
	    	store.add(1);
	    	for (int i = 2; i<limit; i++) {
	    		store.add(Math.abs((int)store.get(i-2) + (int)store.get(i-1)));
	    	}
	    	System.out.println(store);
	    	return store.get(limit - 1);
	    }
	}


