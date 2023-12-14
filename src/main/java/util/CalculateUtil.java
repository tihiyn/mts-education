package util;

import dto.CalculatedSum;
import dto.Purchase;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* класс, который содержит метод,
 * отвечающий за рассчёт итоговых сумм*/
public class CalculateUtil {

    //рассчёт итогоывх сумм
    public static CalculatedSum calculateSum(Purchase purchase) {
        // проверка, что кол-во товаров и цена одной единицы товара больше 0
        if (purchase.getNumOfProducts() > 0 && purchase.getCostOfProduct() > 0) {
            // создание объекта класса util.CalculatedSum
            CalculatedSum calculatedSum = new CalculatedSum();

            // рассчёт стоимости покупки без скидки
            BigDecimal sumWithoutDiscountRounded = new BigDecimal(purchase.getNumOfProducts() * purchase.getCostOfProduct()).setScale(2, RoundingMode.HALF_UP);
            calculatedSum.setSumWithoutDiscount(sumWithoutDiscountRounded);

            // рассчёт стоимости покупки со скидкой
            BigDecimal sumWithDiscountRounded = sumWithoutDiscountRounded.multiply(BigDecimal.valueOf(1 - purchase.getDiscount() / 100)).setScale(2, RoundingMode.HALF_UP);
            calculatedSum.setSumWithDiscount(sumWithDiscountRounded);

            return calculatedSum;
        }
        return null;
    }
}
