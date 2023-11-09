package TaskTwo;

import org.junit.jupiter.api.Test;

import static TaskTwo.TaskTwo.numberInInterval;
import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {
    // 1. Тест с числом, которое попадает в интервал (26)

    @Test
    public void testNumberInInterval_NumberInInterval_ReturnsTrue() {
        boolean result = numberInInterval(26);
        assertTrue(result);
    }

    // 2. Тест с числом, которое не попадает в интервал (25)

    @Test
    public void testNumberInInterval_NumberBelowInterval_ReturnsFalse() {
        boolean result = numberInInterval(25);
        assertFalse(result);
    }

    // 3. Тест с числом, которое не попадает в интервал (100)

    @Test
    public void testNumberInInterval_NumberAboveInterval_ReturnsFalse() {
        boolean result = numberInInterval(100);
        assertFalse(result);
    }

    // 4. Тест с числом, которое меньше интервала

    @Test
    public void testNumberInInterval_NumberBelowRange_ReturnsFalse() {
        boolean result = numberInInterval(10);
        assertFalse(result);
    }

    // 5. Тест с числом, которое больше интервала

    @Test
    public void testNumberInInterval_NumberAboveRange_ReturnsFalse() {
        boolean result = numberInInterval(200);
        assertFalse(result);
    }
    /**
     * Повторяющиеся тесты (но с другим смыслом).
     */
    // 6. Тест с числом, которое равно нижней границе интервала

//    @Test
//    public void testNumberInInterval_NumberEqualsLowerBound_ReturnsFalse() {
//        boolean result = numberInInterval(25);
//        assertFalse(result);
//    }

    // 7. Тест с числом, которое равно верхней границе интервала

//    @Test
//    public void testNumberInInterval_NumberEqualsUpperBound_ReturnsFalse() {
//        boolean result = numberInInterval(100);
//        assertFalse(result);
//    }
}