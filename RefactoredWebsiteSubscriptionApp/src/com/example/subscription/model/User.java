
package com.example.subscription.model;

public class User {
    private String email;

    public User(String email) {
        this.email = email;
    }

    public void register(Website website, Preference preference) {
        new Subscription(this, website, preference);
        System.out.println("User " + email + " registered to website: " + website.getUrl());
    }

    public void modify() {
        System.out.println("Modifying user " + email);
    }

    public boolean cancel() {
        System.out.println("Cancelling subscription for user " + email);
        return true;
    }

    public String getEmail() {
        return email;
    }
}
