import java.util.ArrayList;
import java.util.Iterator;

public class Layer {
    private ArrayList<Shape> layer;

    boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    private  boolean isVisible;

    public Layer() {
        this.layer = new ArrayList<>();
        this.isVisible=true;

    }
    public Layer(ArrayList<Shape> layer) {
        this();
        this.layer = layer;
    }
    public Layer(boolean visible) {
        this();
        this.isVisible = false;
    }

    public Layer(ArrayList<Shape> layer, boolean visible) {
        this(layer);
        this.isVisible = visible;
    }

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }
  public  void add(Shape shape)
  {
      layer.add(shape);
  }
    public void removeTriangle() {
        layer.removeIf(shape -> shape instanceof Triangle);
    }

    public void removeCircle() {
        layer.removeIf(shape -> shape instanceof Circle);
    }
   public  void removeDuplicate ()
   {

       for (int i = 0; i < layer.size(); i++) {

           for (int j = i + 1; j < layer.size(); j++) {
               if (layer.get(i).equals(layer.get(j))) {
                   layer.remove(j);
               }
           }
       }

   }
   public void printLayer() {

        for (Shape shape : layer) System.out.println(shape.toString());
    }


}