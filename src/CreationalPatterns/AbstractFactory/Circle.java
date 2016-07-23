package CreationalPatterns.AbstractFactory;

/**
 * Created by KUBA on 2016-07-12.
 */
public class Circle implements Shape{

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method");
    }
}
