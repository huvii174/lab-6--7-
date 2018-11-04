public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1=new Circle();
        Rectangle rectangle = new Rectangle("red",true,1,2,3,4);
        Rectangle rectangle1 = new Rectangle("red",true,1,2,3,4);
        Square square = new Square("black",true,1,2,3);
        Square square1 = new Square("black",true,6,2,4);
       Triangle triangle = new Triangle(1,2,3,4,5,6);
        Triangle triangle1 = new Triangle(1,2,3,4,5,6);
        Hexagon hexagon= new Hexagon(new Point(1,2),1,1.2,2,2.2);
        Hexagon hexagon1= new Hexagon(new Point(1,2),1,1.2,2,2.2);
        Layer layer = new Layer();

        Diagram diagram = new Diagram();
       layer.add(triangle);
        layer.add(triangle1);
        layer.add(circle);
        layer.add(circle1);
        layer.add(rectangle);
        layer.add(rectangle1);
        layer.add(square);
        layer.add(square1);
        layer.add(hexagon);
        layer.add(hexagon1);
       // layer.printLayer();


        System.out.println("Adding to diagram : ");
        diagram.getDiagram().add(layer);
        diagram.classify();
        diagram.printDiagram();
        System.out.println("~------------------------------------------~");
        System.out.println("Removing duplicate : ");
        layer.removeDuplicate();
        layer.printLayer();

        System.out.println("~------------------------------------------~");
        System.out.println("Removing Triangle : ") ;
        layer.removeTriangle();
        layer.printLayer();
        System.out.println("~------------------------------------------~");
        System.out.println("Removing Circle: ");
        layer.removeCircle();
        layer.printLayer();
        System.out.println("~------------------------------------------~");



    }
}