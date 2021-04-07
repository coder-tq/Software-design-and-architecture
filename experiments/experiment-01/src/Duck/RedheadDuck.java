package Duck;

import Behavior.FlyWithWings;
import Behavior.Quack;

//红头鸭
public class RedheadDuck extends Duck{
    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("外观是红头");
    }
}
