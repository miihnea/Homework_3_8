public class ShapeMaker {
    private Shape shape;

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            shape = new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SPHERE")){
            shape = new Sphere();
        }else if (shapeType.equalsIgnoreCase("TRIANGLE")){
            shape = new Triangle();
        }
        return  shape;
    }
}
