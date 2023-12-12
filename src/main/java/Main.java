public class Main {
    public static void main(String[] args) {
        // создание 3 объектов класcа Purchase
        Purchase firstPurchase = new Purchase(5, 79.9, 0.75);
        Purchase secondPurchase = new Purchase(8, 790, 42.575);
        Purchase thirdPurchase = new Purchase(3, 1190.99, 59.1);

        // вызовы метода printSumOfPurchaseWithAndWithoutDiscount для 3 различных объектов
        Purchase.printSumOfPurchaseWithAndWithoutDiscount(firstPurchase);
        Purchase.printSumOfPurchaseWithAndWithoutDiscount(secondPurchase);
        Purchase.printSumOfPurchaseWithAndWithoutDiscount(thirdPurchase);
    }
}
