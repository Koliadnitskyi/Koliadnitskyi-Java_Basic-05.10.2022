// по условию задачи класс должен называтся iPhones но я его назвал IPhones поскольку стиль написания названия классов должен быть CamelCase
public class IPhones implements IOS, Smartphones {
    String theSize;
    String color;

    public IPhones(String theSize, String color) {
        this.theSize = theSize;
        this.color = color;
    }

    @Override
    public void checkingForAGuarantee() {
        System.out.println("Гарантии на " + color + ", " + theSize + " телефон " + IOS.model + " нет в наличии.");
    }  // Переопределяем метод у interface LinuxOS

    @Override
    public void checkingForMms() {
        IOS.super.checkingForMms();
    }

    @Override
    public void call() {
        System.out.println("Телефон " + IOS.model + " не способен осуществлять вызовы.");
    } // Переопределяем метод у interface Smartphones

    @Override
    public void sms() {
        System.out.println("Телефон " + IOS.model + " не поддерживает функцию sms.");
    } // Переопределяем метод у interface Smartphones

    @Override
    public void internet() {
        System.out.println("Телефон " + IOS.model + " без подключения в интернет.");
    } // Переопределяем метод у interface Smartphones
}
