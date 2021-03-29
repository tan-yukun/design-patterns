package com.tan.yukun.decorator.interfaces;

import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author tan_y
 */
@ToString
public abstract class ChineseFood {

    public String description = "中国菜";

    public String getDescription() {
        return description;
    }

    /**
     * 食物价格
     * @return
     */
    public abstract BigDecimal cost();
}
