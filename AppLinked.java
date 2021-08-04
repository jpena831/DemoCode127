/**
 * @author Joslenne Pena
 * 
 * demo for Linked Lists
 */

import java.util.LinkedList; //importing the linked list class

public class AppLinked {  
    public static void main(String[] args) {
        //creating an linkedlist object 
        LinkedList<String> sports = new LinkedList<String>();

        sports.add("baseball");
        sports.add("football");
        sports.add("basketball");
        sports.add("hockey");
        sports.add("soccer");
        System.out.println(sports);

        sports.addFirst("rugby");
        System.out.println(sports);

        sports.addLast("golf");
        System.out.println(sports);

        sports.removeFirst();
        System.out.println(sports);

        sports.removeLast();
        System.out.println(sports);

        System.out.println(sports.getFirst());
        System.out.println(sports.getLast());

        //linkedlist - use the list by looping instead of accessing random items
        // " " - frequent or consistent about adding/removiung items in any part of the list
        // beginning, middle, or end of list (location matters)

        //arraylist - you want to access random items more consistenly and frquently
        // " " - you only care about adding or removing things at end of list
    }
}
