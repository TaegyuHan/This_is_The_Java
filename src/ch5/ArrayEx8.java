package ch5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int ball[] = new int[45];

        for (int i=0; i < ball.length; i++)
            ball[i] = i + 1;

        int temp = 0;
        int j = 0;

        for (int i=0; i < ball.length; i++) {
            j = (int) (Math.random() * 45);
            int tmp = ball[0];
            ball[0] = ball[i];
            ball[i] = tmp;
        }

        for (int i=0; i < 6; i++) {
            System.out.printf("ball[%d]=%d\n", i, ball[i]);
        }
    }
}
