package narcissus;

import java.util.Scanner;

public class Narcissus {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 100; i <= n; i++) {
            int a = i%10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }


}
