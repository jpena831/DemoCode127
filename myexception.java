public class myexception {
    static void isAge(int yourAge) {
        if (yourAge < 21) {
          throw new ArithmeticException("DENIED you must be 21 to drink and access alcohol.");
        }
        else {
          System.out.println("GRANTED"); // 3
        }
      }
    
      public static void main(String[] args) {
        isAge(23)
      }
}
