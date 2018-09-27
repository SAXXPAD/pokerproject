
public class Cards {

	private char cardCharacter;
	private int suits;
	private boolean flipCards;
	private boolean dontFlip;

	/* suits will be initialized with a set number
	   from one to four depending on suit (1 spade 2 club ... etc) */
	
	public Cards() {
		
	}
	
	
	public Cards(char cardCharacter, int suits) {
		
		this.cardCharacter = cardCharacter;
		this.suits = suits;
		
	
	}
	
	public char getCardCharacter() {
	
		
		return cardCharacter;
	}
	
	public void setCardCharacter(char cardCharacter) {
		
		this.cardCharacter = cardCharacter;
	}
	
	public int getSuits() {
	
		
		return suits;
	}
	
	public void setSuits(int suits) {
		
		this.suits = suits;
	}

	public boolean isFlipCards() {
		return flipCards;
	}
	
/* isFlipCards is a get method. 
   the prefix "is" is exclusive to boolean variables, but preceding verbs
   such as "" or "" indicate you are creating a method name */
	
	public void setFlipCards(boolean flipCards) {
		this.flipCards = flipCards;
	}

	public boolean isDontFlip() {
		return dontFlip;
	}

	public void setDontFlip(boolean dontFlip) {
		this.dontFlip = dontFlip;
	}
}
