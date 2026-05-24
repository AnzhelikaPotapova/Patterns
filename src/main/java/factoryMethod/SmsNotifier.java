package factoryMethod;

/**
 * Отправитель SMS-уведомлений.
 */
public class SmsNotifier extends Notifier {

    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
}