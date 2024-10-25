public class bai2_8 {
    private bai2_6 center;
    private int radius;

    public bai2_8() {
        this.center = new bai2_6(0, 0);
        this.radius = 1;
    }
    public bai2_8(int x, int y, int radius) {
        this.center = new bai2_6(x, y);
        this.radius = radius;
    }
    public bai2_8(bai2_6 center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public bai2_6 getCenter() {
        return center;
    }
    public void setCenter (bai2_6 center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        center.setY(y);
    }
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }
    public String toString() {
        return "MyCircle[radius = " + radius + ", center = (" + center.getX() + ", " + center.getY() + ")]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(bai2_8 another) {
        return center.distance(another.center);
    }
}
