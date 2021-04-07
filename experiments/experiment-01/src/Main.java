import Duck.*;

public class Main {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
