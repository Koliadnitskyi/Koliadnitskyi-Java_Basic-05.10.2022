public class Iphones implements Ios, Smartphones {
    String surfaceType; // Тип поверхности (глянцевый, матовый)
    String theWeight; // Вес

    public Iphones(String surfaceType, String theWeight) {
        this.surfaceType = surfaceType;
        this.theWeight = theWeight;
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
    } // Переопределяем метод c interface Smartphones

    @Override
    public void printTechnicalCondition() {
        System.out.println("Телефон " + Ios.model + " новый, " + surfaceType + ", " + theWeight + ".");
    }  // Переопределяем метод c interface LinuxOS

    @Override
    public void printBatteryType() {
        Ios.super.printBatteryType();
    }
}
