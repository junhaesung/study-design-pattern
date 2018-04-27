package com.haeseong.pattern;

import java.util.HashMap;
import java.util.Map;

public class KoreanClock implements Widget, Observer {
    private ClockTimer subject;
    private static final Map<Integer, String> hourMap = new HashMap<>();
    private static final Map<Integer, String> tensMap = new HashMap<>();
    private static final Map<Integer, String> unitsMap = new HashMap<>();
    static {
        hourMap.put(1, "한");
        hourMap.put(2, "두");
        hourMap.put(3, "세");
        hourMap.put(4, "네");
        hourMap.put(5, "다섯");
        hourMap.put(6, "여섯");
        hourMap.put(7, "일곱");
        hourMap.put(8, "여덟");
        hourMap.put(9, "아홉");
        hourMap.put(10, "열");
        hourMap.put(11, "열한");
        hourMap.put(0, "열두");

        tensMap.put(0, "");
        tensMap.put(1, "십");
        tensMap.put(2, "이십");
        tensMap.put(3, "삼십");
        tensMap.put(4, "사십");
        tensMap.put(5, "오십");

        unitsMap.put(1, "일");
        unitsMap.put(2, "이");
        unitsMap.put(3, "삼");
        unitsMap.put(4, "사");
        unitsMap.put(5, "오");
        unitsMap.put(6, "육");
        unitsMap.put(7, "칠");
        unitsMap.put(8, "팔");
        unitsMap.put(9, "구");
        unitsMap.put(0, "");
    }

    public KoreanClock(ClockTimer clockTimer) {
        this.subject = clockTimer;
        this.subject.attach(this);
    }

    @Override
    public void update(Subject changedSubject) {
        if (changedSubject == subject) {
            draw();
        }
    }

    @Override
    public void draw() {
        // 주체에서 새로운 값을 얻습니다.
        int hour = subject.getHour();
        int minute = subject.getMinute();
        int second = subject.getSecond();

        // 디지털 시간을 표현합니다.
        System.out.println(String.format("%s시 %s분 %s초",
                convertHourToKorean(hour),
                convertToKorean(minute),
                convertToKorean(second)));
    }

    private String convertHourToKorean(int hour) {
        return hourMap.getOrDefault(hour % 12, "");
    }

    private String convertToKorean(int number) {
        return tensMap.getOrDefault(number / 10, "") + unitsMap.getOrDefault(number % 10, "");
    }
}
