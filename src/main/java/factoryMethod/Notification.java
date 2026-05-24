package factoryMethod;

/**
 * Общий интерфейс уведомления.
 */
public interface Notification {

    /**
     * Отправляет текст уведомления.
     *
     * @param text текст сообщения
     */
    void send(String text);
}