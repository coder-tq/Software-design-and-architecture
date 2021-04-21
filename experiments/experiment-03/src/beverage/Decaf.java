package beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:05
 */
public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 18;
    }
}
