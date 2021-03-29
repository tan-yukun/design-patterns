package com.tan.yukun.decorator.achieves;

import com.tan.yukun.decorator.interfaces.ChineseFood;
import com.tan.yukun.decorator.interfaces.SideDishes;

import java.math.BigDecimal;

public class Sauce extends SideDishes {
    ChineseFood chineseFood;

    public Sauce(ChineseFood chineseFood) {
        this.chineseFood = chineseFood;
    }

    @Override
    public BigDecimal cost() {
        return chineseFood.cost().add(new BigDecimal("0.83"));
    }

    @Override
    public String getDescription() {
        return chineseFood.getDescription() + ", 甜面酱";
    }
}
