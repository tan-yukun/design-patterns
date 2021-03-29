package com.tan.yukun.decorator.achieves;

import com.tan.yukun.decorator.interfaces.ChineseFood;

import java.math.BigDecimal;

/**
 * @author tan_y
 */
public class ChineseSaviorCrepe extends ChineseFood {
    public ChineseSaviorCrepe() {
        description = "煎饼果子";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("4.32");
    }
}
