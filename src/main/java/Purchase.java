import java.math.BigDecimal;
import java.math.RoundingMode;

/*Класс Purchase, который описывает покупку одной/нескольких
* единиц товара (предусматривается наличие скидки)*/
public class Purchase {
    // количество товаров в покупке
    private final int numOfProducts;
    // цена одной единицы товара
    private final double costOfProduct;
    // скидка на товар
    private final double discount;

    // конструктор
    public Purchase(int numOfProducts, double costOfProduct, double discount) {
        this.numOfProducts = numOfProducts;
        this.costOfProduct = costOfProduct;
        this.discount = discount;
    }

    // выводит на экран общую сумму покупки без скидки и со скидкой
    public  static void printSumOfPurchaseWithAndWithoutDiscount(Purchase purchase) {
        // стоимость покупки без скидки
        double sumWithoutDiscount;
        // стоимость покупки со скидкой
        double sumWithDiscount;

        // вычисление сумм
        sumWithoutDiscount = purchase.numOfProducts * purchase.costOfProduct;
        sumWithDiscount = purchase.numOfProducts * purchase.costOfProduct * (1 - purchase.discount / 100);

        // округление при помощи класса BigDecimal
        BigDecimal sumWithoutDiscountRounded = new BigDecimal(sumWithoutDiscount);
        sumWithoutDiscountRounded = sumWithoutDiscountRounded.setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumWithDiscountRounded = new BigDecimal(sumWithDiscount);
        sumWithDiscountRounded= sumWithDiscountRounded.setScale(2, RoundingMode.HALF_UP);

        // вывод
        System.out.print("Сумма покупки без скидки: ");
        System.out.println(sumWithoutDiscountRounded);
        System.out.print("Сумма покупки со скидкой: ");
        System.out.println(sumWithDiscountRounded);
    }
}
