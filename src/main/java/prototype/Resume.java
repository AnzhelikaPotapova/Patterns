package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Резюме, которое можно клонировать.
 */
public class Resume implements Cloneable {
    private static int constructorCallCount = 0;

    private String name;
    private String position;
    private List<String> skills;

    /**
     * Создает резюме.
     * В конструкторе специально имитируется дорогая операция.
     *
     * @param name     имя кандидата
     * @param position позиция кандидата
     * @param skills   список навыков
     */
    public Resume(String name, String position, List<String> skills) {
        simulateExpensiveOperation();

        this.name = name;
        this.position = position;
        this.skills = new ArrayList<>(skills);

        constructorCallCount++;
    }

    /**
     * Создает глубокую копию резюме.
     * Список навыков копируется отдельно, чтобы клон не зависел от оригинала.
     *
     * @return копия резюме
     */
    @Override
    public Resume clone() {
        try {
            Resume copy = (Resume) super.clone();
            copy.skills = new ArrayList<>(this.skills);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }

    /**
     * Возвращает количество вызовов конструктора.
     *
     * @return количество вызовов конструктора
     */
    public static int getConstructorCallCount() {
        return constructorCallCount;
    }

    /**
     * Сбрасывает счетчик вызовов конструктора.
     * Используется в тестах.
     */
    public static void resetConstructorCallCount() {
        constructorCallCount = 0;
    }

    /**
     * Возвращает имя кандидата.
     *
     * @return имя кандидата
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя кандидата.
     *
     * @param name имя кандидата
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает позицию кандидата.
     *
     * @return позиция кандидата
     */
    public String getPosition() {
        return position;
    }

    /**
     * Устанавливает позицию кандидата.
     *
     * @param position позиция кандидата
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Возвращает список навыков.
     *
     * @return список навыков
     */
    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", skills=" + skills +
                '}';
    }

    private void simulateExpensiveOperation() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Операция была прервана", e);
        }
    }
}