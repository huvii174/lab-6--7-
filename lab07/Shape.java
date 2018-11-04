public abstract class Shape {
    private String color;
    private boolean filled;



    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }
    public Shape() {
        this("black", true);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract protected void moveTo(double X, double Y);
    @Override
    public String toString() {
        return "color='" + color  + ", filled=" + filled ;
    }
}