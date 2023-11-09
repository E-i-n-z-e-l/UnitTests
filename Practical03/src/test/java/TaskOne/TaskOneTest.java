package TaskOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {
    @Test
    public void testEvenNumber() {
        TaskOne taskOne = new TaskOne();
        assertTrue(taskOne.evenOddNumber(4)); // Проверяем, что метод возвращает true для четного числа
    }

    @Test
    public void testOddNumber() {
        TaskOne taskOne = new TaskOne();
        assertFalse(taskOne.evenOddNumber(3)); // Проверяем, что метод возвращает false для нечетного числа
    }
}