/**
 * @author Joslenne Pena
 * 
 * demo on scanner and user input
 */
//import scanner class
import java.util.Scanner;

public class scans {
    public static void main(String[] args) {
    // Scanner game = new Scanner(System.in);  // Create a Scanner object
    // System.out.println("Enter the name of a game");
    // String myGame = game.nextLine();  // Read user input
    // System.out.println("The game chosen was:" + myGame);
    System.out.println("----------------------------------");    
    Scanner inp = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username, age and cost of gas");

    String userName = inp.nextLine();  // Read user input

    //numerical input (int and a double)
    int age = inp.nextInt();
    double gasCost = inp.nextDouble();

    System.out.println("Username is: " + userName);  // Output user input
    System.out.println("Age is: " + age);  // Output user input
    System.out.println("Gas cost is: " + gasCost);  // Output user input

    inp.close();
    }
}
