/***
 * @author Joslenne Pena
 * 
 * demonstration of ENCAPSULATION through class anatomy with instance variables
 * getter, setter methods, return types and main method with new
 * objects created
 * 
 * ENCAPSULATION is the hidden state and slight visibility of behavior
 * you may want things public v. private, it gives developer more control
 * over data, code, and security
 * 
 * The keyword private restricts access to the declaring class, while the keyword public allows access from classes outside the declaring class.
    Instance variables are encapsulated by using the private access modifier.
 */

public class Team {
    // private variables can only be accessed within same class
    // an outside class does NOT have access
    // using set and get methods we can control access
    //The keyword private restricts access to the declaring class, while the keyword public allows access from classes outside the declaring class
    private String teamName;
    private String teamEmail;
    private String teamPhoneNumber;


    public Team(String initTeamName, String initTeamEmail, String initTeamPhone)
   {
      teamName = initTeamName;
      teamEmail = initTeamEmail;
      teamPhoneNumber = initTeamPhone;
   }

    //getter - accessor with return type
    public String getName() {
        return teamName;
    }

    //setter - mutator
    public void setName(String newTeamname){
        // this keyword is used to eliminate confusion from
        // attributes/parameters with the same name
        //The this keyword refers to the current object in a method or constructor.
        this.teamName = newTeamname;
    }
    public static void main(String[] args) {
        System.out.println("=====================");
        Team anotherTeam = new Team();
        System.out.println(anotherTeam);
        anotherTeam.setName("Minnesota Twins");
        System.out.println("=====================");
        System.out.println(anotherTeam.getName());
        // .toString()

    }
}
