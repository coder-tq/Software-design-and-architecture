package Behavior.QuackBehavior;

// 不会叫
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
