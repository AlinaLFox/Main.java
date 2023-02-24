package shape;

public class Circle  extends Shape {
    public String render() {
        return "Circle";
    }

    public Colour colour;

    public Colour getColour() {
        return colour.VIOLET;
    }
}
