public class B extends A{
    private int y = 0;

    public B(int y) {
        super(y+2);
        this.y = y + 7;
    }

    @Override
    public int foo() {
        return y-5;
    }

    public int getY() {
        return y;
    }
}
