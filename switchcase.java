import java.util.Scanner;

/**
 * @author Joslenne
 * 
 * this is demo code to demonstrate switch statements
 * partial credit goes to user github user: cave of programming
 */
public class switchcase {
    
    public static void main(String[] args) {
        // creating a new scanner object
        Scanner myInput = new Scanner(System.in);
 
        System.out.println("Please enter a command: "); //greeting
        String text = myInput.nextLine();
        
 
        switch (text) {
        case "start":
            System.out.println("Machine started!");
            break;
 
        case "stop":
            System.out.println("Machine stopped.");
            break;
 
        default:
            System.out.println("Command not recognized");
        }
    }
    
}
