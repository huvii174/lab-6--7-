import java.util.Objects;

public class Triangle extends Shape {
    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    private  Point  A=new Point();
         private  Point B=new Point();
         private  Point C=new Point();

    public Triangle(String color, boolean filled, double  Ax,double  Ay, double  Bx,double  By, double  Cx,double  Cy) {
        super(color, filled);
      A.setX(Ax);
      A.setX(Ay);
        A.setX(Bx);
        A.setX(By);
        A.setX(Cx);
        A.setX(Cy);

    }

    public Triangle(double  Ax,double  Ay, double  Bx,double  By, double  Cx,double  Cy) {
        super("Red",true);
        A.setX(Ax);
        A.setX(Ay);
        A.setX(Bx);
        A.setX(By);
        A.setX(Cx);
        A.setX(Cy);
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle() {
        this(1.0,2.0,3.0,4.0,5.0,6.0);
    }

    public double getArea() {
        return Math.abs(A.getX()*(B.getY()-C.getY()) + B.getX()*(C.getY()-A.getY()) + C.getX()*(A.getY()-B.getY())) / 2;
    }
    public double getPerimeter() {
        double AB = Math.sqrt(A.getX()-B.getX())*(A.getX()-B.getX())+(A.getY()-B.getY())*(A.getY()-B.getY());
        double BC = Math.sqrt(B.getX()-C.getX())*(B.getX()-C.getX())+(B.getY()-C.getY())*(B.getY()-C.getY());
        double AC =  Math.sqrt(A.getX()-C.getX())*(A.getX()-C.getX())+(A.getY()-C.getY())*(A.getY()-C.getY());
        return AB + BC + AC;
    }
    @Override
    public String toString() {
       return  "Triangle:  " + "A: " + A.toString() + ", B: " + B.toString() + ", C: " + C.toString() + " Color& Filled : " + super.toString() +", Area: " + getArea() ;

  
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return  Objects.equals(A.getX(), triangle.A.getX()) && Objects.equals(A.getY(), triangle.A.getY()) &&
                Objects.equals(B.getX(),triangle.B.getX()) && Objects.equals(B.getY(), triangle.B.getY()) &&
                Objects.equals(C.getX(),triangle.C.getX()) && Objects.equals(C.getY(), triangle.C.getY())  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, C);
    }

    @Override
    protected void moveTo(double x, double y) {
        this.A.setX(A.getX() + x);
        this.A.setY(A.getY() + y);
        this.B.setX(B.getX() + x);
        this.B.setY(B.getY() + y);
        this.C.setX(C.getX() + x);
        this.C.setY(C.getY() + y);
    }


}