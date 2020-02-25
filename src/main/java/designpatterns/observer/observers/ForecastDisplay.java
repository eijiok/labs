package designpatterns.observer.observers;

import designpatterns.observer.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElementDisplay {

    private int temperature;


    public ForecastDisplay(WeatherData weatherData) {

    }

    @Override
    public void display() { // display the forecast
        String mensagem;
        if (temperature < 10)
            mensagem = "Frio pra cacete";
        else if (temperature < 18)
            mensagem = "Friozinho, pegue um blusa";
        else if (temperature < 29)
            mensagem = "Tempo bom";
        else
            mensagem = "Tá fervendo!";
        mensagem += " " + temperature + " graus C";
        System.out.println(mensagem);
    }

    @Override
    public void update(WeatherData weatherData) {
        this.temperature = weatherData.getTemperature();
        display();
    }
}
