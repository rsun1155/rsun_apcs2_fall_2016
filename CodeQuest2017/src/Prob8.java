
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;

	public class Prob8 {
	    private static final String INPUT_FILE_NAME = "Prob8.in.txt";
	    
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
	                    System.out.println(time(inLine));
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
	    public static String time(String input){
	    	String[] split = input.split(" ");
	    	double distance = Double.parseDouble(split[0]);
	    	double rate = Double.parseDouble(split[1]);
	    	double totalHours = distance/rate;
	    	
	    	int days = (int)totalHours;
	    	double daysRem = totalHours % 24;
	    	int hours = (int)(daysRem * 24);
	    	int minutes = (int)((daysRem - hours) * 60);
	    	int totalsec = (int)((daysRem - hours) * 3600);
	   
	    	return "Time to Mars: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + totalsec + " seconds";
	    	
	    	
	    }
	}


