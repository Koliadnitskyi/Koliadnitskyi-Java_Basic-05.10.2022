public class Main {
    public static void main(String[] args) {
        FitnessTracker fitnessTracker = new FitnessTracker("Bogdan", 12, 10, 1980,
                "0164zeos20081@gmail.com", 952181776, "Ivanov", 88.23, "120-80", 12873);
        fitnessTracker.defendingTheAge(fitnessTracker.getDateOfBirthYear()); // Вызываем метод который высчитали возраст пользователя и ложит во внутреннюю переменную age
        fitnessTracker.printAccountInfo(fitnessTracker); // Через метод printAccountInfo печатаем все данные пользователя fitnessTracker

        FitnessTracker fitnessTracker1 = new FitnessTracker("Kiril", 10, 12, 1977,
                "Kiril@gmail.com", 989431299, "Petrov", 77.12, "115-77", 10751);
        fitnessTracker1.defendingTheAge(fitnessTracker1.getDateOfBirthYear()); // Вызываем метод который высчитали возраст пользователя и ложит во внутреннюю переменную age.
        fitnessTracker1.printAccountInfo(fitnessTracker1);  // Через метод printAccountInfo печатаем все данные пользователя fitnessTracker1

        FitnessTracker fitnessTracker2 = new FitnessTracker("Dima", 19, 11, 1992,
                "Dima_1992@gmail.com", 504781244, "Sidorov", 92.02, "140-90", 9887);
        fitnessTracker2.defendingTheAge(fitnessTracker2.getDateOfBirthYear()); // Вызываем метод который высчитали возраст пользователя и ложит во внутреннюю переменную age
        fitnessTracker2.printAccountInfo(fitnessTracker2); // Через метод printAccountInfo печатаем все данные пользователя fitnessTracker2

        FitnessTracker fitnessTracker3 = new FitnessTracker("Igor", 18, 10, 1989,
                "Igor_java@gmail.com", 664778998, "Popov", 87.32, "125-85", 13478);
        fitnessTracker3.defendingTheAge(fitnessTracker3.getDateOfBirthYear()); // Вызываем метод который высчитали возраст пользователя и ложит во внутреннюю переменную age
        fitnessTracker3.printAccountInfo(fitnessTracker3); // Через метод printAccountInfo печатаем все данные пользователя fitnessTracker3

        System.out.println("Изменяем поля и повторно печатаем:");

        fitnessTracker.setNumberOfStepsTakenPerDay(12777); // Изменяем значение: "Количество пройденных за день шагов" с 12873 на 12777
        fitnessTracker.setPressure("160-100"); // Изменяем значение: "Давление" с "120-80" на "160-100"
        fitnessTracker.defendingTheAge(fitnessTracker.getDateOfBirthYear()); // Высчитали возраст пользователя и положили во внутреннюю переменную age.
        fitnessTracker.printAccountInfo(fitnessTracker); // Через метод printAccountInfo печатаем все данные пользователя fitnessTracker

        fitnessTracker1.setPressure("165-95"); // Изменяем значение: "Давление" с "115-77" на "165-95"
        fitnessTracker1.setTheWeight(78.22); // Изменяем значение: "Давление" с 77.12 на 78.22
        fitnessTracker1.defendingTheAge(fitnessTracker1.getDateOfBirthYear()); // Высчитали возраст пользователя и положили во внутреннюю переменную age.
        fitnessTracker1.printAccountInfo(fitnessTracker1); // Через метод printAccountInfo печатаем все данные пользователя fitnessTracker1
    }
}