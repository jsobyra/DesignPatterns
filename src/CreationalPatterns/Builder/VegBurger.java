package CreationalPatterns.Builder;

/**
 * Created by KUBA on 2016-07-12.
 */
public class VegBurger extends Burger {

    @Override
    public float price(){
        return 25.0f;
    }

    @Override
    public String name(){
        return "Veg Burger";
    }
}
