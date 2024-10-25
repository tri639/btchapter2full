public class bai2_6 {
    private int x = 0;
    private int y = 0;

    public bai2_6() {
        x = 0;
        y = 0;
    }

    public bai2_6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toSTring() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance (bai2_6 another) {
        return distance(another.x, another.y);
    }
    public double distance() {
        return distance(0,0);
    }
}
class testbai2_6 {
    public static void main(String[] args) {
        bai2_6 p1 = new bai2_6(3,4);
        System.out.println(p1.distance(5,6));

        bai2_6 p2 = new bai2_6(5,6);
        System.out.println(p2.distance(p2));

        System.out.println(p1.distance());
    }
}