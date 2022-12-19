package chapter06;


class PrimitiveParamEx {
    public static void main(String[] args) {
        DataExample d = new DataExample();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {  // ±âº»Çü ¸Å°³º¯¼ö
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}