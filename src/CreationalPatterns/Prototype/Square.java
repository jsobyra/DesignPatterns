package CreationalPatterns.Prototype;

/**
 * Created by KUBA on 2016-07-13.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method");
    }
}
