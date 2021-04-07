package Duck;

import Behavior.FlyBehavior.FlyWithWings;
import Behavior.QuackBehavior.Quack;

//绿头鸭
public class MallarDuck extends Duck {
    public MallarDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
