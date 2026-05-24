package prototype;

import java.util.List;

/**
 * Демонстрация паттерна Prototype.
 */
public class PrototypeMain {

    /**
     * Точка входа.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Resume baseResume = new Resume(
                "Template",
                "Senior Java Developer",
                List.of("Java", "Spring", "SQL", "Docker")
        );

        Resume juniorResume = baseResume.clone();
        juniorResume.setName("Ivan");
        juniorResume.setPosition("Junior Java Developer");

        Resume middleResume = baseResume.clone();
        middleResume.setName("Petr");
        middleResume.setPosition("Middle Java Developer");

        Resume seniorResume = baseResume.clone();
        seniorResume.setName("Anna");
        seniorResume.setPosition("Senior Java Developer");

        System.out.println(juniorResume);
        System.out.println(middleResume);
        System.out.println(seniorResume);

        System.out.println("Конструктор был вызван раз: " + Resume.getConstructorCallCount());
    }
}