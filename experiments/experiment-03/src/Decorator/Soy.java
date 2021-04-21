package Decorator;

import beverage.Beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:30
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+2.99;
    }
}
