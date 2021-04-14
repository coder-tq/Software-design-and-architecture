package classes;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

/**
 * @author wtq
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 显示当前观测值
     */
    @Override
    public void display() {
        System.out.println("当前温度:"+temperature+"F 当前湿度: "+humidity+"%");
    }

    /**
     * 更新天气数值信息
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    压力
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
