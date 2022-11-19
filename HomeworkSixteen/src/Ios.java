public interface Ios {
    String model = "iPhone";

    void checkingForAGuarantee();

    default void checkingForMms() {
        System.out.println("Телефон " + model + " не поддерживает функцию mms.");
    }

    static void printModelIPhone() {
        System.out.println("Модель телефона: " + model + ".");
    }
}
