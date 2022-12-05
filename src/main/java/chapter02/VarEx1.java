package chapter02;

/**
 * 작성날짜: 2022-12-05
 * 작성자: 한태규
 * 내용: 변수선언 및 초기화
 */
public class VarEx1 {

    public static void main(String[] args) {
        int yaer = 0;
        int age = 14;

        System.out.println(yaer);
        System.out.println(age);

        yaer = age + 2000;
        age = age + 1;

        System.out.println(yaer);
        System.out.println(age);
    }
}