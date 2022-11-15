public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("булка", "мясо", "сыр", "зелень", "майонез");
        Burger burger2 = new Burger("булка", "мясо", "сыр", "зелень");
        Burger burger3 = new Burger("булка", 2, "мяса", "сыр", "зелень", "майонез");
    }
}