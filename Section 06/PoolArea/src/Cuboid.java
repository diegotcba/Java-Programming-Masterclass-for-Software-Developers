/**
 * Created by DiegoT on 05/06/2019.
 */
public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getVolume() {
        return (getHeight() * getArea());
    }

    public double getHeight() {
        return height;
    }
}
