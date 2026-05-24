package singleton;

import java.util.UUID;

/**
 * Единый пул соединений к базе данных.
 * Реализован через Holder для ленивой и потокобезопасной инициализации.
 */
public class ConnectionPool {

    private ConnectionPool() {
    }

    /**
     * Возвращает единственный экземпляр пула.
     *
     * @return экземпляр ConnectionPool
     */
    public static ConnectionPool get() {
        return Holder.INSTANCE;
    }

    /**
     * Возвращает заглушку соединения.
     *
     * @return строковый идентификатор соединения
     */
    public String getConnection() {
        return "conn-" + UUID.randomUUID();
    }

    private static class Holder {
        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }
}