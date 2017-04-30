
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;

	public class Prob11 {
	    private static final String INPUT_FILE_NAME = "Prob11.in.txt";
	    
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
	                    String [] linArr = inLine.split(" ");
	                    String newString =  reverse(linArr[0]);
	                    for (int j = 1; j<linArr.length; j++) {
	                    	newString += " " + reverse(linArr[j]);
	                    }
	                    System.out.println(newString);
	                    // print it out
	                    
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
	    public static String reverse (String word) {
	    	
	    	String newWord = "";
	    	String p = "";
	    	if (word.contains(",") || word.contains("!") || word.contains(".") || word.contains("?")|| word.contains(";")) {
	    		p = word.substring(word.length()-1);
	    		word = word.substring(0, word.length()-1);
	    	}
	    	char [] letters = new char[word.length()];
	    	for (int a = 0; a<word.length(); a++) {
	    		letters[a] = Character.toLowerCase(word.charAt(a));
	    	}
	    	for (int k = 0; k<letters.length/2; k++) {
	    		char placeHolder = letters[k];
	    		letters[k] = letters[letters.length-1 - k];
	    		letters[letters.length-1-k] = placeHolder;
	    		
	    	}
	    	if ((word.charAt(0) >= 'A') && (word.charAt(0)<= 'Z')) {
	    		letters[0] = Character.toUpperCase(letters[0]);
	    	}
	    	if (word.contains("'")) {
	    		char place = letters[word.indexOf("'")];
	    		
	    	}
	    	for (int a = 0; a<letters.length; a ++) {
	    		newWord+= letters[a];
	    	}
	    	return newWord + p;
	    	
	    }
	}


