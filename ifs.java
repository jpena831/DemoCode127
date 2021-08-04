/***
 * @author Joslenne Pena
 * 
 */
public class ifs {
    
    public static void main(String[] args) {
        // int num1 = 10;
        // int num2 = 3;
        int myGrade = 85;
        int gradeA = 90;
        int gradeC = 70;
        if (myGrade > gradeA){
            System.out.println("yay you are passing with more than a 90");
        }
        else if (myGrade <= gradeC) {
            System.out.println("you are above a C range"); 
        }
        else{
            System.out.println("you are within the range of a B - A");
        }
    }
}
