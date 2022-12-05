package chapter02;

/**
 * 작성날짜: 2022-12-05
 * 작성자: 한태규
 * 내용: 변수에 자장된 값 교환하기
 */
public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp;

        System.out.println("X: " + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y:" + y);
    }
}
