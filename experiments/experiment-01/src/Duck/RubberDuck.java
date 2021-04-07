package Duck;

import Behavior.FlyNoWay;
import Behavior.Squeak;

//橡皮鸭
public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new FlyNoWay(),new Squeak());
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void fly() {
        //Do nothing
    }
}