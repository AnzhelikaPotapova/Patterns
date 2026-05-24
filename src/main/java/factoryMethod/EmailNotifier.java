package factoryMethod;

/**
 * Отправитель email-уведомлений.
 */
public class EmailNotifier extends Notifier {

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}