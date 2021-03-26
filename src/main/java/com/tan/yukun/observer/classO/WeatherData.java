package com.tan.yukun.observer.classO;

import java.util.Observable;

/**
 * @author tan_y
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() { }

    public void measurementsChanged() {
        super.setChanged();
        super.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
