package Decorator;

import beverage.Beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:24
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 获取装饰者中的描述
     * @return 返回装饰着的描述
     */
    @Override
    public abstract String getDescription();
}
