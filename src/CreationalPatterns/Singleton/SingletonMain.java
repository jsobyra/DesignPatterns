package CreationalPatterns.Singleton;

/**
 * Created by KUBA on 2016-07-13.
 */
public class SingletonMain {

    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
