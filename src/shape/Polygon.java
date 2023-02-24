package shape;

public class Polygon extends Shape {
    public String render() {
        return "Polygon";
    }

    public Colour colour;

    public Colour getColour() {
        return colour.ORANGE;
    }
}
