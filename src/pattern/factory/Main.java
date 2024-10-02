package pattern.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        String shapeType = "rectangle";
        Shape shape = shapeFactory.getShape(shapeType);
        shape.draw();
    }
}
