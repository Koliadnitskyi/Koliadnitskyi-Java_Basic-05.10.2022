public interface LinuxOS {
    String model = "Samsung";

    void checkingForAGuarantee();

    default void checkingForMms() {
        System.out.println("Телефон " + model + " поддерживает функцию mms.");
    } // По сути в условии задачи не было задано default метода, но он тут для тренировки и возможности показать что есть понимание как он работает

    static void printModelISamsung() {
        System.out.println("Модель телефона: " + model + ".");
    } // По сути в условии задачи не было задано static метода, но он тут для тренировки и возможности показать что есть понимание как он работает
}