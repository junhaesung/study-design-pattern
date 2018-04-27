package com.haeseong.pattern;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    List<Observer> observers = new ArrayList<>();

    default void attach(Observer observer) {
        observers.add(observer);
    }
    default void detach(Observer observer) {
        observers.remove(observer);
    }

    default void noti() {
        observers.forEach(o -> o.update(this));
    }
}
