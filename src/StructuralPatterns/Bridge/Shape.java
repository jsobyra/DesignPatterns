package StructuralPatterns.Bridge;

/**
 * Created by KUBA on 2016-07-14.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
