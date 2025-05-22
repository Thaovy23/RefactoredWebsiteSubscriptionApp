
package com.example.subscription.model;

import com.example.subscription.notification.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Website implements Subject {
    private String url;
    private LocalDateTime lastChecked;
    private List<Observer> observers;

    public Website(String url) {
        this.url = url;
        this.lastChecked = LocalDateTime.now();
        this.observers = new ArrayList<>();
    }

    public boolean checkForUpdate() {
        System.out.println("Checking for updates at " + url);
        this.lastChecked = LocalDateTime.now();
        Notification notification = new Notification("Update found at " + url + "!");
        notifyObservers(notification);
        return true;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for (Observer o : observers) {
            o.update(notification);
        }
    }

    public String getUrl() {
        return url;
    }
}
