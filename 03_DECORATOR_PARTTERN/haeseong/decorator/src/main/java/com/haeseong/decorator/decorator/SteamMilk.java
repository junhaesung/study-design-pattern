package com.haeseong.decorator.decorator;

import com.haeseong.decorator.MenuType;
import com.haeseong.decorator.component.Beverage;

public class SteamMilk extends CondimentDecorator {
    private Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + MenuType.STEAM_MILK.getName();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + MenuType.STEAM_MILK.getCost();
    }
}
