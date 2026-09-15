import java.util.HashMap;
import java.util.List;

public class Chip {

    private int num;

    public Chip(int n) {
        num = n;
    }

    public boolean shallow(Chip ac) {
        return this == ac;
    }

    public boolean deep(Chip ac) {
        return this.num == ac.num;
    }

    void printOddItemsReversed(HashMap<String, String> items) {
        for (int i = items.size(); i >= 0; i -= 2) {
System.out.println(items.get(i));
}
    }

    public static void main(String[] args) {
        // Chip c0;
        // Chip c1 = new Chip(200);
        // Chip c2 = new Chip(200);
        // Chip c3 = new Chip(300);
        // Chip c4 = c1;

        //System.out.println(c0);
        //System.out.println(c1.shallow(c0));
        //System.out.println(c1.shallow(c1));
        //System.out.println(c1.shallow(c2));
        //System.out.println(c1.shallow(c3));
        //System.out.println(c1.shallow(c4));
       //System.out.println(c1.deep(c4));
        int x = 22;
        int y = 24;
        System.out.println(x + y); // 46
        x = y;
        System.out.println("here is new value from aliasing below");
        System.out.println(x + y);
        
    }
}