package maxprime;

import java.util.Scanner;

public class MaxPrimeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] primes = new boolean[n+1];

        for (int i = 2; i <=n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i*i <=n; i++) {
            if (primes[i]) {
                for (int j = i; i * j <= n; j++) {
                    primes[i * j] = false;
                }
            }
        }

        int primeCount = 0;
        int lastPrime = 2;
        for (int i = 0; i <=n; i++) {
            if (primes[i]) {
                primeCount++;
                lastPrime = i;
            }
        }
        System.out.println("the number <=N, primeCount is " + primeCount);
        System.out.println("last one is " + lastPrime);


    }



}
