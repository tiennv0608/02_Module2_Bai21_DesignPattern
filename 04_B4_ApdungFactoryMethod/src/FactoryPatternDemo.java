public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape shape1 = shape.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shape.getShape("Square");
        shape2.draw();
        Shape shape3 = shape.getShape("Triangle");
        shape3.draw();
    }
}
