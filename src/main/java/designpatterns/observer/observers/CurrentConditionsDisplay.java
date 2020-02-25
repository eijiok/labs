package designpatterns.observer.observers;

import designpatterns.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElementDisplay {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {

    }

    @Override
    public void display() { // display current measurements
        System.out.println("Current conditions: " + temperature+ "C degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(WeatherData weatherData) {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
