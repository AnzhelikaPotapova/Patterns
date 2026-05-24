package abstractFactory;

/**
 * Абстракция файлового хранилища.
 */
public interface BlobStorage {

    /**
     * Сохраняет файл в хранилище.
     *
     * @param name имя файла
     */
    void save(String name);
}