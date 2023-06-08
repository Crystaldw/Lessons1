package lesson11.task6;

public class Test {

    static Flyable somethingFlyable = new Flyable() {
        @Override
        public void fly() {
            System.out.println("Чтото летающее летит");
        }
    };
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();


        somethingFlyable.fly();
    }
}
