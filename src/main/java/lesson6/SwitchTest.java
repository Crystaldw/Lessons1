package lesson6;

public class SwitchTest {

    public static void main(String[] args) {

        int i = 3;

        switch (i) {
            case 1:
                System.out.println("i равно 1");
                break;
            case  2:
//                System.out.println("i равно 2");
//                break;
            case  3:
                System.out.println("i рвно 2 или 3");
                break;
            case 5:
                System.out.println("i равно 5");
                break;
            case 6:
                System.out.println("i равно 6");
                break;
            default:
                System.out.println("i не равняется ни одному из значений");
                break;
        }

        System.out.println("Конец программы");

    }
}
