import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author Joslenne Pena
 * 
 * demo for array refresher
 */
public class muted{
    public static void main(String[] args) {
        /**
         * ARRAYS VS. ARRAYLIST REFRESHER
         */
        //built-in java array - Simple fixed sized arrays
        // String[] colors = {"red", "blue", "green", "yellow"};
        // double[] costs = {4.3, 5.1, 66.2, 33.3, 100.71};
        // System.out.println(Arrays.toString(colors));
        // //using index position I can change elements but not remove or add!
        // colors[0] = "purple";
        // System.out.println(colors[0]);
        // System.out.println(Arrays.toString(colors));
        // Arrays.sort(colors);
        // System.out.println(Arrays.toString(colors));

        // Dynamic sized arrays in Java that implement List interface
        // create array list objects with methods
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("pizza");
        foods.add("burger");
        foods.add("hotdog");
        System.out.println(foods);
        foods.remove(1);
        System.out.println(foods);
        foods.get(0);//.set, .clear, .size
        

        //**** DIFFERENCE *****//

        // the size of an array cannot be modified 
        // (if you want to add or remove elements to/from an array, 
        // you have to create a new one), elements can be added 
        //and removed from an ArrayList whenever you want

        /**
         * Array is a fixed length data structure whereas ArrayList is a variable 
         * length Collection framework. We cannot change length of array once created in Java 
         * but ArrayList can be changed (AKA mutable). We cannot store primitives in ArrayList, 
         * it can only store objects. 
         */

    }
}