package czx.HDU;

public class MyTarget extends Target {
    public MyTarget(int i, int i1) {
        super();
    }
    @Override
    public boolean hitBy(Shot shot) {
        return false;
    }
}
