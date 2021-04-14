package classes;

import interfaces.DisplayElement;
import interfaces.Observer;


/**
 * @author wtq
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("气压正在回升");
        } else if (currentPressure == lastPressure) {
            System.out.println("气压没啥变化");
        } else if (currentPressure < lastPressure) {
            System.out.println("气压正在下降");
        }
    }
}
