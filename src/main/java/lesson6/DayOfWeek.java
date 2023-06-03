package lesson6;

public class DayOfWeek {

    public static void main(String[] args) {

        int day = 7;

        switch (day){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("средв");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("ERROR");
                break;


        }
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("ERROR6");
                break;

        }
    }
}

