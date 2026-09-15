public class ABCProgram {
    public static void main(String[] args) {
        A a = new A(7);
        B b = new B(4);
        C c = new C(6, 4);
        System.out.println(a.foo());
        System.out.println(b.getX());
        System.out.println(b.foo());
        System.out.println(b.getX());
        System.out.println(c.bar());
        System.out.println(c.getX());
        System.out.println(c.getY());
    }
}