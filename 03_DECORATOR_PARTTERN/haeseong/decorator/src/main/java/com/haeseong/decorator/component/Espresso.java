package com.haeseong.decorator.component;

import com.haeseong.decorator.MenuType;

public class Espresso extends Beverage {

    public Espresso() {
        description = MenuType.ESPRESSO.getName();
    }

    public double getCost() {
        return MenuType.ESPRESSO.getCost();
    }
}
