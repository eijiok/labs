package designpatterns.observer;

import designpatterns.observer.observers.CurrentConditionsDisplay;
import designpatterns.observer.observers.ForecastDisplay;
import designpatterns.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherData weatherData2 = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData2.registerObserver(currentConditionsDisplay);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.registerObserver(forecastDisplay);

        weatherData.setMeasurements(35, 65, 31);
        weatherData.setMeasurements(8, 40, 31);
        weatherData.setMeasurements(15, 40, 31);
        weatherData.setTemperature(60);

        weatherData2.setMeasurements(43, 46, 31);
    }
}
