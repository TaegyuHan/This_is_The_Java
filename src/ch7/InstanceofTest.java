package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireFengine fe = new FireFengine();

        if (fe instanceof FireFengine) {
            System.out.println("This is a FireEngine instance.");
        }
        if (fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }

        if (fe instanceof Object) {
            System.out.println("This is a Object instance.");
        }

        System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
    }
}