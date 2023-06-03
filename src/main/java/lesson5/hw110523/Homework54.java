package lesson5.hw110523;

import java.util.Random;

public class Homework54 {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(28801); // Генерация случайного числа от 0 до 28800
        int hours = n / 3600; // Перевод в полные часы

        System.out.println("Осталось: " + n + " секунд"); // Вывод значения в секундах


        // Вывод фразы о количестве полных часов
        if (hours < 1){
            System.out.println("Осталось менее часа");
        // Правильное склонение при выводе в консоль слова час
        }else  if (hours == 1){
            System.out.println("Осталось: " + hours +" час.");
        }else  if (hours >= 2 && hours <= 4){
            System.out.println("Осталось: " + hours + " часа.");
        }else {
            System.out.println("Осталось: " + hours + " часов.");
        }
    }
}
