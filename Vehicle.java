public interface Vehicle { 
    // create the interface
    // we create empty methods that do not have bodies

    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a);
}

// create one class called Bicycle that is implemented using the Vehicle interface
class Bicycle implements Vehicle{ 
      
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



    //Multiple inheritance by interface occurs if a class implements multiple interfaces or also if an interface itself extends multiple interfaces.
