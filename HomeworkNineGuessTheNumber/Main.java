import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int riddleFromZeroToTen = (int) (Math.random() * 11); // Рандом целого числа в диапазоне 1-10

        System.out.println("Нажмите на клавиатуре Ваш вариант целого числа в диапазоне от 0 до 10");

        int counterForTheNumberOfAttempts = 0; // Счётчик попыток угадать число

        for (; ; ) {  /*первые попытки сделать код гибким (универсальным),
                       нет ограничения по числу итераций, но дальше есть условие прекращения цикла*/

            Scanner readingFromTheConsole = new Scanner(System.in);
            int theNumberWePressedIs = readingFromTheConsole.nextInt();

            if (riddleFromZeroToTen == theNumberWePressedIs) {
                System.out.println("ПОБЕДА!!! Вы ввели с помощью клавиатуры число: " + theNumberWePressedIs +
                        " и это число совпадает с числом которое загадал компютер. Игра закончена!");
                return; // прекращение работы метода в случее победы
            } else {
                System.out.println("Поражение!!! Вы ввели с помощью клавиатуры число: " + theNumberWePressedIs +
                        " и это число не совпадает с числом которое загадал компютер.");
                counterForTheNumberOfAttempts++;
            }
            if (counterForTheNumberOfAttempts == 10) {
                System.out.print("Вы проиграли. 10 попыток закончились. Игра закончена."); // После 10 поражений игра заканчивается
                break;
            }
        }
    }
}
