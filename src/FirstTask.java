//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
public class FirstTask {
    // Метод для вычисления треугольного числа
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Добавляем текущее число к сумме
        }
        return sum;
    }

    // Метод для вычисления факториала числа
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Умножаем текущее число на факториал
        }
        return factorial;
    }
}

