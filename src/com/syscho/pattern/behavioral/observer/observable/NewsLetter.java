package com.syscho.pattern.behavioral.observer.observable;

import com.syscho.pattern.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {

    List<Observer> observerList = new ArrayList<>();

    protected String name;
    protected String newEmail;

    public NewsLetter(String name) {
        this.name = name;
    }

    public void addNewEmail(String newEmail) {
        this.newEmail = newEmail;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeSubscriber(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifySubscribers() {
        observerList.forEach(observer -> observer.update(newEmail));

    }
}
