package Duck;

import Behavior.FlyNoWay;
import Behavior.MuteQuack;

public class DecoyDuck extends Duck{


    public DecoyDuck() {
        super(new FlyNoWay(),new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("外观是诱饵鸭");
    }
}
