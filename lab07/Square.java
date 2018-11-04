import java.util.Objects;

public class Square extends  Rectangle {

    private double side;
    public Square(String color, boolean filled, double side,double x,double y) {
        super(color,filled,side,side,x,y);
    }
    public Square( double side) {

        this.side = side;
    }



    public Square(String color, boolean filled) {
        super(color, filled);
        this.side = 1.0;

    }
    public Square() {
        this.side = 1.0;

    }
    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                ", color: "+ getColor()+
                ", filled : "+ isFilled()+
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}