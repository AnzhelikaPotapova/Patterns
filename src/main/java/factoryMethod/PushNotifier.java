package factoryMethod;

/**
 * Отправитель push-уведомлений.
 */
public class PushNotifier extends Notifier {

    @Override
    protected Notification createNotification() {
        return new PushNotification();
    }
}