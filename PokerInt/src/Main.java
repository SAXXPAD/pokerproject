import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		/* All the lines that introduce a print statement under the
		 * instance variable declaration of the card class, introduces a
		 * method call with empty arguments because get methods don't
		 * need arguments the way set methods would*/
		
		Random rng = new Random();
		System.out.println("Next int value: " + rng.nextInt());
		Cards card1 = new Cards();
		System.out.println(card1.getCardCharacter());
		card1.setCardCharacter('Q');
		System.out.println(card1.getCardCharacter());
		card1.setFlipCards(true);
		System.out.println(card1.isFlipCards());
		
	}

}
