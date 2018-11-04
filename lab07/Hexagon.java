import java.util.Objects;

public class Hexagon extends Shape {
    private Point center;
    private  Point A;
    private  Point B;
    private  Point C;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private  double r,R;

    public Hexagon(String color, boolean filled, Point center, double r ,double R,double x,double y) {
        super(color, filled);
          this.center=center;
        this.r=r;
        this.R=R;
    }
    public Hexagon(Point center, double r,double R,double x,double y) {
        this.center= center;
        center.setX(x);
        center.setY(y);
        this.r=r;
        this.R=R;
       A=new Point(center.getX()+R,center.getY());
       B= new Point(center.getX()+Math.sqrt(R*R-r*r),center.getY()+r );
       C= new Point(center.getX(),center.getY()+r);
    }


    public Hexagon() {
        this.r = 1.0;
        this.R=1.2;
        this.center = new Point();
    }
    private  double getArea ()
    {
        return  3.464 *r*r;
    }



    @Override
    protected void moveTo(double X, double Y) {

    }

    public Hexagon(String color, boolean filled) {
        this();
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center= center;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexagon hexagon = (Hexagon) o;
        return Double.compare(hexagon.r, r) == 0 &&
                Double.compare(hexagon.R, R) == 0 &&
                Objects.equals(center.getX(), hexagon.center.getX()) && Objects.equals(center.getY(), hexagon.center.getY()) &&
                Objects.equals(A.getX(),hexagon.A.getX()) && Objects.equals(A.getY(), hexagon.A.getY()) &&
                Objects.equals(B.getX(),hexagon.B.getX()) && Objects.equals(B.getY(), hexagon.B.getY()) &&
                Objects.equals(C.getX(),hexagon.C.getX()) && Objects.equals(C.getY(), hexagon.C.getY()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, A, B, C, r, R);
    }
    @Override
    public String toString() {
        return "Hexagon{" +
                "Center=" + center +
                ", r=" + r +
                ", R=" + R +
                ", Area=" + getArea() +
                ", Color&Filled: " + super.toString() +
                '}';
    }

}