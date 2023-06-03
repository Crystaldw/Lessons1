package lesson6;

import java.util.Locale;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите язык: ru, de, en");

        String input = scanner.nextLine().toLowerCase();

        switch (input){
            case "ru":
                System.out.println("Russkij");
                break;
            case "en":
                System.out.println("English");
                break;
            case "de":
                System.out.println("Deutch");
                break;
            default:
                System.out.println("Hispanskij");
                break;
        }
    }
}
