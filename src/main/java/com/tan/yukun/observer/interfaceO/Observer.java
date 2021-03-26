package com.tan.yukun.observer.interfaceO;

/**
 * @author tan_y
 */
public interface Observer {
    /**
     * 更新订阅信息
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);

}
