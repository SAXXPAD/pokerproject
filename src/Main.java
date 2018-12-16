
//Matthew Curiel
/*Hello All and Welcome!!! hope you enjoy my poker integration project. This will display my fond knowledge
 * of programming fundamentals I have acquired*/
/*This program is intended to function as a poker application, similar to poker applications
 * you may have seen in an application store I also plan on showing off all I have learned
 * throughout introduction to programming while in college*/

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
		
		PSI1.sstatement();//switch statement
		PSI2.bstatement();//
		PSI2.dwloop();//do while loop
		PSI2.floops();//for loop
		PSI2.wloops();//while loop
		
		Vehicle car1 = new Car();			//From here
		car1.sound();
		Vehicle moto1 = new Motorcycle();
		moto1.sound();						/*To here... 
											(Is my incorporation of Polymorphism using the "sound()" 
											from the Vehicle class and sharing the method with derived class
											Objects Car and Motorcycle )*/
		
		EnhancedLoop.overload();//overloaded Method
		EnhancedLoop.dot();//Enhanced For Loop
		ArrayApplication.arr();//many array applications
		ExceptionHandling.toss();//Exception Handling
	}
	
}
