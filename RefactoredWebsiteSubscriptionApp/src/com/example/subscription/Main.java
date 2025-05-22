
package com.example.subscription;

import com.example.subscription.model.*;
import com.example.subscription.notification.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("student@fh-frankfurt.de");
        NotificationChannel email = new EmailChannel();
        Preference pref = new Preference(1, email);

        Website website = new Website("https://example.com");
        user.register(website, pref);

        website.checkForUpdate();
    }
}
