public class myMethod {
    //items in the declaration
    //visibility modifiers
    //return type
    //formal parameters
    //method name

    private int cost;
    
    static void newMethod(String food) { // method signature (name & parameter)
        //method body
        System.out.println("my favorite food is " + food);
    }
    
    public static void main(String[] args) {
        newMethod("pizza");
        newMethod("hotdog");
        newMethod("cheeseburger");
    }
}
