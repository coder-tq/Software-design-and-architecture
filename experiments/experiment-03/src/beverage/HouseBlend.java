package beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:05
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 25;
    }
}
