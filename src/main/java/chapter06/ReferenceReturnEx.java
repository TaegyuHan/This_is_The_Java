package chapter06;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        DataExample d = new DataExample();
        d.x = 10;

        DataExample d2 = copy(d);
        System.out.println("d.x  = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static DataExample copy(DataExample d) {
        DataExample tmp = new DataExample();
        tmp.x = d.x;
        return tmp;
    }
}