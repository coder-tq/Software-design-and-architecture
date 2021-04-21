package beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:05
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 23;
    }
}
