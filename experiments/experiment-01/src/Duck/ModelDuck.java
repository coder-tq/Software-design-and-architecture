package Duck;

import Behavior.FlyBehavior.FlyWithRocket;
import Behavior.QuackBehavior.MuteQuack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        super(new FlyWithRocket(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("外观是模型鸭");
    }
}
