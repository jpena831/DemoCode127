
/**
 * @author Joslenne Pena
 * 
 * shared mutability demo
 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class mutes {
    
    private String year;

    public mutes(String year){
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }
    public static void main(String[] args) {
         /**
         * IMMUTABILITY VS. MUTABILITY
         * SHARED MUTABILITY
         */
        //IMMUTABLE
        // System.out.println("--------------------------------------");
        // String name = "Joslenne";
        // String s = name; //aliasing
        // System.out.println(s);
        // name = name.concat("Pena"); 

        // System.out.println(name); 
        // System.out.println(s); // s will still be joslenne and not change

        // MUTABLE
        // System.out.println("------------------------------------------------");
        // mutes mute = new mutes("1985");
        // System.out.println(mute.getYear());

        // mute.setYear("1929");
        // mute.setYear("1929");
        // mute.setYear("1929");
        // mute.setYear("1929");
        // mute.setYear("1929");
        // mute.setYear("1929");
        // mute.setYear("1929");
        // mute.setYear("1929");
        // System.out.println(mute.getYear());

        //SHARED MUTABLE STATE 
        //remember state is your private instance variables (door open or closed)
        //Shared Mutability means sharing the ability of changing 
        //an object’s state after it is created, with others

        //shared is good and mutable is good but together shared mutability is BAD
        //better to avoid creating things that allows to share it mutability
        //if you want to do parallel processing with mutable data you need to 
        //synchronize the access to the mutable variables

    }
}
