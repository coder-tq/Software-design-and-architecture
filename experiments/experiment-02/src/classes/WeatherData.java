package classes;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

/**
 * @author wtq
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 注册观察者
     * @param o 新的观察者
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     * @param o 要被移除的观察者
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        Observer observer;
        for (int i = 0; i < observers.size(); i++) {
            observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
