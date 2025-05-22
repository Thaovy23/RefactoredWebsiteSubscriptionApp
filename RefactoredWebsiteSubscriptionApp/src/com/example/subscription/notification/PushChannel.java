
package com.example.subscription.notification;

public class PushChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[Mock] Sending Push Notification: " + message);
    }
}
