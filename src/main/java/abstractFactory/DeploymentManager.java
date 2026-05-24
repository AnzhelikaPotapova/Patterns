package abstractFactory;

/**
 * Клиентский класс, который разворачивает инфраструктуру.
 * Не зависит от конкретного облачного провайдера.
 */
public class DeploymentManager {
    private final ComputeInstance computeInstance;
    private final BlobStorage blobStorage;

    /**
     * Создает менеджер развертывания.
     *
     * @param cloudFactory фабрика облачных сервисов
     */
    public DeploymentManager(CloudFactory cloudFactory) {
        this.computeInstance = cloudFactory.createCompute();
        this.blobStorage = cloudFactory.createStorage();
    }

    /**
     * Разворачивает вычислительный узел и сохраняет файл.
     */
    public void deploy() {
        computeInstance.start();
        blobStorage.save("app-config.json");
    }
}