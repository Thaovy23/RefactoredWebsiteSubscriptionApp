
package com.example.subscription.notification;

import java.time.LocalDateTime;

public class Notification {
    private String message;
    private LocalDateTime timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public void send(NotificationChannel channel) {
        channel.send(message);
    }
}
