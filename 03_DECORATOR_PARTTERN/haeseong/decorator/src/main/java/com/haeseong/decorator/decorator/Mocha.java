package com.haeseong.decorator.decorator;

import com.haeseong.decorator.MenuType;
import com.haeseong.decorator.component.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + MenuType.MOCHA.getName();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + MenuType.MOCHA.getCost();
    }
}
