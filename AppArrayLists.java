
/**
 * @author Joslenne Pena
 * 
 * Demo for Array Lists different than arrays
 */
import java.util.ArrayList; //importing the array class
import java.util.Collections;

public class AppArrayLists {
    public static void main(String[] args) { 
        // creating an ArrayList object
    
        ArrayList<String> sports = new ArrayList<String>();

        sports.add("baseball");
        sports.add("football");
        sports.add("basketball");
        sports.add("hockey");
        sports.add("soccer");
        System.out.println(sports);
        System.out.println(sports.get(0));
        sports.set(0, "golf");
        System.out.println(sports.get(0));
        sports.remove(0);
        System.out.println(sports);
        // .size method is the same as .length property of the Java builtin arrays
        System.out.println(sports.size());
        
        // remove ALL elements in the array
        //sports.clear();

        //loop []
        for (int i = 0; i < sports.size(); i++){
            System.out.println(sports.get(i));
        }

        System.out.println("----------------");

        // sort the arraylist
        Collections.sort(sports);
        for (String i : sports) {
            System.out.println(i);
        } 

        // Integer x = 5;
         
        // System.out.println(x.toString());  
        // System.out.println(Integer.toString(12)); 
          

    }
}
