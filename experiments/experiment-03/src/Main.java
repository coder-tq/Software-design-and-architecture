import Decorator.Mocha;
import Decorator.Soy;
import Decorator.Whip;
import beverage.Beverage;
import beverage.DarkRoast;
import beverage.Espresso;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:41
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Whip(new Mocha(new Mocha(beverage1)));
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Whip(new Mocha(new Soy(beverage2)));
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
