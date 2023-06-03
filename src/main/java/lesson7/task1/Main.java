package lesson7.task1;

public class Main {

    public static void main(String[] args) {

        // вывести в консоль слово Привет 10 раз

        String word = "Привет";
//        int i = 3;

        for ( int i = 0; i < 10; i++){

            System.out.println(word);
        }
        //  i++
        //  i = i+1
//        System.out.println("Значенее переменной:" + i);
        System.out.println("Цикл прекратил работу");

        // Отобразить в консоли все числа от 10 до 1 в порядке убывания
        System.out.println("Задача 2");
        for (int i = 10; i >=1; i--){
            System.out.println(i + " ");
        }

        System.out.println();
//        for (int i = 0; i >=0; i++){
//            System.out.println("Бесконечный цикл");
//        }
        for (; ;){
            System.out.println("второй Бесконечный цикл");
        }
    }
}

