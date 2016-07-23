package CreationalPatterns.Prototype;

/**
 * Created by KUBA on 2016-07-13.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method");
    }
}
