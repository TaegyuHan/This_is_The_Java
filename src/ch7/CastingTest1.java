package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireFengine fe = new FireFengine();
        FireFengine fe2 = null;

        fe.water();
        car = fe;
        // car.water();

        fe2 = (FireFengine) car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireFengine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
