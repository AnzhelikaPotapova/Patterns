package factoryMethod;

/**
 * Абстрактный отправитель уведомлений.
 * Использует фабричный метод для создания конкретного уведомления.
 */
public abstract class Notifier {

    /**
     * Фабричный метод.
     *
     * @return конкретный объект уведомления
     */
    protected abstract Notification createNotification();

    /**
     * Отправляет уведомление пользователю.
     *
     * @param text текст уведомления
     */
    public void notifyUser(String text) {
        Notification notification = createNotification();
        notification.send(text);
    }
}