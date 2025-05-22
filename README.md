
# RefactoredWebsiteSubscriptionApp

This Java application implements the **Observer Design Pattern** for monitoring website updates and notifying users through various notification channels (Email, SMS, Push).

---

## 📁 Project Structure

```
src/
└── com/example/subscription/
    ├── Main.java
    ├── model/
    │   ├── User.java
    │   ├── Website.java
    │   ├── Subscription.java
    │   └── Preference.java
    └── notification/
        ├── Notification.java
        ├── NotificationChannel.java
        ├── EmailChannel.java
        ├── SMSChannel.java
        ├── PushChannel.java
        ├── Observer.java
        └── Subject.java
```

---

## ▶️ How to Compile and Run (on Windows)

### 1. Open PowerShell or CMD

Navigate into the `src` folder of your project:
```sh
cd RefactoredWebsiteSubscriptionApp\src
```

### 2. Compile all Java files:
```sh
javac com/example/subscription/model/*.java com/example/subscription/notification/*.java com/example/subscription/Main.java
```

### 3. Run the Main class:
```sh
java com.example.subscription.Main
```

---

## ✅ Expected Output

```
User student@fh-frankfurt.de registered to website: https://example.com
Checking for updates at https://example.com
Sending update to user student@fh-frankfurt.de
[Mock] Sending Email: Update found at https://example.com!
```

---

## 📌 Notes
- Make sure you have Java installed and `javac`/`java` are available in your terminal.
- This is a simple demo using mock outputs (not real email/SMS sending).
