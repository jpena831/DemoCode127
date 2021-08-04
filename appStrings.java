import java.lang.String;

public class appStrings {
    
    public static void main(String[] args) {
        
        String greeting = "Hello";
        String welcome = "Hello";

        String x = "22";
        String y = "20";

        String z = x + y;

        System.out.println(z);

        //alias reference
        System.out.println("-----------------");
        x = y;
        System.out.println(x); // prints out 20

        System.out.println(welcome.length());

        //objects
        String s2 = new String("abcdefgh");

        appStrings theString = new appStrings();

    }
}
