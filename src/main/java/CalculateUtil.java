import java.math.BigDecimal;
import java.math.RoundingMode;

/* класс, который содержит метод,
 * отвечающий за рассчёт итоговых сумм*/
public class CalculateUtil {

    //рассчёт итогоывх сумм
    public static CalculatedSum calculateSum(Purchase purchase) {
        // проверка, что кол-во товаров и цена одной единицы товара больше 0
        if (purchase.getNumOfProducts() > 0 && purchase.getCostOfProduct() > 0) {
            // создание объекта класса CalculatedSum
            CalculatedSum calculatedSum = new CalculatedSum();

            // рассчёт стоимости покупки без скидки
            BigDecimal sumWithoutDiscountRounded = new BigDecimal(purchase.getNumOfProducts() * purchase.getCostOfProduct());
            sumWithoutDiscountRounded = sumWithoutDiscountRounded.setScale(2, RoundingMode.HALF_UP);
            calculatedSum.setSumWithoutDiscount(sumWithoutDiscountRounded);

            // рассчёт стоимости покупки со скидкой
            BigDecimal sumWithDiscountRounded = new BigDecimal(calculatedSum.getSumWithoutDiscount().doubleValue() * (1 - purchase.getDiscount() / 100));
            sumWithDiscountRounded = sumWithDiscountRounded.setScale(2, RoundingMode.HALF_UP);
            calculatedSum.setSumWithDiscount(sumWithDiscountRounded);

            return calculatedSum;
        } else return null;
    }
}
