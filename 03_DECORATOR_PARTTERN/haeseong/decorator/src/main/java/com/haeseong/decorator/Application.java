package com.haeseong.decorator;

import com.haeseong.decorator.component.*;
import com.haeseong.decorator.decorator.Mocha;
import com.haeseong.decorator.decorator.Soy;
import com.haeseong.decorator.decorator.SteamMilk;
import com.haeseong.decorator.decorator.Whip;

public class Application {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        print(beverage1);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        print(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        print(beverage3);

        Beverage beverage4 = new Decaffeinated();
        beverage4 = new SteamMilk(beverage4);
        print(beverage4);
    }

    private static void print(Beverage beverage) {
        System.out.format("%s $%.2f%n", beverage.getDescription(), beverage.getCost());
    }
}
