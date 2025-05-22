
package com.example.subscription.model;

import com.example.subscription.notification.*;

public class Subscription implements Observer {
    private User user;
    private Website website;
    private Preference notificationPreference;

    public Subscription(User user, Website website, Preference preference) {
        this.user = user;
        this.website = website;
        this.notificationPreference = preference;
        website.registerObserver(this);
    }

    public void updatePreference(Preference newPref) {
        this.notificationPreference = newPref;
    }

    public Preference getNotificationPreference() {
        return notificationPreference;
    }

    @Override
    public void update(Notification notification) {
        System.out.println("Sending update to user " + user.getEmail());
        notification.send(notificationPreference.getChannel());
    }
}
