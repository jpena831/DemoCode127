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
 */

public class Team {
    // private variables can only be accessed within same class
    // an outside class does NOT have access
    // using set and get methods we can control access
    private String teamName;

    //getter - accessor with return type
    public String getName() {
        return teamName;
    }

    //setter - mutator
    public void setName(String newTeamname){
        // this keyword is used to eliminate confusion from
        // attributes/parameters with the same name
        this.teamName = newTeamname;
    }
    public static void main(String[] args) {
        Team anotherTeam = new Team();
        anotherTeam.setName("Minnesota Twins");
        System.out.println(anotherTeam.getName());

    }
}
