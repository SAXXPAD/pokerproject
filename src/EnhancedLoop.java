

//Enhanced for loops, and a Method Overload Application
//MAKE SURE TO LOOK AT ARRAYAPPLICATION CLASS FOR ACCUMULATOR

//Enhanced For Loop
public class EnhancedLoop {
	
		   public static void dot() {
		      
		     int[] numbers = {3, 4, 5, -5, 0, 12};
		     int sum = 0;
		      
		      for (int number: numbers) {
		         sum += number;
		      }
		      
		      System.out.println("Sum = " + sum);
		   }
		   
		   //Method overloading (Different number of parameters in Arguement List)
		       public void disp(char w)
		       {
		            System.out.println(w);
		       }
		       public void disp(char w, int num)  
		       {
		            System.out.println(w + " "+num);
		       }
		   
		      public static void overload()
		      {
		          EnhancedLoop obj = new EnhancedLoop();
		          obj.disp('h');
		          obj.disp('h',15);
		      }
		   }
		


