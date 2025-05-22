
package com.example.subscription.notification;

public class SMSChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[Mock] Sending SMS: " + message);
    }
}
