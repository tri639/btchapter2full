public class bai2_7 {
    private bai2_6 begin;
    private bai2_6 end;

    public bai2_7(int x1, int y1, int x2, int y2) {
        this.begin = new bai2_6(x1, y1);
        this.end = new bai2_6(x2, y2);
    }
    public bai2_7(bai2_6 begin, bai2_6 end) {
        this.begin = begin;
        this.end= end;
    }
    public bai2_6 getBegin() {
        return begin;
    }
    public void setBegin(bai2_6 begin) {
        this.begin = begin;
    }
    public bai2_6 getEnd() {
        return end;
    }
    public void setEnd(bai2_6 end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString() {
        return "MyLine[begin = " + begin + ", end = " + end +"]";
    }
}
class testbai2_7 {
    public static void main(String[] args) {
        bai2_7 l1 = new bai2_7(1,2,3,4);
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());
        System.out.println(l1);
    }
}