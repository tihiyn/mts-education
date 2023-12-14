package dto;

/*Класс dto.Purchase, который описывает покупку одной/нескольких
 * единиц товара (предусматривается наличие скидки)*/
public class Purchase {
    // количество товаров в покупке
    private int numOfProducts;
    // цена одной единицы товара
    private double costOfProduct;
    // скидка на товар
    private double discount;

    // конструктор
    public Purchase(int numOfProducts, double costOfProduct, double discount) {
        this.numOfProducts = numOfProducts;
        this.costOfProduct = costOfProduct;
        this.discount = discount;
    }

    // getters
    public int getNumOfProducts() {
        return numOfProducts;
    }

    public double getCostOfProduct() {
        return costOfProduct;
    }

    public double getDiscount() {
        return discount;
    }
}
