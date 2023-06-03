package lesson8.task4;

public class StringArray {

    public static void main(String[] args) {

        //Создать массив типа String с размером 7. Записать в него
        // значения дней недели. Вывести на консоль значение последнего элемента
        String[] weekArray = {"Ponedelnik", "Wtornik", "Sreda", "Czetverg", "Pjatnica", "Subbota", "Voskresenie"};
        System.out.println(weekArray[6]);
        System.out.println();

        lastDay();
        daysLast();



    }
    public static void lastDay(){

        String[] week1Array = new String[7];
        week1Array[0] = "Ponedelnik";
        week1Array[1] = "Wtornik";
        week1Array[2] = "Sreda";
        week1Array[3] = "Czetverg";
        week1Array[4] = "Piatnica";
        week1Array[5] = "Subbota";
        week1Array[6] = "Voskresenie1";
        System.out.println(week1Array[6]);
        System.out.println();
    }

    public static void daysLast(){

        String[] daysLastWeek = {"Ponedelnik", "Wtornik", "Sreda", "Czetverg", "Pjatnica", "Subbota", "Voskresenie2"};

        System.out.println(daysLastWeek[daysLastWeek.length -1]);
    }

}
