public class Burger {
    String bun;
    int amountOfMeat; /*переменная обектов (экземпляра класса) додолнительно созданна для возможности указывать количестко мяса в бургере
    дайот возможность создать 3-й конструктор где бургер с двойным мясом и выполнить условие задачи (наличие 3!!! конструкторов)*/
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Вариант а: обычный бургер (все компоненты). Его состав: "
                + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Вариант b: диетический бургер (без майонеза). Его состав: "
                + bun + ", " + meat + ", " + cheese + ", " + greens + ".");
    }

    public Burger(String bun, int amountOfMeat, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.amountOfMeat = amountOfMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Вариант c: с двойным мясом. Его состав: "
                + bun + ", " + amountOfMeat + " " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ".");
    }
}
