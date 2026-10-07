 // Now lets say we two subclasses of Animal class: Horse and Cat 
 // that extends (AKA inheritance) Animal class. We can provide the 
 // implementation to the same method like this:
 
public class Horse extends Animal{
    //we use override keyword at times to method override is known as runtime Polymorphism: 
    //The program decides which method to call based on the actual object type created at runtime, rather than the reference type declared in the code
    @Override
    public void sound(){
        System.out.println("Neigh");
        //super.sound();
    }
}