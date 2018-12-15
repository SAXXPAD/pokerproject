// work for PSI II
	import java.util.Scanner;

	public class PSI2 {
		
//while loop
	  public static void wloops() {
	    Scanner scanner = new Scanner(System.in);
	    boolean coinFlip = true;
	    String coinToss;
	    while (coinFlip == true) {

	      System.out.println("Coin flips to heads or tails \n (type in heads or tails):");
	      coinToss = scanner.next();
	      if (coinToss == "heads" || coinToss == "tails") {
	        coinFlip = false;
	      }
	      
	      do {
	    	  System.out.println("Coin Flipped");
	    	  
	    	  break;
	      } while(coinFlip == false);
          break;
	    }
	    scanner.close();

	  }
	  
//for loop
	  
	    public static void floops(){
	         for(int i=1; i>10; i++){
	              System.out.println("The value of i is: " + i);
	         }
	    }
	    
//do-while loop with post decrement
	    
	    public static void dwloop(){
	         int i=10;
	         do{
	              System.out.println(i);
	              i--;
	         }while(i>1);
	    }
	    
//example of Break Statement
/*Break statements when they appear terminate the current iteration of a loop in which it presents
 * which allows for control of precise values that will allow for a loop to end */
	    
	    public static void bstatement(){
	    	
	    	 int num =0;
	         while(num<=100)
	         {
	             System.out.println("Value of variable is: " + num);
	             if (num==2)
	             {
	                break;
	             }
	             num++;
	         }
	         System.out.println("Out of while-loop");
	     }
	    	
	}
	  




