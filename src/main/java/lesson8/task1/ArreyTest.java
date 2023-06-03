package lesson8.task1;

import java.util.Arrays;

public class ArreyTest {

    public static void main(String[] args) {

        int[] intArrey = new int[10];
        double[] doubleArrey;
        boolean[] booleanArrey;

        int[] intArrey1 = {7, 2, 8, 9, 2, 5, 7, 1, 0};

        intArrey[5] = 15;

        System.out.println(intArrey[5]);

        System.out.println(intArrey1[3]);

        System.out.println("Вывод всех значений масива с помощью цикла:");

        for (int i = 0; i < intArrey1.length; i++){
            System.out.println(i + 1 + "."+ intArrey1[i]);
        }

        System.out.println("Вывод всех значений масива с помощью for-each:");

        for (int value : intArrey1){
            System.out.println(value);
        }

        System.out.println("Вывод всех значений с помощью метода класа Arreys:");
        System.out.println(Arrays.toString(intArrey1));

        System.out.println("Вывод всех значений с конца массива через одну ячейку");

        for (int i = intArrey1.length - 1; i >= 0; i -= 2){
            System.out.println(intArrey1[i]);
        }
    }
}
