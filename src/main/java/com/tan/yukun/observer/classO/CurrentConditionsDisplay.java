package com.tan.yukun.observer.classO;

import com.tan.yukun.observer.interfaceO.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author tan_y
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Observable observable;

    public  CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.temp = weatherData.getTemp();
            display();
        }

    }
}
