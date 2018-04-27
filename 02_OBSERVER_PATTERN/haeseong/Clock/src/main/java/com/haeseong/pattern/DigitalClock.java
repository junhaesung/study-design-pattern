package com.haeseong.pattern;

public class DigitalClock implements Widget, Observer {
    private ClockTimer subject;

    public DigitalClock(ClockTimer clockTimer) {
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
        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }
}
