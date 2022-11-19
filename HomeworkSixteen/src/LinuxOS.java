public interface LinuxOS {
    String model = "Samsung";

    void printAvailabilityOfGuarantee();

    default void printCheckingForMms() {
        System.out.println("Телефон " + model + " поддерживает функцию mms.");
    } // По сути в условии задачи не было задано default метода, но он тут для тренировки и возможности показать что есть понимание как он работает

    static void printModelTelephone() {
        System.out.println("Модель телефона: " + model + ".");
    } // По сути в условии задачи не было задано static метода, но он тут для тренировки и возможности показать что есть понимание как он работает
}