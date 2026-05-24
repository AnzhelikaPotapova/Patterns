package singleton;

/**
 * Демонстрация паттерна Singleton.
 */
public class SingletonMain {

    /**
     * Точка входа.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        OrderDao orderDao = new OrderDao();

        userDao.findUser();
        orderDao.findOrder();
    }
}