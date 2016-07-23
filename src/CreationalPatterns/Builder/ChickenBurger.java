package CreationalPatterns.Builder;

/**
 * Created by KUBA on 2016-07-12.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price(){
        return 50.5f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }
}
