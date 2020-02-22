package designpatterns.observer.observers;

import designpatterns.observer.subject.WeatherData;

public interface Observer {
    void update(WeatherData weatherData);
}
