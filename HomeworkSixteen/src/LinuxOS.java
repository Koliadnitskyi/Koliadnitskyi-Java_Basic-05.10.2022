public interface LinuxOS {
    String model = "Samsung";

    void checkingForAGuarantee();

    default void checkingForMms() {
        System.out.println("Телефон " + model + " поддерживает функцию mms.");
    }

    static void printModelISamsung() {
        System.out.println("Модель телефона: " + model + ".");
    }
}