package interfaces;

/**
 * @author wtq
 */
public interface Observer {
    /**
     * 更新天气数值信息
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    void update(float temperature, float humidity, float pressure);
}
