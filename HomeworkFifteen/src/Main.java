import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int orderCounter = 0; // Счётчик количества заказов
        System.out.println("Добро пожаловать. Сделайте заказ из меню:\n1. Кофе\n2. Чай\n3. Лимонад\n4. Мохито\n5. Минералка\n6. " +
                "Кока-Кола\nИли нажмите цыфру 7 если больше не хотите делать заказ\nНажмите цыфру которая соответствует Вашему выбору:");
        Scanner readingFromTheConsole = new Scanner(System.in);
        // Далее цыкл for, по условию задачи: "#7 Пользователь должен иметь возможность заказать несколько напитков"
        for (; ; ) {
            int theNumberWePressedIs = readingFromTheConsole.nextInt();
            // Далее выбор напитка через switch, по условию задачи: "#5 Сделайте switch-case оператор который будет делать напиток(вызывая соответствующий метод) в зависимости от выбора клиента;"
            switch (theNumberWePressedIs) {
                case (1):
                    System.out.print("Вы нажали цыфру 1, это заказ: " + DrinksMachine.COFFEE + " его цена: " + Drinks.COFFEE_CONSTANT + ". ");
                    System.out.print(Drinks.preparingADrink(DrinksMachine.COFFEE));
                    Drinks.sumUpTheOrder(Drinks.COFFEE_CONSTANT);
                    break;
                case (2):
                    System.out.print("Вы нажали цыфру 2, это заказ: " + DrinksMachine.TEA + " его цена: " + Drinks.TEA_CONSTANT + ". ");
                    System.out.print(Drinks.preparingADrink(DrinksMachine.TEA));
                    Drinks.sumUpTheOrder(Drinks.TEA_CONSTANT);
                    break;
                case (3):
                    System.out.print("Вы нажали цыфру 3, это заказ: " + DrinksMachine.LEMONADE + " его цена: " + Drinks.LEMONADE_CONSTANT + ". ");
                    System.out.print(Drinks.preparingADrink(DrinksMachine.LEMONADE));
                    Drinks.sumUpTheOrder(Drinks.LEMONADE_CONSTANT);
                    break;
                case (4):
                    System.out.print("Вы нажали цыфру 4, это заказ: " + DrinksMachine.MOJITO + " его цена: " + Drinks.MOJITO_CONSTANT + ". ");
                    System.out.print(Drinks.preparingADrink(DrinksMachine.MOJITO));
                    Drinks.sumUpTheOrder(Drinks.MOJITO_CONSTANT);
                    break;
                case (5):
                    System.out.print("Вы нажали цыфру 5, это заказ: " + DrinksMachine.MINERAL + " его цена: " + Drinks.MINERAL_CONSTANT + ". ");
                    System.out.print(Drinks.preparingADrink(DrinksMachine.MINERAL));
                    Drinks.sumUpTheOrder(Drinks.MINERAL_CONSTANT);
                    break;
                case (6):
                    System.out.print("Вы нажали цыфру 4, это заказ: " + DrinksMachine.COCA_COLA + " его цена: " + Drinks.COCA_COLA_CONSTANT + ". ");
                    System.out.print(Drinks.preparingADrink(DrinksMachine.COCA_COLA));
                    Drinks.sumUpTheOrder(Drinks.COCA_COLA_CONSTANT);
                    break;
                default:
                    break;
            }
            if (theNumberWePressedIs < 7) {
                orderCounter++;
                System.out.println("Продолжайте делать заказ");
            }
            if (theNumberWePressedIs == 7) {
                System.out.println("Вы закончили делать заказы, всего сделано заказов: " + orderCounter + ", на общюю сумму (Вы должны денег): " + Drinks.totalOrderValue);
                break;
            }
        }
    }
}