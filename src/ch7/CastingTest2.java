package ch7;

public class CastingTest2 {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = null;
        FireFengine fe = null;

        car.drive();
        fe = (FireFengine) car;
        fe.drive();

        car2 = fe;
        car2.drive();
    }
}
