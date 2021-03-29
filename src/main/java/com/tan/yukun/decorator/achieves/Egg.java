package com.tan.yukun.decorator.achieves;

import com.tan.yukun.decorator.interfaces.ChineseFood;
import com.tan.yukun.decorator.interfaces.Condiment;

import java.math.BigDecimal;

public class Egg extends Condiment {
    ChineseFood chineseFood;

    public Egg(ChineseFood chineseFood) {
        this.chineseFood = chineseFood;
    }

    @Override
    public BigDecimal cost() {
        return chineseFood.cost().add(new BigDecimal("0.95"));
    }

    @Override
    public String getDescription() {
        return chineseFood.getDescription() + ", 鸡蛋";
    }
}
