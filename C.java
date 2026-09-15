public class C extends B{
    private int z = 0;

    public C(int y, int z) {
        super(y);
        this.z = z - 1;
    }
    public int bar() {
        return foo()/z;
    }
    public int getZ(){
        return z;
    }
}
