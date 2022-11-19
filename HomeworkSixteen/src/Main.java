public class Main {
    public static void main(String[] args) {
        // ↓ Создаём экземпляр (объект) класса Androids
        Androids myAndroids = new Androids("маленький", "белый");

        LinuxOS.printModelISamsung(); // Вызываем метод printModelIPhone у interface Smartphones
        myAndroids.checkingForAGuarantee(); // Вызываем метод checkingForAGuarantee у класса Androids
        myAndroids.checkingForMms(); // Вызываем метод checkingForMms у класса Androids
        myAndroids.call(); // Вызываем метод call у класса Androids
        myAndroids.sms(); // Вызываем метод sms у класса Androids
        myAndroids.internet(); // Вызываем метод internet у класса Androids

        System.out.print("\n");// Делаем отступы между о

        // ↓ Создаём экземпляр (объект) класса Iphones
        Iphones myIphones = new Iphones("большой", "чёрный");

        Ios.printModelIPhone(); // Вызываем метод printModelIPhone у interface Smartphones
        myIphones.checkingForAGuarantee(); // Вызываем метод checkingForAGuarantee у interface Iphones
        myIphones.checkingForMms(); // Вызываем метод checkingForMms у interface Iphones
        myIphones.call(); // Вызываем метод call у interface Iphones
        myIphones.sms(); // Вызываем метод sms у interface Iphones
        myIphones.internet(); // Вызываем метод internet у interface Iphones
    }
}