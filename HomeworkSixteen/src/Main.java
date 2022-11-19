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
        IPhones myIPhones = new IPhones("большой", "чёрный");

        IOS.printModelIPhone(); // Вызываем static метод printModelIPhone у interface IOS
        myIPhones.checkingForAGuarantee(); // Вызываем метод checkingForAGuarantee у класса IPhones
        myIPhones.checkingForMms(); // Вызываем метод checkingForMms у класса IPhones
        myIPhones.call(); // Вызываем метод call у класса IPhones
        myIPhones.sms(); // Вызываем метод sms у класса IPhones
        myIPhones.internet(); // Вызываем метод internet у класса IPhones
    }
}