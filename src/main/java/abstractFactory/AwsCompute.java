package abstractFactory;

/**
 * Вычислительный узел AWS.
 */
public class AwsCompute implements ComputeInstance {

    @Override
    public void start() {
        System.out.println("[AWS] Запущен EC2 instance");
    }
}