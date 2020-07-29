
import java.awt.Color;
import java.awt.Shape;

/*
    participant: Product
*/
public class Bomb {
    
    private Shape shape;
    private Color color;
    private String strategy;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
    
    @Override
    public String toString() {
        return "Bomb["+shape+", "+color+", "+strategy+"]";
    }
    
}
