package Decorator;


import beverage.Beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:29
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.99;
    }
}
