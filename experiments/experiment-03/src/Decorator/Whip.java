package Decorator;

import beverage.Beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:30
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+3.99;
    }
}
