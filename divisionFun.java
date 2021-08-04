/** 
 * @author Joslenne Pena
 * 
 * to demonstrate method overloading also known as runtime/static polymorphism. 
 * 
 * When there are multiple methods with same name but 
 * different parameters then these methods are said to be overloaded. 
 * Methods can be overloaded by change 
 * in number of arguments or/and change in type of arguments.
 * 
 * When something is static, it can be 
 * accessed before any objects of its class are created, 
 * and without reference to any object.
 */

public class divisionFun{

    // two similar methods with no return types the only
    // difference is their formal parameters
    private static void calculate(int a, int b){
        System.out.println("answer: " + (a / b));
    }

    private static void calculate(double x, double y){
        System.out.println("answer: " + (x / y));
    }
    public static void main(String[] args) {
        //divisionFun myVar = new divisionFun();
        calculate(4, 2);
        calculate(5.5, 1.2);
    }
}