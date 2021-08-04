// Polymorphism is one of the OOP features that allows us to perform a 
// single action in different ways. For example, lets say we have a class Animal 
// that has a method sound(). Since this is a generic class so we can’t give 
// it an implementation like: Roar, Meow, Oink etc. We give a generic message

public class Animal{
    public void sound(){
       System.out.println("Animal is making a sound");   
    }

    public void matingCall(){
        System.out.println("Spring time");
    }
}

// Now lets say we two subclasses of Animal class: Horse and Cat 
// that extends (AKA inheritance) Animal class. We can provide the 
// implementation to the same method


 
