/**
 * @author Joslenne Pena
 * 
 * Demo for Arrays 
 */

public class AppArrays {
    
    public static void main(String[] args) {
        
        // we access arrays starting from 0 these are called indices or index numbers
        // accessing an element looks like [1]
        String[] fruits = {"banana", "apple", "orange", "grapes"};

        int[] evenNums = {2, 4, 6, 8, 10, 12, 14};

        System.out.println(fruits[0]);
        System.out.println(evenNums[0]);

        //changing an array element
        fruits[0] = "mango";
        evenNums[0] = 16;

        System.out.println(fruits[0]);
        System.out.println(evenNums[0]);

        // .length attaches to an object or variable and it determines the
        // length of the array and item amount
        System.out.println(fruits.length);

        //loops 
        // C-style traditional for loop
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("----------------------------");
        // for-each loop
        // exclusively for arrays probably better
        for (String i : fruits) {
            System.out.println(i);
        }

        //multidimensional arrays
        //an array that combines or contains one or more arrays
        int[][] oddNums = { {1, 3, 5}, {7, 9, 11, 13} };
        int y = oddNums[0][1];
        System.out.println(y);
    }
}
