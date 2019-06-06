/**
 * Created by DiegoT on 05/06/2019.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0.0) {
            this.radius = 0.0;
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }
}
