package com.haeseong.decorator.component;

import com.haeseong.decorator.MenuType;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = MenuType.HOUSE_BLEND.getName();
    }

    public double getCost() {
        return MenuType.HOUSE_BLEND.getCost();
    }
}
