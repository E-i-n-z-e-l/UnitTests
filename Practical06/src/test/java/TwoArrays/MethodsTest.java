package TwoArrays;

import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.Test;
import org.junit.Rule;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;


import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

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
//    @Test
//    void testReceivingArrayNonIntegerInput() {
//        Methods methods = new Methods();
//        List<Integer> testList = new ArrayList<>();
//        Scanner scannerMock = Mockito.mock(Scanner.class);
//        when(scannerMock.hasNextInt()).thenReturn(false);
//        when(scannerMock.nextLine()).thenReturn(""); // возвращаем пустую строку при вызове метода nextLine()
//
//        try (MockedStatic<System> systemMock = Mockito.mockStatic(System.class)) {
//            systemMock.when(Mockito.any()).thenReturn(scannerMock);
//
//            methods.ReceivingArray(testList);
//            assertEquals(0, testList.size()); // Проверка, что список остался пустым из-за ошибок ввода
//        }
//    }

    @Test
    void testListSum() {
        // Тест для проверки метода ListSum: убедимся, что он правильно считает сумму элементов списка
        Methods methods = new Methods();
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5);
        int expectedSum = (1 + 2 + 3 + 4 + 5) / 5; // Ожидаемое среднее значение
        assertEquals(expectedSum, methods.ListSum(testList));
    }
    @Test
    void testListSumWithEmptyList() {
        // Тест для проверки метода ListSum при работе с пустым списком
        Methods methods = new Methods();
        List<Integer> emptyList = new ArrayList<>();
        assertEquals(0, methods.ListSum(emptyList));
    }
    @Test
    void testListSumWithNegativeNumbers() {
        // Тест для проверки метода ListSum при работе с отрицательными числами в списке
        Methods methods = new Methods();
        List<Integer> negativeNumbersList = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-3, methods.ListSum(negativeNumbersList));
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
    @Test
    void testComparisonWithEqualAverageValues() {
        // Тест для проверки метода Comparison при равных средних значениях списков
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 3, 1);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream, true)); // Capture output
        Methods methods = new Methods();
        methods.Comparison(list1, list2);
        assertEquals("Средние значения равны\r\n", outputStream.toString());
    }
    @Test
    void testComparison1() {
        // Подготовка тестовых данных
        List<Integer> list1 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        // Запуск тестируемого метода
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream, true)); // Захват вывода
        Methods methods = new Methods();
        methods.Comparison(list1, list2);

        // Проверка результатов
        String expectedOutput = "Первый список имеет большее среднее значение\r\n";
        assertEquals(expectedOutput, outputStream.toString()); // Проверка вывода
    }
}