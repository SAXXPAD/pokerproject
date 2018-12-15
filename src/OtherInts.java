
public class OtherInts {

	private String palindrome = "Dot saw I was Tod";
	//gives you the length of the character length of the palindrome you established in your
	private int len = palindrome.length();

	public void setOtherInts(int len) {
		
		this.len = len;
	
	}
	public String getOtherInts() {

	/*this gives the string instance variable "str" the value of whatever len you declare 
	 * within your class. In this case, len would be equivalent to the length to the letters in palindrome.*/
	String str = String.valueOf(len);
	
	return str;
	
	}
	
}

/* Use methods to incorporate your contents in "OtherInts" to then call back the functionality
 *  of your methods through print statements*/
 