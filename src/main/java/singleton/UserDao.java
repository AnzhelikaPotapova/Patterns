package singleton;

/**
 * DAO-класс для работы с пользователями.
 */
public class UserDao {

    /**
     * Имитирует получение пользователя из базы данных.
     */
    public void findUser() {
        ConnectionPool pool = ConnectionPool.get();

        System.out.println("UserDao pool hash: " + System.identityHashCode(pool));
        System.out.println("UserDao connection: " + pool.getConnection());
    }
}