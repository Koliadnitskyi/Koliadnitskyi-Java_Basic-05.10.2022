public class Main {
    public static void main(String[] args) {
    /*
    В этой бизнес логике (коде) интерестно вышло.
    Поначалу я хотел назвать переменные: width, height и long.
    Но long это ключевое слово Java.
    Пришлось называть: widthParallelepiped, heightParallelepiped и longParallelepiped.
     */
        long widthParallelepiped = 3l; // ширена параллелепипеда
        float heightParallelepiped = 2.93f; // высота параллелепипеда
        double longParallelepiped = 4.777; // длинна параллелепипеда

        double volume = widthParallelepiped * heightParallelepiped * longParallelepiped;
        System.out.println("Объем параллелепипеда = " + volume);

        float length = widthParallelepiped + heightParallelepiped + (float)longParallelepiped;
        String totalLengthOfAllSides = "Cуммарная длина всех сторон ";
        System.out.print(totalLengthOfAllSides + length);
    }
}