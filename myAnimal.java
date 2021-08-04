public class myAnimal {
    
    public static void main(String[] args) {
    Animal pet = new Animal();  // Create a Animal object
    Animal myHorse = new Horse();  // Create a horse object
    Animal myCat = new Cat();  // Create a Cat object
    pet.sound(); //1
    System.out.println("-------");
    myHorse.sound(); //2
    System.out.println("-------");
    myCat.sound(); //3
    }


}
