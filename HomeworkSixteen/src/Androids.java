public class Androids implements LinuxOS, Smartphones {
    String theSize; // Размер
    String color; // Цвет

    public Androids(String theSize, String color) {
        this.theSize = theSize;
        this.color = color;
    }

    @Override
    public void call() {
        System.out.println("Телефон " + LinuxOS.model + " способен осуществлять вызовы.");
    } // Переопределяем метод у interface Smartphones

    @Override
    public void sms() {
        System.out.println("Телефон " + LinuxOS.model + " поддерживает функцию sms.");
    } // Переопределяем метод у interface Smartphones

    @Override
    public void internet() {
        System.out.println("Телефон " + LinuxOS.model + " с подключением в интернет.");
    } // Переопределяем метод c interface Smartphones

    @Override
    public void printAvailabilityOfGuarantee() {
        System.out.println("Гарантия на " + theSize + ", " + color + " телефон " + LinuxOS.model + " в наличии.");
    } // Переопределяем метод c interface Ios

    @Override
    public void printCheckingForMms() {
        LinuxOS.super.printCheckingForMms();
    }
}

