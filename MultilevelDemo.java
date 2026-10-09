// Grandparent class
class Grandparent {
    void showGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}

// Parent class extending Grandparent
class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is the parent class.");
    }
}

// Child class extending Parent
class Child extends Parent {
    void showChild() {
        System.out.println("This is the child class.");
    }
}

// Main class to test multilevel inheritance
public class MultilevelDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showGrandparent(); // Inherited from Grandparent
        obj.showParent();      // Inherited from Parent
        obj.showChild();       // Defined in Child
    }
}
