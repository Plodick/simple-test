import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFibonacciUniversal {

    @DataProvider(name = "positive")
    public static Object[][] positiveTestData() {
        return new Object[][]{
                {-10, -55},
                {-5, 5},
                {-2, -1},
                {-1, 1},
                {0, 100}, // намеренный косяк
                {1, 100}, //еще один
                {2, 1},
                {5, 5},
                {10, 55}
        };
    }

    @Test(dataProvider = "positive")
    public void fibonacciPositiveTest(final int num, final int expectedAnswer) {

        Assert.assertEquals(Fibonacci.fibonacciUniversal(num), expectedAnswer,
                "Полученное число Фибоначчи не совпадает с ожидаемым.");
    }
}
