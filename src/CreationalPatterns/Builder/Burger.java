package CreationalPatterns.Builder;

/**
 * Created by KUBA on 2016-07-12.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
