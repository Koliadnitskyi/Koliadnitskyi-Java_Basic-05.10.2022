public class Main {
    public static void main(String[] args) {
        Androids myAndroids = new Androids("маленький", "белый");
        LinuxOS.printModelISamsung();
        myAndroids.checkingForAGuarantee();
        myAndroids.checkingForMms();
        myAndroids.call();
        myAndroids.sms();
        myAndroids.internet();

        System.out.print("\n");

        Iphones myIphones = new Iphones("большой", "чёрный");
        Ios.printModelIPhone();
        myIphones.checkingForAGuarantee();
        myIphones.checkingForMms();
        myIphones.call();
        myIphones.sms();
        myIphones.internet();
    }
}