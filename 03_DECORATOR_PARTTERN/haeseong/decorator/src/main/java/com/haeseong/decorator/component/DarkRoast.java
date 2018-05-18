package com.haeseong.decorator.component;

import com.haeseong.decorator.MenuType;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = MenuType.DARK_ROAST.getName();
    }

    public double getCost() {
        return MenuType.DARK_ROAST.getCost();
    }
}
