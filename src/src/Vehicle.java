//Part of PSI2
// Inheritance and Polymorphism Example

/*Inheritance allows for classes to share the contents of other classes by introducing
 * the idea of subclasses and superclasses. subclasses derive from superclasses.
 * This is important because because by definition inheritance is the process of 
 * defining derived classes based on an existing base class by extending its common
 *  methods and data members. This is good because now you don't have to rewrite similar
 *  code for different classes but you can use all the contents of one class for a similar class*/
	    public class Vehicle{
	    	
	    	String str = "Vehicle is making a sound";
	    	
	    	   public void sound(){
	    		   
	    	      System.out.println(str);
	    	      				  
	    	   }
	    	}
	    class Car extends Vehicle{
	        
	        public void sound(){
	            System.out.println("Vroom! " + super.str);
	        }
	        
	    }
	    
	    class Motorcycle extends Vehicle{
	    	public void sound(){
	            System.out.println("Zoom! " + super.str);
	        }
	    	
	    }