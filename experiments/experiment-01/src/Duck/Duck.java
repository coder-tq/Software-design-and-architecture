package Duck;

import Behavior.FlyBehavior;
import Behavior.QuackBehavior;

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

    public void quack()
    {
        System.out.println("呱呱叫");
    }
    public void swim()
    {
        System.out.println("游泳");
    }
    public abstract void display();
    public void fly(){
        System.out.println("我会飞");
    };
}