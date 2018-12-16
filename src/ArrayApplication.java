import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayApplication {
 
  public static void arr() {
    
    ddArr();
    arrList();
    generics();
    
    
    System.out.println("Loops");
    int[] anArray = { 200, 400, 600 };

    for (int i = 0; i < anArray.length; i++) {
      System.out.println(anArray[i]);
    }
    //Array length is 3
    for (int i = 0; i < anArray.length; i++) {
      if (anArray[i] == 500) {
        
        System.out.println("Found");
      }

    }
    
    System.out.println("Not Found");
    
  }
  
  public static void ddArr() {

    int[][] boxscore = new int[2][9];
    int[][] board = new int[3][3];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = i + j;
      }
    }

    String[][] words = new String[2][];

  }

  public static void arrList() {
    ArrayList<String> list = new ArrayList<String>(); 
    list.add("1st Item"); 
    list.add("2nd Item"); 
    int pos = list.indexOf("1st Item"); 
    int size = list.size();
    System.out.println("Size is " + size);
    list.add("3rd Item"); 
    size = list.size(); 
    System.out.println("Size is " + size);
    boolean element = list.contains("5th Item"); 
    String item = list.get(0); 
    list.remove(0); 
    System.out.println("list.get(0) = " + list.get(0));
    list.remove("2nd Item"); 

    list.add("1st Item"); 
    list.add("2nd Item"); 
    
    for (int i = 0; i < list.size(); i++) {
      System.out.println("Index: " + i + " - Item: " + list.get(i));
    }

    for (String str : list) {
      System.out.println("Item is: " + str);
    }
  }

  public static void generics() {
    
    List<String> list = new ArrayList<String>();
    list.add("hello");
    String s = (String) list.get(0);
    
    List<String> stringList = new ArrayList<String>();
    stringList.add("hello");
    s = stringList.get(0); 

    genMethod(); 
  }

  public static void genMethod() {
    
    Integer[] intArray = { 20, 40, 60, 80, 100 };
    int a = 0;
	int sum = IntStream.of(a).sum();			//Added accumulator to count total sum of an array
	
    System.out.println("The sum is " + sum);
    Double[] doubleArray = { 0.1, 0.2, 0.3, 0.4 };
    Character[] charArray = { 'K', 'A', 'P', 'P', 'A' };

    System.out.println("Array integerArray contains:");
    printArray(intArray); 

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray); 

    System.out.println("\nArray characterArray contains:");
    printArray(charArray); 
  }
  
  public static <E> void printArray(E[] inputArray) {
    
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }
}