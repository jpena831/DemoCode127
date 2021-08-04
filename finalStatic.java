public class finalStatic {
    
    /**
     * DEMO ON FINAL VARIABLES
     */ 
    // final int z = 100;
    // final double tax = 2.22;
      
    // public static void main(String[] args) {
    //     finalStatic newVar = new finalStatic();
    //     newVar.z = 55; // error: cannot assign a value to a final variable
    //     newVar.tax = 74; // error: cannot assign a value to a final variable
    //     System.out.println(newVar.z);
    // }

    /**
     * DEMO ON STATIC METHODS VERSUS PUBLIC BELOW
     */
    
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
     // Main method
    public static void main(String[ ] args) {
        //myStaticMethod(); // Call the static method
        //myPublicMethod(); //This would output an error

        finalStatic myObj = new finalStatic(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method
  }
}
