public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.close();

        try (Car car1 = new Car()) {
            drive();
        } catch (RuntimeException ignore) {
        }
    }

    private static void drive() {
        System.out.println("Mashina jurup jatat");
    }
}