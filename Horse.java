 // Now lets say we two subclasses of Animal class: Horse and Cat 
 // that extends (AKA inheritance) Animal class. We can provide the 
 // implementation to the same method like this:
 
public class Horse extends Animal{
    //we use override keyword at times to method override is known
    //as runtime Polymorphism
    @Override
    public void sound(){
        System.out.println("Neigh");
        super.sound();
    }
}