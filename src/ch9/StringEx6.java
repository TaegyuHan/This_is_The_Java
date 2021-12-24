package ch9;

public class StringEx6 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double dVal = 200.0;
        String strVal2 = dVal + "";

        double sum1 = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf("+" + strVal) + Double.parseDouble(strVal2);

        System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum1);
        System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum2);
    }
}
