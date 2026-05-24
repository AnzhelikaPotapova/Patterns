package factoryMethod;

/**
 * Демонстрация паттерна Factory Method.
 */
public class FactoryMethodMain {

    /**
     * Точка входа.
     *
     * @param args первый аргумент: email, sms или push
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите тип уведомления: email, sms или push");
            return;
        }

        Notifier notifier = createNotifier(args[0]);
        notifier.notifyUser("Hello!");
    }

    private static Notifier createNotifier(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotifier();
            case "sms" -> new SmsNotifier();
            case "push" -> new PushNotifier();
            default -> throw new IllegalArgumentException("Неизвестный тип уведомления: " + type);
        };
    }
}