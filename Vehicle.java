public interface Vehicle {
    
    // all are the abstract methods. 
    // create the interface
    // we create empty methods that do not have bodies

    //methods in an interface are abstract by default

    //Multiple inheritance by interface occurs if a class implements 
    //multiple interfaces or also if an interface itself extends multiple interfaces.
    abstract void changeGear(int a); 
    abstract void speedUp(int a); 
    abstract void applyBrakes(int a);
}

// create one class called Bicycle that is implemented using
// the Vehcicle interface
class Bicycle implements Vehicle, model{ 
      
    int speed=1; 
    int gear; 

    String year, make, shape;
      
     // to change gear 
    @Override
    public void changeGear(int newGear){     
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){    
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){  
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    }      

    //second interface
    public void make(){
        System.out.println("the make is" + make);
    }
    public void shape(){
        System.out.println("the shape is" + shape);
    }
    public void year(){
        System.out.println("the year is" + year);
    }
} 

// creating a second class that implements the Vehicle interface
class Moped implements Vehicle{ 
      
    int speed; 
    int gear; 
      
     // to change gear 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    }      
} 



