public class ShapeFactory {
    public Shape getShape(String type){
        if (type.equals("Rectangle")){
            return new Rectangle();
        } else if (type.equals("Square")){
            return new Square();
        } else {
            return new Circle();
        }
    }
}
