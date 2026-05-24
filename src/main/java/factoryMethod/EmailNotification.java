package factoryMethod;

/**
 * Уведомление по электронной почте.
 */
public class EmailNotification implements Notification {

    @Override
    public void send(String text) {
        System.out.println("[EMAIL] " + text);
    }
}