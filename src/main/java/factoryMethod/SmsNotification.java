package factoryMethod;

/**
 * SMS-уведомление.
 */
public class SmsNotification implements Notification {

    @Override
    public void send(String text) {
        System.out.println("[SMS] " + text);
    }
}