package com.tan.yukun.observer.interfaceO;

/**
 * @author tan_y
 */
public interface Subject {
    /**
     * 注册为订阅者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 取消订阅
     * @param observer
     */
    public void removeObserver(Observer observer);


    /**
     * 通知订阅者
     */
    public void notifyObserver();

}
