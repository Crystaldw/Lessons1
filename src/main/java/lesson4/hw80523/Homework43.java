package lesson4.hw80523;

import java.util.Scanner;

public class Homework43 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Обменник EUR/USD");

        double kurs = 1.18;

        System.out.println("Укажите сколько EUR вы хотите обменять на USD: ");

        double euro = scanner.nextDouble();
        double result = kurs * euro;
        System.out.println("Вы получите: " + result +" USD");

    }
}
