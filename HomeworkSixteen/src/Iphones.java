
public class Iphones implements Ios, Smartphones {
    String theSize;
    String color;

    public Iphones(String theSize, String color) {
        this.theSize = theSize;
        this.color = color;
    }

    @Override
    public void checkingForAGuarantee() {
        System.out.println("Гарантии на " + color + ", " + theSize + " телефон " + Ios.model + " нет в наличии.");
    }  // Переопределяем метод у interface LinuxOS

    @Override
    public void checkingForMms() {
        Ios.super.checkingForMms();
    }

    @Override
    public void call() {
        System.out.println("Телефон " + Ios.model + " не способен осуществлять вызовы.");
    } // Переопределяем метод у interface Smartphones

    @Override
    public void sms() {
        System.out.println("Телефон " + Ios.model + " не поддерживает функцию sms.");
    } // Переопределяем метод у interface Smartphones

    @Override
    public void internet() {
        System.out.println("Телефон " + Ios.model + " без подключения в интернет.");
    } // Переопределяем метод у interface Smartphones
}
