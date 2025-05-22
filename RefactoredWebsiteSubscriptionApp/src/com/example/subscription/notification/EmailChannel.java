
package com.example.subscription.notification;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[Mock] Sending Email: " + message);
    }
}
