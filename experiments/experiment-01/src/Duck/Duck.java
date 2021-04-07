package Duck;

import Behavior.FlyBehavior.FlyBehavior;
import Behavior.QuackBehavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly()
    {
        flyBehavior.fly();
    }
    public void performQuack()
    {
        quackBehavior.quack();
    }
    public void swim()
    {
        System.out.println("游泳");
    }
    public abstract void display();
}
