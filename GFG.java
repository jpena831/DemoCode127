public class GFG {
    // main class to run the vehicle interface and its 
    // implementations
    public static void main(String[] args) { 
          
        // creating an inatance of Bicycle  
        // doing some operations  
        Bicycle bicycle = new Bicycle(); 
        bicycle.changeGear(2); 
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1); 
              
        bicycle.printStates(); 

        System.out.println("--------------------------------");
              
        //creating instance of the moped. 
        Moped moped = new Moped(); 
        moped.changeGear(1); 
        moped.speedUp(4); 
        moped.applyBrakes(3);     
        
        moped.printStates(); 
    }
}
