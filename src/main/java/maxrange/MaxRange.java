package maxrange;

import java.util.Scanner;

public class MaxRange {

    public static int maxValue = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

//        System.out.println(getMax(arr, 0, n-1));
        System.out.println(getMax(arr));

    }

    private static int getMax(int[] arr) {
        if (arr.length == 0) {
            return maxValue;
        }
        return 0;

        //todo
//        int minValue = minInArr(arr);

    }

//    public static int getMax(int[] arr, int start, int end) {
//
//    }
}
