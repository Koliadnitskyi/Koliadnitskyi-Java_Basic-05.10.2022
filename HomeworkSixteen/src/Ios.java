
public interface Ios {
    String model = "iPhone";

    void checkingForAGuarantee();

    default void checkingForMms() {
        System.out.println("Телефон " + model + " не поддерживает функцию mms.");
    } // По сути в условии задачи не было задано default метода, но он тут для тренировки и возможности показать что есть понимание как он работает

    static void printModelIPhone() {
        System.out.println("Модель телефона: " + model + ".");
    } // По сути в условии задачи не было задано static метода, но он тут для тренировки и возможности показать что есть понимание как он работает
}
