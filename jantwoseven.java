public class jantwoseven {
    
    public static void main(String[] args) {
        /**
         * mutable - you can change, modify
         * immutable - you are NOT able to change, modify
         * 
         * Strings are immutable
         * Lists can be both immutable AND mutable depending
         * on data and context
         */


        /*
         * below is an example of a while loop, these loops
         * are at risk of running infinitely. They execute as long
         * as the boolean condition is true or satisfied. Once it is 
         * evaluated false or not true the loop will stop executing.
         * 
         * In example below we are defining a counter outside of the loop
         * and then we are looping until we reach 10. 
         * 
         * Then we are incrementing or increasing the counter by 1 
         * each time we loop through
         */
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; 
        } 

        /***
         * our looping variable below for this traditional
         * C-style for loop is 'a'. In for loops typically we know
         * the fixed count or number of times this will run for.
         * 
         * We should get 0-9
         */
        for (int a=0; a < 10; a++) {
            System.out.println(a);
        } 
        
        /**
         * below we are using a for-each loop to loop through
         * list items in a string list or arrays.
         * this particular Array is defined as string data types and
         * we named/declated it coffee. the elements are 3 items that 
         * are strings.
         * 
         * W
         * 
         * The length of the array is 3 meanwhile to access particular 
         * elements in this array, remember index positions. In other words
         * we start counting at 0 not 1.
         * 
         * coffee[0] accesses the caramel string
         * coffee[0] = "mocha" will actually edit the item from caramel to mocha, which is why this array
         * is mutable, you can change it without making a new object or variable
         * 
         * In order to add remove or modify elements in this list
         * you can view String or List-based methods
         */
        String[] coffee = {"caramel", "vanilla", "hazelnut"};
        for (String x : coffee) {
            System.out.println(x);
        }
    }
}
