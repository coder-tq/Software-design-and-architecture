package beverage;

/**
 * @author coder_tq
 * @Date 2021/4/21 8:04
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 获取饮料的价格
     * @return 饮料的价格
     */
    public abstract double cost();
}
