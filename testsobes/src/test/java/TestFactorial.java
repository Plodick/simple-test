import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFactorial {

    @DataProvider(name = "positive")
    public static Object[][] positiveTestData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {5, 120},
                {10, 3628800},
        };
    }

    @DataProvider(name = "negative")
    public static Object[] negativeTestData() {
        return new Object[]{-1, -5, -10};
    }

    @Test(dataProvider = "positive")
    public void factorialPositiveTest(final int num, final int expectedAnswer) {

        Assert.assertEquals(Factorial.factorial(num), expectedAnswer,
                "Ответ функции факториала не совпадает с ожидаемым.");
    }

    @Test(dataProvider = "negative")
    public void factorialNegativeTest(final int num) {
        boolean testResult = true;
        try {
            Factorial.factorial(num);
        } catch (ArithmeticException e) {
            testResult = false;
        }
        Assert.assertFalse(testResult, "Функция принимает недопустимые значения. ");
    }
}
