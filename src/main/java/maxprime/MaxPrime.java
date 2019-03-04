package maxprime;

import java.util.Scanner;

public class MaxPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 2) {
            System.out.println(0);
        }
        for (int i = n; i >= 2; i--) {
            boolean flag = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("the max prime is " + i);
                break;
            }
        }
    }
}
