public class Fibonacci {

    public static int fibonacci(int num) {
        if (num < 1) {
            throw new ArithmeticException("Нет числа Фибоначчи под таким номером.");
        }
        return (num <= 2) ? 1 : fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int fibonacciUniversal(int num) {
        if (num == 0) return 0;
        if (num > 0) {
            return (num <= 2) ? 1 : fibonacciUniversal(num - 1) + fibonacciUniversal(num - 2);
        } else {
            return (num == -1) ? 1 : fibonacciUniversal(num + 2) - fibonacciUniversal(num + 1);
        }
    }
}
