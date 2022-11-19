public class Main {
    public static void main(String[] args) {
        // ↓ Создаём экземпляр (объект) класса Androids
        Androids myAndroids = new Androids("маленький", "белый");

        LinuxOS.printModelISamsung(); // Вызываем static метод printModelIPhone у interface LinuxOS
        myAndroids.checkingForAGuarantee(); // Вызываем метод checkingForAGuarantee у класса Androids
        myAndroids.checkingForMms(); // Вызываем метод checkingForMms у класса Androids
        myAndroids.call(); // Вызываем метод call у класса Androids
        myAndroids.sms(); // Вызываем метод sms у класса Androids
        myAndroids.internet(); // Вызываем метод internet у класса Androids

        System.out.print("\n");// Делаем отступ между экземплярами (объектами) классов

        // ↓ Создаём экземпляр (объект) класса IPhone
        Iphones myIPhones = new Iphones("большой", "чёрный");

        Ios.printModelIPhone(); // Вызываем static метод printModelIPhone у interface IOS
        myIPhones.checkingForAGuarantee(); // Вызываем метод checkingForAGuarantee у класса Iphones
        myIPhones.checkingForMms(); // Вызываем метод checkingForMms у класса Iphones
        myIPhones.call(); // Вызываем метод call у класса Iphones
        myIPhones.sms(); // Вызываем метод sms у класса Iphones
        myIPhones.internet(); // Вызываем метод internet у класса Iphones
    }
}