package beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:05
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 15;
    }
}
