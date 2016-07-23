package StructuralPatterns.Bridge;

/**
 * Created by KUBA on 2016-07-14.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " +  y + "]");
    }
}
