//All 8 Primitive Data Types:
//-Int: if you want a whole number. (a 32-byte Value) 
//-Boolean: holds true or false statements
//-Double: Basically double precision; decimal values
//-Char: Can hold a Unicode Character; specify character by putting it in single quotes ('y') 
/*-Float: Smaller version of a Double,
 * <Type a lower case 'f' to ensure Java reads your float as a float and not as a Double>*/
//-Long: Holds really long numbers (64-byte Value)
/*-Byte: holds 8-bytes of data; useful because its good at representing an array of data through
 * bytes to get the amount of space the data will take up.*/
//-Short: hold smaller numbers (16-byte Value)

//SCOPE: Variables are only accessible in the area in which they were attained. 
//Variables: when declared they can be given a value based on their respected data types

/*operator precedence has to do with there being a well defined ruleset to how operators get handled 
 * and to what order they get handled in Java
 */

import java.util.Random;

public class PSI1 {

	static String str = "Hello and welcome to my PokerInt";
	static double dub = 2.0;
	
	//keyword "final" ensures that the declared variable remains constant and unchanged
	final static int best = 1;
	
	public static void sstatement() {
		
        int month = 1;
        
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
	
		/* All the lines that introduce a print statement under the
		 * instance variable declaration of the card class, introduces a
		 * method call with empty arguments because "get" methods don't
		 * need arguments the way set methods would*/
		
		System.out.format(str + "%n" + "You are number " + best);
		
		/*converting a double into an int through casting; casting allows you to change data
		 *types either before print statements or during.
		 *added concatenation*/
		System.out.println(dub++);
		System.out.println((int)dub);
		
		//rng.nextInt() and rng.nextDouble() generates a random int and double value respectively
		Random rng = new Random();
		System.out.println("Next int value: " + rng.nextInt());
		System.out.println("Next int value: " + rng.nextDouble());
		
		/*all the print statements that have "card1.getCardCharacter()" have calls from a method
		 *in the cards class, card1 is an instance variable of a variable declared in cards class*/
		Cards card1 = new Cards();
		System.out.println(card1.getCardCharacter());
		card1.setCardCharacter('M');
		System.out.println(card1.getCardCharacter());
		card1.setFlipCards(rng.nextBoolean());
		System.out.println(card1.isFlipCards());	
		
		OtherInts pdrome = new OtherInts();
		System.out.println("Palindrome consist of " + pdrome.getOtherInts() + " characters.");
		
	}
	
}
