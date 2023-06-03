package lesson5.task5;

public class IfElseTest {

    public static void main(String[] args) {

        System.out.println("Начало программыю");
        int a = 16;
        int b = 15;

        if (a==b) {
            System.out.println("a=b");
        }else {
            System.out.println("a ne ravno b.");
        }

        System.out.println();
        System.out.println("Упражнение 2");

        if (a > b){
            System.out.println("a>b");
            if (a % 2 == 0){
                System.out.println("И при этом оно четное");
            }
        }


        System.out.println("Конец программы");

    }
}
