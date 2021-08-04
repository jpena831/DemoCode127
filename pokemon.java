public class pokemon {
    
    private String pname;
    private int attack;
    private int defense;
    private String ptype;

    public void pInfo(){
        System.out.println("Pokemon name is " + pname + " and pokemon type is" + " " + ptype);
        System.out.println("It's attack is " + attack + " and defense is" + " " + defense);

    }

    public void setStats(int attack, int defense){
        this.attack = attack;
        this.defense = defense;
    }

    public void setMeta(String pname, String ptype){
        this.pname = pname;
        this.ptype = ptype;
    }
}
