package com.haeseong.decorator.decorator;

import com.haeseong.decorator.MenuType;
import com.haeseong.decorator.component.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + MenuType.SOY.getName();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + MenuType.SOY.getCost();
    }
}
