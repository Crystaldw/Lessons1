package lesson4.hw80523;

import java.util.Scanner;

public class Homework42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double plus = num1 + num2;
        double minus = num1 - num2;
        double umnozenie = num1 * num2;
        double delenie = num1 / num2;

        System.out.println("Результаты вычислений:");
        System.out.println("Сложение: " + plus);
        System.out.println("Вычитание: " + minus);
        System.out.println("Умножение: " + umnozenie);
        System.out.println("Деление: " + delenie);

    }
}
