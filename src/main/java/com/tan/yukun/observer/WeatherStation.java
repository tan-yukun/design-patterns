package com.tan.yukun.observer;

import com.tan.yukun.observer.achieves.CurrentConditionsDisplay;
import com.tan.yukun.observer.achieves.WeatherData;

/**
 * @author tan_y
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.display();
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
