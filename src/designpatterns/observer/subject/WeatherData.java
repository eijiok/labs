package designpatterns.observer.subject;

import designpatterns.observer.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {
    private Set<Observer> observerSet;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        observerSet = new HashSet<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update(this);
        }
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

}
