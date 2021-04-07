package Duck;

import Behavior.FlyBehavior.FlyNoWay;
import Behavior.QuackBehavior.Squeak;

//橡皮鸭
public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new FlyNoWay(),new Squeak());
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }

}
