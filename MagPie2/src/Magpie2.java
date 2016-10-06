
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if(statement.indexOf("Ms. Bolante") >= 0|| statement.indexOf("Profe Bolante") >=0) {
			response = "Me encanta el idioma de español. Creo que la Profesora Bolante es fantástica";
		} else if (statement.indexOf("Ms. Dreyer") >= 0
				|| statement.indexOf("Ms. Liu") >=0
				|| statement.indexOf("Ms. Ronina") >=0
				|| statement.indexOf("Ms. Irish") >= 0 
				|| statement.indexOf("Ms. Alberta") >=0) {
			response = "She's a great teacher";
		} else if (statement.indexOf("music") >=0) { 
			response = "I love all sorts of music"; 
		} else if (statement.indexOf("name") >=0){
			response = "Hello, my name is Inigo Montoya. You killed my father; prepare to die.";
		} else if (statement.indexOf("food")>=0) {
			response = "Vietnamese Pho is the best!";
		} else if (statement.length() <= 0) {
			response = "If you're alive, please say something."; 
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) { 
			response = "No hablo inglés";
		} else if (whichResponse == 5) { 
			response = "Sorry, I can't hear you.";
		}

		return response;
	}
}
