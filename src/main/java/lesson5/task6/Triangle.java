package lesson5.task6;

public class Triangle {

    public static void main(String[] args) {


        int a = 5;
        int b = 2;
        int c = 5;

        if (a != b && b != c && a != c){
            System.out.println("Разносторонний. ");
        } else if (a == b && a == c) {
            System.out.println("Равносторонний");
        } else {
            System.out.println("Равнобедренный");
        }


    }
}
