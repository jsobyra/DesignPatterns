package CreationalPatterns.AbstractFactory;

/**
 * Created by KUBA on 2016-07-12.
 */
public class Green implements Color{

    @Override
    public void fill(){
        System.out.println("Inside Green::fill() method");
    }
}
