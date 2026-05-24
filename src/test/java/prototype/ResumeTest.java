package prototype;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Тесты для паттерна Prototype.
 */
class ResumeTest {

    @Test
    void constructorShouldBeCalledOnlyOnceWhenResumeIsCloned() {
        Resume.resetConstructorCallCount();

        Resume baseResume = new Resume(
                "Template",
                "Senior Java Developer",
                List.of("Java", "Spring", "SQL")
        );

        Resume firstClone = baseResume.clone();
        Resume secondClone = baseResume.clone();
        Resume thirdClone = baseResume.clone();

        firstClone.setName("Ivan");
        secondClone.setName("Petr");
        thirdClone.setName("Anna");

        assertEquals(1, Resume.getConstructorCallCount());
    }

    @Test
    void cloneShouldHaveIndependentSkillsList() {
        Resume.resetConstructorCallCount();

        Resume baseResume = new Resume(
                "Template",
                "Senior Java Developer",
                List.of("Java", "Spring")
        );

        Resume clonedResume = baseResume.clone();
        clonedResume.getSkills().add("Docker");

        assertNotSame(baseResume.getSkills(), clonedResume.getSkills());
        assertEquals(2, baseResume.getSkills().size());
        assertEquals(3, clonedResume.getSkills().size());
    }
}