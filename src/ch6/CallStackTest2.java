package ch6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        fristMethod();
        System.out.println("main(String[] args)이 끝났음.");
    }

    static void fristMethod() {
        System.out.println("fristMethod()이 시작되었음.");
        secondMethod();
        System.out.println("fristMethod()이 끝났음.");
    }

    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음.");
        System.out.println("secondMethod()");
        System.out.println("secondMethod()이 끝났음.");
    }
}