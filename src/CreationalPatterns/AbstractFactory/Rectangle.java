package CreationalPatterns.AbstractFactory;

/**
 * Created by KUBA on 2016-07-12.
 */
public class Rectangle implements Shape{

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method");
    }
}
