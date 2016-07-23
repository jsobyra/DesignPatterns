package CreationalPatterns.Builder;

/**
 * Created by KUBA on 2016-07-12.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
