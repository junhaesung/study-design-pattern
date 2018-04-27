package com.haeseong.pattern;

import java.time.LocalDateTime;

public class ClockTimer implements Subject {
    private int hour;
    private int minute;
    private int second;

    public ClockTimer() {
        setCurrentTime();
    }

    private void setCurrentTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        hour = currentTime.getHour();
        minute = currentTime.getMinute();
        second = currentTime.getSecond();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        setCurrentTime();
        noti();
    }
}
