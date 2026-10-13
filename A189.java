import java.util.*;

public class A189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i >= a && dp[i-a] != -1) dp[i] = Math.max(dp[i], dp[i-a] + 1);
            if (i >= b && dp[i-b] != -1) dp[i] = Math.max(dp[i], dp[i-b] + 1);
            if (i >= c && dp[i-c] != -1) dp[i] = Math.max(dp[i], dp[i-c] + 1);
        }
        
        System.out.println(dp[n]);
    }
}
