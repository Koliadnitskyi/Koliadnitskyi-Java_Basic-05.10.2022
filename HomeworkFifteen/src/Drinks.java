import java.math.BigDecimal;

public class Drinks {
    static BigDecimal totalOrderValue = new BigDecimal("0"); // общяя стоимость заказа

    public static final BigDecimal COFFEE_CONSTANT = new BigDecimal("5.23");
    public static final BigDecimal TEA_CONSTANT = new BigDecimal("7.44");
    public static final BigDecimal LEMONADE_CONSTANT = new BigDecimal("2.29");
    public static final BigDecimal MOJITO_CONSTANT = new BigDecimal("3.44");
    public static final BigDecimal MINERAL_CONSTANT = new BigDecimal("6.11");
    public static final BigDecimal COCA_COLA_CONSTANT = new BigDecimal("9.99");

    static void sumUpTheOrder(BigDecimal price) {
        totalOrderValue = totalOrderValue.add(price);
    } // Метод необходим для сумирования цены заказа

    static String preparingADrink(DrinksMachine drink) {
        return "Напиток: " + drink + " готовится, спасибо за заказ. ";
    } // Метод необходим по условию задачи:"#4 Сделайте метод для приготовления каждого напитка;"
}
