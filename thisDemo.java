public class thisDemo {

    //not private for now
    int num1;
  
    // Constructor with a parameter
    public thisDemo(int num1) {
      // refers to the current num1 in the scope of this method
      //this.num1 = num1; // --> right
      //what happens when you have no keyword???
      num1 = num1; //--> gives you 0 not 8 
    }
  
    // Call the constructor in our main method
    public static void main(String[] args) {
    // create a new instance of the thisDemo object points to the myNum reference variable
      thisDemo myNum = new thisDemo(8);
      System.out.println("Value of x = " + myNum.num1);
    }
  }