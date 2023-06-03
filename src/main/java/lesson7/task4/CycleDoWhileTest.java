package lesson7.task4;

import java.util.Scanner;

public class CycleDoWhileTest {

    public static void main(String[] args) {

        //выбрать против кого играть
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("выберете режим игры.");
            System.out.println("1. против друг друга.");
            System.out.println("2. против компьютера.");
            System.out.println("3. Двое на двое.");
            System.out.println("4. Двое против компа.");

            //Если игрок выбрал неверное значение, например 4,
            //мы должны запустить цикл ещё раз, чтобы пользователь повторил выбор.

            option = scanner.nextInt();
            //option == 1 -> false || true -> true
            //option == 2 -> true || false -> true
            //option == 3 -> true || true -> true
        }while (option < 1 || option > 4);
//        while (option != 1 && option != 2 && option != 4 && option != 4);

    }
}
