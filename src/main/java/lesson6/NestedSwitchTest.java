package lesson6;

public class NestedSwitchTest {

    public static void main(String[] args) {

        String storageName ="Beta";
        int gateNumber = 3;

        switch (storageName){
            case "Alpha":
                System.out.println("sklad Alpha");
                break;
            case "Beta":
                System.out.println("sklad Beta");
                switch (gateNumber){
                    case 1:
                        System.out.println("Vorota 1");
                        break;
                    case 2:
                        System.out.println("Vorota 2");
                        break;
                    case 3:
                        System.out.println("Vorota 3");
                        break;
                    default:
                        System.out.println("Error net vorot");
                        break;
                }
                break;
            case "Gamma":
                System.out.println("sklad Gamma");
                break;
            default:
                System.out.println("Error net sklada");
        }
    }
}
