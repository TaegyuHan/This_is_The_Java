package ch9;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class StringEx5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTP-8: " + joinByteArr(bArr));
        System.out.println("UTP-8: " + joinByteArr(bArr));

        System.out.println("UTF-8: " + new String(bArr, "UTF-8"));
        System.out.println("UTF-8: " + new String(bArr, "CP949"));
    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr)
            sj.add(String.format("%20X", b));
        return sj.toString();
    }
}
