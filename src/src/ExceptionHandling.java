import java.util.Scanner;

public class ExceptionHandling {

  public static void toss() {
    Scanner scanner = new Scanner(System.in);
    int t = 0; 
    System.out.println("Enter x1");   
    t = getDecentInput(scanner);
  }
  
    public static void toss(Scanner scan) {
    System.out.println("Testing Exceptions");
    int t = 0;
    System.out.println("Enter any number to test for error");
    t = getDecentInput(scan);
    System.out.println(t + " must be good!");
    manualToss();
  }

  public static void showTossUp(Scanner scanner) {
    int t = 0;
    System.out.println("Enter value t: ");   
    t = scanner.nextInt();
  }
  public static int getDecentInput(Scanner scanner) {
    boolean decentInput = false;
    int num = 0;
    
    while (decentInput == false) {
      try {
        num = scanner.nextInt();
        decentInput = true;
      } catch (Exception ex) {
        System.out.println("Requires an integer");
        scanner.nextLine();
      }
    }
    return num;
  }

  public static void manualToss() {
    int t = -5;
    try {
      if (t < 0) { // not a problem for Java
        throw new Exception();
      }
    } catch (Exception ex) {
      System.out.println("no negative values present, positive integer");
    }
  }
}