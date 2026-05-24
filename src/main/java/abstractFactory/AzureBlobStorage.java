package abstractFactory;

/**
 * Файловое хранилище Azure.
 */
public class AzureBlobStorage implements BlobStorage {

    @Override
    public void save(String name) {
        System.out.println("[AZURE] Файл сохранен в Blob Storage: " + name);
    }
}