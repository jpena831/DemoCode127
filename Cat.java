
public class Cat extends Animal{
    //we use override keyword at times to method override is known
    //as runtime Polymorphism
    @Override
    public void sound(){
        System.out.println("Meow");
    }

    @Override
    public void matingCall(){
        System.out.println("Wintertime specificilly last 3 weeks in December");
    }
}

// Horse h = new Horse();
// Animal a = h;
// Object o = h;