public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        Shape shape1 = shapeMaker.getShape("Sphere");
        Shape shape2 = shapeMaker.getShape("Rectangle");
        Shape shape3 = shapeMaker.getShape("Triangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
