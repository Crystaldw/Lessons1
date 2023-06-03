package lesson5.task2;

public class LogicalTest {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 2;
        int d = 0;

        System.out.println(a > b && b == c);
        // false && true - false

        System.out.println(a > b || b == c);
        // false || true - true

        System.out.println(!(a < b));
        //!true == НЕ true - false
    }
}
