package com.syscho.pattern.behavioral.observer;

import com.syscho.pattern.behavioral.observer.observable.NewsLetter;
import com.syscho.pattern.behavioral.observer.observer.EmailObserver;
import com.syscho.pattern.behavioral.observer.observer.Observer;
import com.syscho.pattern.behavioral.observer.observer.SmsObserver;
//https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/
public class Client {
    public static void main(String[] args) {

        NewsLetter subject = new NewsLetter("Daily Newz");

        Observer subscriber1 = new EmailObserver("Praveen");
        Observer subscriber2 = new EmailObserver("Soni");
        Observer subscriber3 = new SmsObserver("Ravan");

        subject.addSubscriber(subscriber1);
        subject.addSubscriber(subscriber2);
        subject.addSubscriber(subscriber3);

        subject.addNewEmail("Ready for GEAR 5 on Aug-6");

        subject.addSubscriber(subscriber3);

        subject.addNewEmail("One Piece");
    }
}
