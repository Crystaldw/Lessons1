package lesson4.hw80523;

import java.util.Scanner;

public class Homework41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два слова состоящих из четного колличества букв!");
        System.out.println("Введите первое слово:");
        String slovo1 = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String slovo2 = scanner.nextLine();
        int polPervogo = slovo1.length()/2;
        int polVtorogo = slovo2.length()/2;
//        System.out.println("Первая половина первого слова: " + polPervogo);
//        System.out.println("Вторая половина второго слова:" + polVtorogo);
        String result = slovo1.substring(0, polPervogo) + slovo2.substring(polVtorogo);
        System.out.println("Слово которое получилось:");
        System.out.println(result.toUpperCase());

    }
}
