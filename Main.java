import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersGuessedByTheCompany = new int[7];
        int[] theNumbersGuessedByThePlayer = new int[7];

        for (int i = 0; i < numbersGuessedByTheCompany.length; i++) {
            numbersGuessedByTheCompany[i] = (int) (Math.random() * 9);
        }
        for (int r = 0; r < theNumbersGuessedByThePlayer.length; r++) {
            theNumbersGuessedByThePlayer[r] = (int) (Math.random() * 9);
        }
        for (int b = 0; b < numbersGuessedByTheCompany.length - 1; b++) {
            for (int k = 0; k < numbersGuessedByTheCompany.length - 1; k++) {
                if (numbersGuessedByTheCompany[k] > numbersGuessedByTheCompany[k + 1]) {
                    int tmp = numbersGuessedByTheCompany[k + 1];
                    numbersGuessedByTheCompany[k + 1] = numbersGuessedByTheCompany[k];
                    numbersGuessedByTheCompany[k] = tmp;
                }
            }
        }
        for (int a = 0; a < theNumbersGuessedByThePlayer.length - 1; a++) {
            for (int x = 0; x < theNumbersGuessedByThePlayer.length - 1; x++) {
                if (theNumbersGuessedByThePlayer[x] > theNumbersGuessedByThePlayer[x + 1]) {
                    int tmp = theNumbersGuessedByThePlayer[x + 1];
                    theNumbersGuessedByThePlayer[x + 1] = theNumbersGuessedByThePlayer[x];
                    theNumbersGuessedByThePlayer[x] = tmp;
                }
            }
        }
        int numberOfMatchesInArrays = 0;
        for (int l = 0; l < theNumbersGuessedByThePlayer.length; l++) {
            if (numbersGuessedByTheCompany[l] == theNumbersGuessedByThePlayer[l]) {
                numberOfMatchesInArrays++;
            }
        }
        System.out.println(Arrays.toString(numbersGuessedByTheCompany));
        System.out.println(Arrays.toString(theNumbersGuessedByThePlayer));
        System.out.print("Количество совпадений: " + numberOfMatchesInArrays);
    }
}