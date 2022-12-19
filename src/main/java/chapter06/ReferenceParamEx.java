package chapter06;

public class ReferenceParamEx {
    public static void main(String[] args) {

        DataExample d = new DataExample();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(DataExample d) { // ÂüÁ¶Çü ¸Å°³º¯¼ö
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
