/**
 * @author Joslenne Pena
 * 
 * demo on scanner and user input
 */
//import scanner class
import java.util.Scanner;

public class scans {
    public static void main(String[] args) {
    
    System.out.println("----------------------------------");    
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username, age and cost of gas (please use separate lines)");

    String userName = inp.nextLine();  // Read user input

    //numerical input (int and a double)
    int age = inp.nextInt();
    double gasCost = inp.nextDouble();

    System.out.println("Username is: " + userName);  // Output user inputjpena
    System.out.println("Age is: " + age);  // Output user input
    System.out.println("Gas cost is: " + gasCost);  // Output user input

    inp.close();
    }
}
