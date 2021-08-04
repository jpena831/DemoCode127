/** @author Joslenne Pena
 * 
 * 3/25/21
 */
import java.util.ArrayList;
import java.util.List;

// using the import statement below means importing all Java core utilities
// import java.util.*

public class myMain {
    
    public static void main(String[] args) {
        // c-style for loop
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }

        // for-each loop
        List<String> cars = List.of("jeep", "ford", "toyota");
        for (String i : cars){
            System.out.println(i);
        }

        // while loop
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        //dp while loop
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        // creating objects

        // here we are using the List interface generally to say we can 
        // typecast to another type of list like linkedlist or vector
        // this is a more general implementation of the list interface
        List<String> myList = new ArrayList<>();

        // the one below is more specific and means that you are bound
        // to use the arraylist methods only
        ArrayList<String> coffee = new ArrayList<>();
    }
}
