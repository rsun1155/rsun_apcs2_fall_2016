
public class PiDay {
	public static String changePi (String str) {
	if (str.length() <= 2) {
		if (str.equals("pi")) {
			return "3.14";
		}
		else {
			return str;
		}
	}
		else if (str.contains("pi")) {
			String chunk = "";
			String restOString = "";
			if (str.indexOf("pi") != 0) {
			chunk = str.substring(0, str.indexOf("pi"));
			restOString = str.substring(str.indexOf("pi"));
			
			}
			else {
			chunk = str.substring(0, 2);
			restOString = str.substring(2);
			
			}
			return changePi(chunk) + changePi(restOString);
			
		}
		else {
			return str;
		}
	
}
	public static void main(String[] args) {
		System.out.println(changePi("pi"));
		System.out.println(changePi("xxpixp"));
		System.out.println(changePi("pizza"));
	}
}