package com.haeseong.pattern;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        // Subject
        ClockTimer clockTimer = new ClockTimer();
        // Observer
        DigitalClock digitalClock = new DigitalClock(clockTimer);
        KoreanClock koreanClock = new KoreanClock(clockTimer);

        // timer
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            clockTimer.tick();
        }
    }
}
