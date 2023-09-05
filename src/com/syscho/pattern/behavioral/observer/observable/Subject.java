package com.syscho.pattern.behavioral.observer.observable;

import com.syscho.pattern.behavioral.observer.observer.Observer;

public interface Subject {

    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);

    void notifySubscribers();

}
