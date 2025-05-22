
package com.example.subscription.model;

import com.example.subscription.notification.NotificationChannel;

public class Preference {
    private int frequency;
    private NotificationChannel channel;

    public Preference(int frequency, NotificationChannel channel) {
        this.frequency = frequency;
        this.channel = channel;
    }

    public int getFrequency() {
        return frequency;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }
}
