package Behavior;

//不能飞
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞不起来");
    }
}
