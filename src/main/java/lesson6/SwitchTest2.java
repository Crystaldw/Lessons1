package lesson6;

public class SwitchTest2 {

    public static void main(String[] args) {

        int i = 1;
        String word = "Hello";
        String forCase = "Word";

        switch (word){
            case "Java":
                System.out.println("i = 1");
                break;
            case "Hello":
                System.out.println("i = 2");
                break;
            default:
                System.out.println("Это какоето другое слово");
                break;
        }
    }
}
