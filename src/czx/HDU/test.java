package czx.HDU;

class Shooting {
    public static void main(String[] args) {

        Target target = new MyTarget(3, 2);

        int[][] xy = {
                {-4,-2},{4,2},{-4,2},{4,-2},
                {-2,-4},{2,4},{-2,4},{2,-4},
                {-3,-3},{3,3},{-3,3},{3,-3},
                {-3,0}, {3,0},{0,-3},{0,3},
                {-1,-1},{1,1},{-1,1},{1,-1}
        };
        for(int z = 0; z < xy.length; z++) {
            Shot shot = new Shot(xy[z]);
            boolean hit = target.hitBy(shot);
            System.out.println(shot + " " + (hit ? "X" : "O"));
        }
        System.out.println();
    }
}

class Shot {
    private int x, y;

    public Shot(int[] array) {
        this.x = array[0];
        this.y = array[1];
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override public String toString() {
        return "(" + x + "," + y + ")";
    }
}

abstract class Target {
    abstract public boolean hitBy(Shot shot); // true if Shot hits Target
}

