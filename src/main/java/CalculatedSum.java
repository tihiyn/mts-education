import java.math.BigDecimal;

// класс, содержащий итоговые суммы
public class CalculatedSum {

    // стоимость покупки без скидки
    private BigDecimal sumWithoutDiscount;
    // стоимость покупки со скидкой
    private BigDecimal sumWithDiscount;

    // getters
    public BigDecimal getSumWithoutDiscount() {
        return sumWithoutDiscount;
    }

    // setters
    public void setSumWithoutDiscount(BigDecimal sumWithoutDiscount) {
        this.sumWithoutDiscount = sumWithoutDiscount;
    }

    public BigDecimal getSumWithDiscount() {
        return sumWithDiscount;
    }

    public void setSumWithDiscount(BigDecimal sumWithDiscount) {
        this.sumWithDiscount = sumWithDiscount;
    }
}
