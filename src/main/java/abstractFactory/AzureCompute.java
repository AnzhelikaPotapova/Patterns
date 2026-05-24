package abstractFactory;

/**
 * Вычислительный узел Azure.
 */
public class AzureCompute implements ComputeInstance {

    @Override
    public void start() {
        System.out.println("[AZURE] Запущена виртуальная машина");
    }
}