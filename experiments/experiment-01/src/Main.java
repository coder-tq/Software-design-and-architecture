import Behavior.FlyBehavior.FlyWithRocket;
import Duck.DecoyDuck;
import Duck.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyWithRocket());
        duck.performFly();
    }
}
