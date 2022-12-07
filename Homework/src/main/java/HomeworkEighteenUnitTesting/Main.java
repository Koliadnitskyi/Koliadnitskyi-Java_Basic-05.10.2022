package HomeworkEighteenUnitTesting;

public class Main {
    public static void main(String[] args) {
        AveragAarithmeticAndCheckArray person = new AveragAarithmeticAndCheckArray();
        Integer[][] array = {{3, 5, 44}, {2, 2, 12}, {23, 12, 4}};
        Integer[][] arrayTwo = {{3, 5, 44}, {23, 12, 4}};
        System.out.println(person.countingArithmeticMeanOfElementsOfArray(array));
        System.out.println("Двумерная матрица array квадратная?: " + person.checkIfMatrixIsSquare(array));
        System.out.println("Двумерная матрица arrayTwo квадратная?: " + person.checkIfMatrixIsSquare(arrayTwo));
    }
}
