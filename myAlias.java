/**
 * @author Joslenne Pena
 * 
 * to demonstrate object aliasing
 */

public class myAlias {
    
    public static void main(String[] args) {
        // int num1 = 5;
        // int num2 = 6;

        // System.out.println(num1);
        // System.out.println(num2);

        // reassigning or overwriting values even though they will
        // have different names and stored in memory differently
        // this object aliasing where we make a copy
        // num2 = num1; 

        // System.out.println(num1);
        // System.out.println(num2);

        String firstname = "Joss";
        String favdrink = "coffee";

        System.out.println(firstname);
        System.out.println(favdrink);

        // object aliasing for strings
        favdrink = firstname;

        System.out.println(firstname);
        System.out.println(favdrink);

    }
}
