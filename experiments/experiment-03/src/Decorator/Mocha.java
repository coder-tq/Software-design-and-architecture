package Decorator;

import beverage.Beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:30
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+1.99;
    }
}
