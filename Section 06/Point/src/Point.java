/**
 * Created by DiegoT on 03/06/2019.
 */
public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    public double distance(int x, int y) {
        double calculatedDistance = 0;

        calculatedDistance = Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));

        return calculatedDistance;
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
}
