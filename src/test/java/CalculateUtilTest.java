import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateUtilTest {

    @Test
    public void calculateUtilCheck() {
        try {
            CalculatedSum sum;

            // первая покупка
            sum = CalculateUtil.calculateSum(new Purchase(5, 79.9, 0.75));
            assertEquals(sum.getSumWithoutDiscount().doubleValue(), 399.50);
            assertEquals(sum.getSumWithDiscount().doubleValue(), 396.50);

            // вторая покупка
            sum = CalculateUtil.calculateSum(new Purchase(8, 790, 42.575));
            assertEquals(sum.getSumWithoutDiscount().doubleValue(), 6320.00);
            assertEquals(sum.getSumWithDiscount().doubleValue(), 3629.26);

            // третья покупка
            sum = CalculateUtil.calculateSum(new Purchase(3, 1190.99, 59.1));
            assertEquals(sum.getSumWithoutDiscount().doubleValue(), 3572.97);
            assertEquals(sum.getSumWithDiscount().doubleValue(), 1461.34);

            // четвёртая покупка
            sum = CalculateUtil.calculateSum(new Purchase(-3, 1190.99, 59.1));
            assertEquals(sum.getSumWithoutDiscount().doubleValue(), -3572.97);
            assertEquals(sum.getSumWithDiscount().doubleValue(), -1461.34);
        } catch (NullPointerException e) {
            System.out.println("Invalid input values!");
        }
    }
}