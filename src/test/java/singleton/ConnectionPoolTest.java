package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Тесты для паттерна Singleton.
 */
class ConnectionPoolTest {

    @Test
    void connectionPoolShouldHaveOnlyOneInstance() {
        ConnectionPool firstPool = ConnectionPool.get();
        ConnectionPool secondPool = ConnectionPool.get();

        assertSame(firstPool, secondPool);
    }

    @Test
    void connectionPoolShouldHaveSameIdentityHashCode() {
        ConnectionPool firstPool = ConnectionPool.get();
        ConnectionPool secondPool = ConnectionPool.get();

        assertEquals(
                System.identityHashCode(firstPool),
                System.identityHashCode(secondPool)
        );
    }
}