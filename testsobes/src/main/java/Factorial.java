public class Factorial {

    public static int factorial(final int num) {
        if (num < 0) {
            throw new ArithmeticException("Значение числа под факториалом меньше нуля.");
        }
        return num <= 1 ? 1 : factorial(num - 1) * num;
    }
}
