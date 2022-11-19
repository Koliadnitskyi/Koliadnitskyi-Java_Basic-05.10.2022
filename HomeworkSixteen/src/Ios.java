public interface Ios {
    String model = "iPhone";

    void printTechnicalCondition();

    default void printBatteryType() {
        System.out.println("Телефон " + model + " имеет встроеный аккумулятор.");
    } // По сути в условии задачи не было задано default метода, но он тут для тренировки и возможности показать что есть понимание как он работает

    static void printModelSmartphone() {
        System.out.println("Модель телефона: " + model + ".");
    } // По сути в условии задачи не было задано static метода, но он тут для тренировки и возможности показать что есть понимание как он работает
}
