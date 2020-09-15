 import java.util.Scanner;

/**
 *This program lets the user know if they plugged in an even or odd number
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input 
    Scanner input = new Scanner(System.in);
    
    //prompt user for their number
    System.out.println("Enter your number"); 
    //intialize user's number
    int number = input.nextInt();
    //intialize the remainder
    int remainder = number % 2; 
    
    //Determin whether user's number is odd or even
    if (remainder >= 1){
      System.out.println(number + " is an odd number ");
    }else{
      System.out.println(number +" is an even number");
    }   


  }
}
