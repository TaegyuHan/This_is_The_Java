package ch3;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b \n", a != 0 || ++b != 0); // true

        System.out.printf("a=%d, b=%d \n", a, b); // 5, 1
        System.out.printf("a==0 && ++b!=0 = %b\n", a==0 && ++b!=0); // false

        System.out.printf("a=%d, b=%d\n", a, b);

    }
}
