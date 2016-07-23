package CreationalPatterns.Prototype;

/**
 * Created by KUBA on 2016-07-13.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method");
    }
}
