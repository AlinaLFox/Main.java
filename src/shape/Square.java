package shape;

public class Square extends Shape {
    public String render() {
        return "Square";
    }

    public Colour colour;

    public Colour getColour() {
        return colour.RED;
    }
}
