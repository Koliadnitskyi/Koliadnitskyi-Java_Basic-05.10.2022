import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner readingFromTheConsole = new Scanner(System.in);
        System.out.println("Нажмите на клавиатуре число от 0 до 9. Введённое число будет значением М");

        //Далее получаем значение введённое в консоль с клавиатуры для М
        int inputValueM = readingFromTheConsole.nextInt();

        System.out.println("Нажмите на клавиатуре число от 0 до 9. Введённое число будет значением N");

        //Далее получаем значение введённое в консоль с клавиатуры для М
        int inputValueN = readingFromTheConsole.nextInt();

        // После ввода значений M и N создаётся двумерный массив arrayOneMxN
        int[][] arrayOneMxN = new int[inputValueM][inputValueN];

        //Далее рандомно инициализируем (заполняем) двумерный массив arrayOneMxN
        for (int a = 0; a < arrayOneMxN.length; a++) {
            for (int r = 0; r < arrayOneMxN[a].length; r++) {
                int riddleFromZeroToTen = (int) (Math.random() * 10); // Рандом целого числа в диапазоне 0-9
                arrayOneMxN[a][r] = riddleFromZeroToTen;
            }
        }

        //Далее выводим в консоль массив arrayOneMxN в форме таблици (матрици) с использованием цикла
        System.out.println("Массив: arrayOneMxN");
        for (int g = 0; g < arrayOneMxN.length; g++) {
            for (int c = 0; c < arrayOneMxN[g].length; c++) {
                System.out.print(arrayOneMxN[g][c]);
            }
            System.out.println();
        }

        //Далее транспонируем двумерный массив arrayOneMxN в двумерный массив arrayOneNxM
        int[][] arrayOneNxM = new int[inputValueN][inputValueM];
        for (int i = 0; i < arrayOneMxN.length; i++) {
            for (int j = 0; j < arrayOneMxN[i].length; j++) {
                arrayOneNxM[j][i] = arrayOneMxN[i][j];
            }
        }

        //Далее выводим в консоль транспонированый массив arrayOneNxM в форме таблици (матрици) с использованием цикла
        System.out.println("Транспонированый массив: arrayOneNxM");
        for (int g = 0; g < arrayOneNxM.length; g++) {
            for (int c = 0; c < arrayOneNxM[g].length; c++) {
                System.out.print(arrayOneNxM[g][c]);
            }
            System.out.println();
        }
    }
}