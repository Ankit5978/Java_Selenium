package training;
abstract class Notification {
    abstract void send(String message);
}

class EmailNotification extends Notification {
    void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification extends Notification {
    void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class PushNotification extends Notification {
    void send(String message) {
        System.out.println("Push: " + message);
    }
}


