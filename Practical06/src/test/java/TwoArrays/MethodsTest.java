package TwoArrays;

import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Test;
import org.junit.Rule;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MethodsTest {
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    void testReceivingArray() throws Exception {
        // Тест для проверки метода ReceivingArray: убедимся, что он правильно заполняет список
        Methods methods = new Methods();
        List<Integer> testList = new ArrayList<>();

        // Подменяем стандартный ввод внутри кода теста
        withTextFromSystemIn("1", "2", "3", "4", "5").execute(() -> {
            methods.ReceivingArray(testList);
            assertEquals(5, testList.size());
        });
    }

    @Test
    void testListSum() {
        // Тест для проверки метода ListSum: убедимся, что он правильно считает сумму элементов списка
        Methods methods = new Methods();
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5);
        int expectedSum = (1 + 2 + 3 + 4 + 5) / 5; // Ожидаемое среднее значение
        assertEquals(expectedSum, methods.ListSum(testList));
    }

    @Test
    void testComparison() {
        // Подготовка тестовых данных
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        // Запуск тестируемого метода
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream, true)); // Захват вывода
        Methods methods = new Methods();
        methods.Comparison(list1, list2);

        // Проверка результатов
        String expectedOutput = "Второй список имеет большее среднее значение\r\n";
        assertEquals(expectedOutput, outputStream.toString()); // Проверка вывода
    }
}