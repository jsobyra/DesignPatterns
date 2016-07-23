package CreationalPatterns.Prototype;

/**
 * Created by KUBA on 2016-07-13.
 */
public class PrototypeMain {

    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}