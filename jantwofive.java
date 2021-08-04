/** 
 * @author Joslenne Pena
 * 3/22/21
 * below is a public class which I created called jantwofive, public 
means this class is accessible anywhere. Notice how the name of the class is 
the same name as the actual Java file. 
*/

// import java.lang.String;

public class jantwofive {
    
    /* public static void main(String[] args) is the magical words we need to run our
    programs, these are typically seen nested under our public class.
    */
    public static void main(String[] args) {
        // these are comments you use forward slashes 

        /* you can also make mult-line comments with the asterisk star and 
        slash, like this */

        // here I am declaring and initializing these variables as string data types
        // I am assigning values to these variables
        //string literal uses references of cached strings memory
        String greeting = "Hello";
        String welcome = "Hello";

        String first = "John";
        String last = "Smith";

        String x = "20";
        String y = "22";
        // below I can join two string variables together in z
        String z = x + y;

        // here I am printing out the joining of x and y as strings
        System.out.println(z);

        //alias
        x=y;
        System.out.println(x);

        // here I am printing out the length of the variable called first
        /* pay attention to the dot syntax which is a method invocation, 
        here .length() is attached to the variable (or in some cases a data object), 
        called first and its a way of invoking an action. You tell Java, please do this, 
        and return an answer... in this case .length() is a method
        */
        System.out.println(first.length());

        /* below we are printing the joining of the first and last variable in one line,
        and concatenating with a space using quotes. Here we use the + operator. */
        System.out.println(first + " " + last);

        // here I am simply just printing the variable greeting which stores the string "hello"
        System.out.println(greeting);

        /* below I am printing out the comparison of 2 strings above from the variables
        greeting and welcome. Notice both of these variables contain the same phrase "Hello"
        which is 5 letters. 
        The method returns 0 if the string is equal to the other string. In this case, it is 
        so it returns 0. 
        Again, pay attention to the method invocation of compareTo from the String class,
        using the dot attached to the variable/object dictates a direct action.
        */
        System.out.println(greeting.compareTo(welcome));


        //objects
        String s2 = new String("abcde");

        jantwofive myDate = new jantwofive();
    }
}
