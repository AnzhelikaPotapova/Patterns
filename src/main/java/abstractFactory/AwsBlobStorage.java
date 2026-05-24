package abstractFactory;

/**
 * Файловое хранилище AWS.
 */
public class AwsBlobStorage implements BlobStorage {

    @Override
    public void save(String name) {
        System.out.println("[AWS] Файл сохранен в S3: " + name);
    }
}