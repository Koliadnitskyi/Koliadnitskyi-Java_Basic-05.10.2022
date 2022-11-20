public class Main {
    public static void main(String[] args) {
        // ↓ Создаём экземпляр (объект) класса Androids
        Androids myAndroids = new Androids("маленький", "белый");

        LinuxOS.printModelTelephone(); // Вызываем static метод printModelIPhone у interface LinuxOS
        myAndroids.printAvailabilityOfGuarantee(); // Вызываем метод printAvailabilityOfGuarantee у класса Androids
        myAndroids.printCheckingForMms(); // Вызываем метод printCheckingForMms у класса Androids
        myAndroids.call(); // Вызываем метод call у класса Androids
        myAndroids.sms(); // Вызываем метод sms у класса Androids
        myAndroids.internet(); // Вызываем метод internet у класса Androids

        System.out.print("\n");// Делаем отступ между экземплярами (объектами) классов

        // ↓ Создаём экземпляр (объект) класса IPhone
        Iphones myIPhones = new Iphones("матовый", "лёгкий");

        Ios.printModelSmartphone(); // Вызываем static метод printModelSmartphone у interface IOS
        myIPhones.printTechnicalCondition(); // Вызываем метод printTechnicalCondition у класса Iphones
        myIPhones.printBatteryType(); // Вызываем метод printBatteryType у класса Iphones
        myIPhones.call(); // Вызываем метод call у класса Iphones
        myIPhones.sms(); // Вызываем метод sms у класса Iphones
        myIPhones.internet(); // Вызываем метод internet у класса Iphones
    }
}