package com.haeseong.decorator;

public enum MenuType {
    HOUSE_BLEND(0.89, "하우스 블렌드 커피"),
    DARK_ROAST(0.99, "다크 로스트 커피"),
    DECAFFEINATED(1.05, "디카페인"),
    ESPRESSO(1.99, "에스프레소"),
    STEAM_MILK(0.1, "스팀 밀크"),
    MOCHA(0.2, "모카"),
    SOY(0.15, "두유"),
    WHIP(0.1, "휘핑 크림");

    private double cost;
    private String name;

    MenuType(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
