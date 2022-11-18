import java.math.BigDecimal;

public class Drinks {
    static BigDecimal totalOrderValue = new BigDecimal("0"); // общяя стоимость заказа

    static BigDecimal COFFEE_CONSTANT = new BigDecimal("5.23");
    static BigDecimal TEA_CONSTANT = new BigDecimal("7.44");
    static BigDecimal LEMONADE_CONSTANT = new BigDecimal("2.29");
    static BigDecimal MOJITO_CONSTANT = new BigDecimal("3.44");
    static BigDecimal MINERAL_CONSTANT = new BigDecimal("6.11");
    static BigDecimal COCA_COLA_CONSTANT = new BigDecimal("9.99");


    static void sumUpTheOrder(BigDecimal price) {
        totalOrderValue = totalOrderValue.add(price);
    } // метод необходим для сумирования суммы заказа

    static String preparingADrink(DrinksMachine drink) {
        return "Напиток: " + drink + " готовится, спасибо за заказ. ";
    } // Метод необходим по условию задачи:"#4 Сделайте метод для приготовления каждого напитка;"
}
