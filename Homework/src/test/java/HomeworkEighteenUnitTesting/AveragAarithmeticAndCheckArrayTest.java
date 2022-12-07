package HomeworkEighteenUnitTesting;

import org.junit.*;

public class AveragAarithmeticAndCheckArrayTest {
    AveragAarithmeticAndCheckArray test = new AveragAarithmeticAndCheckArray();

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Начинаем тестировать класс. В BeforeClass можно добавить бизнес логику по необходимости.");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Весь класс протестирован. В AfterClass можно добавить бизнес логику по необходимости.");
    }

    @Before
    public void setUp() {
        System.out.println("Начинаем тестировать метод. В Before можно добавить бизнес логику по необходимости.");
    }

    @After
    public void tearDown() {
        System.out.println("Метод протестирован. В After можно добавить бизнес логику по необходимости.");
    }

    @Test
    public void countingArithmeticMeanOfElementsOfArrayPositive() {
        Integer[][] arraysJava = {{44, 1, 2}, {78, 2, 12}, {3, 12, 4}};
        Assert.assertEquals(17.5555556, test.countingArithmeticMeanOfElementsOfArray(arraysJava), 0.0000001);
    }

    @Test
    public void countingArithmeticMeanOfElementsOfArrayPositiveTwo() {
        Integer[][] arraysJavaThree = null;
        Assert.assertEquals(0, test.countingArithmeticMeanOfElementsOfArray(arraysJavaThree), 0.0000001);
    }

    @Test
    public void checkIfMatrixIsSquarePositive() {
        Integer[][] arraysJava = {{44, 1, 2}, {78, 2, 12}, {3, 12, 4}};
        Assert.assertTrue(test.checkIfMatrixIsSquare(arraysJava));
    }

    @Test
    public void checkIfMatrixIsSquarePositiveTwo() {
        Integer[][] arraysJavaTwo = {{44, 1, 2}, {3, 12, 4}};
        Assert.assertFalse(test.checkIfMatrixIsSquare(arraysJavaTwo));
    }
}