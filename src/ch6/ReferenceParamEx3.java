package ch6;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4};

        printArr(arr);
        sumArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i] + ',');
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i=0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    static void sortArr(int[] arr) {
        for (int i=0; i < arr.length; i++)
            for (int j=0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
    }
}
