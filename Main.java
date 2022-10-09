public class Main {
    public static void main(String[] args) {
   
        int widthParallelepiped = 3; // ширена параллелепипеда
        float heightParallelepiped = 2.93f; // высота параллелепипеда
        double longParallelepiped = 4.777; // длинна параллелепипеда

        double volume = widthParallelepiped * heightParallelepiped * longParallelepiped;
        System.out.println("Объем параллелепипеда = " + volume);

        float length = (widthParallelepiped + heightParallelepiped + (float)longParallelepiped) * 4;
        String totalLengthOfAllSides = "Cуммарная длина всех сторон ";
        System.out.print(totalLengthOfAllSides + length);
    }
}