package CreationalPatterns.Builder;

/**
 * Created by KUBA on 2016-07-12.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price(){
        return 35.0f;
    }

    @Override
    public String name(){
        return "Pepsi";
    }
}
