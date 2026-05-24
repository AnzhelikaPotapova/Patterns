package singleton;

/**
 * DAO-класс для работы с заказами.
 */
public class OrderDao {

    /**
     * Имитирует получение заказа из базы данных.
     */
    public void findOrder() {
        ConnectionPool pool = ConnectionPool.get();

        System.out.println("OrderDao pool hash: " + System.identityHashCode(pool));
        System.out.println("OrderDao connection: " + pool.getConnection());
    }
}