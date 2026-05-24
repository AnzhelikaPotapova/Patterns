package abstractFactory;

/**
 * Абстрактная фабрика облачной инфраструктуры.
 */
public interface CloudFactory {

    /**
     * Создает вычислительный узел.
     *
     * @return вычислительный узел
     */
    ComputeInstance createCompute();

    /**
     * Создает файловое хранилище.
     *
     * @return файловое хранилище
     */
    BlobStorage createStorage();
}