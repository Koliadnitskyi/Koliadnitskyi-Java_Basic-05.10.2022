public class Main {
    public static void main(String[] args) {
        int[] oneHundredSpaceShuttles = new int[100];
        int unluckyNumberFour = 4;
        int unluckyNumberNine = 9;

        int arrayCounter = 0;

        for (int counterFor = 100; counterFor < 1000; counterFor++) {
            int determineTheFirstNumberCounterFor = counterFor % 10;
            int determineTheSecondNumberCounterFor = (counterFor / 10) % 10;
            int determineTheThirdNumberCounterFor = counterFor / 10 / 10;

            if (determineTheFirstNumberCounterFor != unluckyNumberFour &&
                    determineTheFirstNumberCounterFor != unluckyNumberNine &&
                    determineTheSecondNumberCounterFor != unluckyNumberFour &&
                    determineTheSecondNumberCounterFor != unluckyNumberNine &&
                    determineTheThirdNumberCounterFor != unluckyNumberFour &&
                    determineTheThirdNumberCounterFor != unluckyNumberNine) {
                oneHundredSpaceShuttles[arrayCounter] = counterFor;
                arrayCounter++;
                if (arrayCounter > 99) {
                    break;
                }
            }
        }
        System.out.print("Номера всех космических шатлов для перевоски людей на Марс: ");
        for (int oneHundredSpaceShuttle : oneHundredSpaceShuttles) {
            System.out.print(oneHundredSpaceShuttle + ", ");
        }
        System.out.print("\b\b.");
    }
}
