package com.tan.yukun.decorator.achieves;

/**
 * @author tan_y
 */
public abstract class ChineseFood {

    String description = "中国菜";

    public String getDescription() {
        return description;
    }

    /**
     * 食物价格
     * @return
     */
    public abstract double cost();
}
