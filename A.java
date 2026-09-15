public class A{
    private int x = 0;
    public A(int x) {
    this.x = x;
    }
    public int foo() {
    return x - 10;
    }
    public void increment() {
    x+=4;
    }
    public int getX() {
    return x;
    }
}