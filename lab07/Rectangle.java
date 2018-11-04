import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private  Point A=new Point();
            private Point B,C,D;


    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }
    public Rectangle(String color,Boolean filled,double width, double length,double x,double y) {
        super(color,filled);
        this.width = width;
        this.length = length;
        A.setX(x);
        A.setY(y);
        B= new Point(A.getX()+width,A.getY());
        C = new Point(A.getX() + width,A.getY() + length);
        D = new Point(A.getX(),A.getY() + length);

    }
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }
    public Rectangle() {
        this("red", true,1, 1,1,1);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length  + '}';
    }
    @Override
    protected void moveTo(double x, double y) {
        this.A.setX(A.getX() + x);
        this.A.setY(A.getY() + y);
        this.B.setX(B.getX() + x);
        this.B.setY(B.getY() + y);
        this.C.setX(C.getX() + x);
        this.C.setY(C.getY() + y);
        this.D.setX(D.getX() + x);
        this.D.setY(D.getY() + y);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.length, length) == 0 &&
                Objects.equals(A.getX(), rectangle.A.getX()) && Objects.equals(A.getY(), rectangle.A.getY()) &&
                Objects.equals(B.getX(),rectangle.B.getX()) && Objects.equals(B.getY(), rectangle.B.getY()) &&
                Objects.equals(C.getX(),rectangle.C.getX()) && Objects.equals(C.getY(), rectangle.C.getY())  &&
        Objects.equals(D.getX(),rectangle.D.getX()) && Objects.equals(D.getY(), rectangle.D.getY()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, A, B, C, D);
    }



}