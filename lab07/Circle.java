import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private final double PI = Math.PI;
 private  Point center;

    public Circle(String color, boolean filled, double radius,Point center) {
        super(color, filled);
        this.center=center;
        this.radius = radius;

    }

    public Circle(double radius,Point center) {
        this.radius = radius;
        this.center=center;

    }
    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle() {
        this(1,new Point());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI  +
                ",Center: " + center+
                '}';
    }
    @Override
    protected void moveTo(double x, double y) {
        this.center.setX(this.center.getX() + x);
        this.center.setY(this.center.getY() + y);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
        Objects.equals(center.getX(), circle.center.getX())
                && Objects.equals(center.getY(), circle.center.getY());

    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }


}