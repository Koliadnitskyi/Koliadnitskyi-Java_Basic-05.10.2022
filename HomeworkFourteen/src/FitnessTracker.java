public class FitnessTracker {
    public final static int YEAR_CONSTANT = 2022; // год до которого мы считаем возраст, в условии задачи 2020 но на лекции договорились что 2022
    // ↓ Неизменяемые (задаются только при создании аккаунта, и могут быть получены только с помощью геттеров)
    private String name; // і. Имя
    private int dateOfBirthDay; // іі. Дата рождения (конкретно день), это было обговорено на лекции
    private int dateOfBirthMonth; // іі. Дата рождения (конкретно месяц), это было обговорено на лекции
    private int dateOfBirthYear; // іі. Дата рождения (конкретно год), это было обговорено на лекции
    private String email; // ііі. Емейл
    private long telephone; // іv. Телефон
    // ↓ Изменяемые:
    private String surname; // і. Фамилия
    private Double theWeight; // іі. Вес
    private String pressure;  /*ііі. Давление. В данном случае будет вот так: "120-80"
                              Но возможно и двумя интами: int upperBloodPressure; и int lowerBloodPressure;*/
    private int numberOfStepsTakenPerDay; // іv. Количество пройденных за день шагов

    private int age; // возраст пользователя

    public FitnessTracker(String name, int dateOfBirthDay, int dateOfBirthMonth, int dateOfBirthYear, String email,
                          long telephone, String surname, Double theWeight, String pressure, int numberOfStepsTakenPerDay) {
        this.name = name;
        this.dateOfBirthDay = dateOfBirthDay;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.dateOfBirthYear = dateOfBirthYear;
        this.email = email;
        this.telephone = telephone;
        this.surname = surname;
        this.theWeight = theWeight;
        this.pressure = pressure;
        this.numberOfStepsTakenPerDay = numberOfStepsTakenPerDay;
    }

    // ↓ геттеры для получения значения поля (переменных) класса
    public String getName() {
        return name;
    }

    public int getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public int getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public int getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public String getEmail() {
        return email;
    }

    public long getTelephone() {
        return telephone;
    }

    public int getAge() {
        return age;
    } // По условию надо было создать геттер age (getAge()) п.4 задачи, но по факту для выполнения цели задачи он не нужен

    // ↓ сеттеры изменения значения поля (переменных) класса
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTheWeight(Double theWeight) {
        this.theWeight = theWeight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setNumberOfStepsTakenPerDay(int numberOfStepsTakenPerDay) {
        this.numberOfStepsTakenPerDay = numberOfStepsTakenPerDay;
    }

    void printAccountInfo(FitnessTracker fitnessTracker) {
        System.out.println("Имя: " + fitnessTracker.name + ", дата рождения: " +
                fitnessTracker.dateOfBirthDay + "." + fitnessTracker.dateOfBirthMonth + "." + fitnessTracker.dateOfBirthYear + ", емейл: "
                + fitnessTracker.email + ", телефон: " + fitnessTracker.telephone + ", фамилия: " + fitnessTracker.surname + ", вес: " +
                fitnessTracker.theWeight + ", давление: " + fitnessTracker.pressure + ", количество пройденных за день шагов: " +
                fitnessTracker.numberOfStepsTakenPerDay + ", возраст пользователя: " + age + ".");
    }

    void defendingTheAge(int age) {
        this.age = YEAR_CONSTANT - age;
    }
    /*
    Метод defendingTheAge можно было и не создавать. А его логику вставить в начало метода printAccountInfo. Тогда бы
    бизнес логика метода main была бы локаничнее. Но по названию понятно что метод printAccountInfo создан только для
    печатати информации акаунта, кроме того самое важное то что методы должны быть максимально короткими и универсальными.
    */
}
