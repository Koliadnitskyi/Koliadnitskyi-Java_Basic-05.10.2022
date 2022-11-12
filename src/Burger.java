public class Burger {
    String bun;
    int amountOfMeat; // переменная обектов (экземпляра класса) созданна для возможности указывать количестко мяса в бургере
                      // дайот возможность создать 3-й конструктор и выполнить условие задачи
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
/*Пробовал другими путями выполнить:
    - создавал static метод который возможно вызывать без создания обекта (экземпляра) класса, потом
      вызвывал его в конструкторе и определял что пришло meat или doubleMeat и далее сложная логика
    - пробовал через boolean doubleMeat (через static метод и без него внутри конструктора) который в зависимомти
      от того что пришло менял на false или true (условную инструкцию if (if else)) и далее сложная логика в конструкторе
    - пробовал через тернарную операцию (через static метод и без него внутри конструктора), типа так:
                        boolean doubleMeat;
                        String meat = meat ? doubleMeat = false : true;
                        и далее сложная логика
   Были и другие интересные способы но в результате выходило масло масленное, так как конструкторов было всего
   2 (первый и третий вариант бургеров передавался первому конструктору) а по условию задачи их должно быть ТРИ:
                   a. обычный бургер (все компоненты)
                   b. диетический бургер (без майонеза)
                   c. с двойным мясом
   Таким образом 3-й конструктор не создавался, что есть нарушение условий задачи.
    */