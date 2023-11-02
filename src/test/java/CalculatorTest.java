import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        testCalculateDiscount();
    }

    private static void testCalculateDiscount() {
        double purchaseAmount = 100;
        double discountPercentage = 10;
        double expectedPriceAfterDiscount = 90;

        double actualPriceAfterDiscount = Calculator.calculateDiscount(purchaseAmount, discountPercentage);

        // Используем AssertJ для проверки результата
        Assertions.assertThat(actualPriceAfterDiscount).isEqualTo(expectedPriceAfterDiscount);
    }
}
