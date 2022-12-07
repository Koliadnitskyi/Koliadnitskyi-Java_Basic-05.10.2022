package HomeworkEighteenUnitTesting;

public class AveragAarithmeticAndCheckArray implements Arrays {

    public double countingArithmeticMeanOfElementsOfArray(Integer[][] arrays) {

        if (arrays != null) {
            int sumOfAllPartsOfArray = 0;
            for (Integer[] arraysFor : arrays) {
                for (int i : arraysFor) {
                    sumOfAllPartsOfArray += i;
                }
            }
            return (double) sumOfAllPartsOfArray / (arrays.length * arrays[1].length);
        }
        return 0;
    }

    public boolean checkIfMatrixIsSquare(Integer[][] arrays) {
        return arrays.length == arrays[1].length;
    }
}