import java.util.*;

public class B230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 1000000;
        boolean[] isPrime = new boolean[limit+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i*i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        HashSet<Long> tPrimes = new HashSet<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                tPrimes.add((long)i*i);
            }
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            System.out.println(tPrimes.contains(num) ? "YES" : "NO");
        }
    }
}
