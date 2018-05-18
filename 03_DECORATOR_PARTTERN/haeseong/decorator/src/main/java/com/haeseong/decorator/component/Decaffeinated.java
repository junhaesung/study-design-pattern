package com.haeseong.decorator.component;

import com.haeseong.decorator.MenuType;

public class Decaffeinated extends Beverage {

    public Decaffeinated() {
        description = MenuType.DECAFFEINATED.getName();
    }

    public double getCost() {
        return MenuType.DECAFFEINATED.getCost();
    }
}
