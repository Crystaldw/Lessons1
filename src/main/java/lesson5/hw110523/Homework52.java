package lesson5.hw110523;

public class Homework52 {

    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        boolean canBay = isEdekaOpen || isReweOpen;

        System.out.println("Я могу купить еду: " + canBay);
    }
}
