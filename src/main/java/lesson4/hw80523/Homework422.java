package lesson4.hw80523;

public class Homework422 {

    public static void main(String[] args) {
        int a = 100;
        int b = 7;

        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
    }
}