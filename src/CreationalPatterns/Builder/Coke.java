package CreationalPatterns.Builder;

/**
 * Created by KUBA on 2016-07-12.
 */
public class Coke extends ColdDrink {

    @Override
    public float price(){
        return 30.0f;
    }

    @Override
    public String name(){
        return "Coke";
    }
}
