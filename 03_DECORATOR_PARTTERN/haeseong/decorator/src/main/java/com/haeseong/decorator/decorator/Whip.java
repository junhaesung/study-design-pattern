package com.haeseong.decorator.decorator;

import com.haeseong.decorator.MenuType;
import com.haeseong.decorator.component.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + MenuType.WHIP.getName();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + MenuType.WHIP.getCost();
    }
}
