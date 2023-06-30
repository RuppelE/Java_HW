import java.util.Scanner;
//first task
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int triangularNumber = FirstTask.calculateTriangularNumber(n);
        System.out.println("n-ое треугольное число: " + triangularNumber);

        int factorial = FirstTask.calculateFactorial(n);
        System.out.println("Факториал числа n: " + factorial);
    }
}
*/
//second task
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (SecondTask.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
*/

// third task
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция!");
                return;
        }

        System.out.println("Результат: " + result);
    }
}

