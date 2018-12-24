import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFibonacci {

    @DataProvider(name = "positive")
    public static Object[][] positiveTestData() {
        return new Object[][]{
                {1, 1},
                {2, 1},
                {5, 5},
                {10, 55}
        };
    }

    @DataProvider(name = "negative")
    public static Object[] negativeTestData() {
        return new Object[]{0, -1, -5, -10};
    }

    @Test(dataProvider = "positive")
    public void fibonacciPositiveTest(final int num, final int expectedAnswer) {

        Assert.assertEquals(Fibonacci.fibonacci(num), expectedAnswer,
                "Полученное число Фибоначчи не совпадает с ожидаемым.");
    }

    @Test(dataProvider = "negative")
    public void fibonacciNegativeTest(final int num) {
        boolean testResult = true;
        try {
            Fibonacci.fibonacci(num);
        } catch (ArithmeticException e) {
            testResult = false;
        }
        Assert.assertFalse(testResult, "Функция принимает недопустимые значения. ");
    }
}
