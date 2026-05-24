package factoryMethod;

/**
 * Push-уведомление.
 */
public class PushNotification implements Notification {

    @Override
    public void send(String text) {
        System.out.println("[PUSH] " + text);
    }
}