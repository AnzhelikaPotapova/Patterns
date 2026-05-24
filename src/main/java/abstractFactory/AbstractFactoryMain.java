package abstractFactory;

/**
 * Демонстрация паттерна Abstract Factory.
 */
public class AbstractFactoryMain {

    /**
     * Точка входа.
     *
     * @param args первый аргумент: aws или azure
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите провайдера: aws или azure");
            return;
        }

        CloudFactory factory = createFactory(args[0]);
        DeploymentManager deploymentManager = new DeploymentManager(factory);
        deploymentManager.deploy();
    }

    private static CloudFactory createFactory(String provider) {
        return switch (provider.toLowerCase()) {
            case "aws" -> new AwsFactory();
            case "azure" -> new AzureFactory();
            default -> throw new IllegalArgumentException("Неизвестный провайдер: " + provider);
        };
    }
}