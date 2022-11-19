public class Androids implements LinuxOS, Smartphones {
    String theSize;
    String color;

    public Androids(String theSize, String color) {
        this.theSize = theSize;
        this.color = color;
    }

    @Override
    public void checkingForAGuarantee() {
        System.out.println("Гарантия на " + color + ", " + theSize + " телефон " + LinuxOS.model + " в наличии.");
    } // Переопределяем метод у interface Ios

    @Override
    public void checkingForMms() {
        LinuxOS.super.checkingForMms();
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
    } // Переопределяем метод у interface Smartphones
}
