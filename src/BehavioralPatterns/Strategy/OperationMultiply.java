package BehavioralPatterns.Strategy;

/**
 * Created by KUBA on 2016-07-14.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2){
        return num1 * num2;
    }
}
