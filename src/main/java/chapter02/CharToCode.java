package chapter02;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = ch;
        System.out.printf("%c=%d(%#x)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#x)%n", ch, (int)hch, (int)hch);
    }
}