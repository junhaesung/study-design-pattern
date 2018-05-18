package com.haeseong.decorator.decorator;

import com.haeseong.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    public double getCost() {
        return 0;
    }
}
