import java.util.*;

public class A1901 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int prev = 0;
            int ans = 0;
            int last = 0;

            for (int i = 0; i < n; i++) {
                int pos = sc.nextInt();
                ans = Math.max(ans, pos - prev);
                prev = pos;
                last = pos;
            }

            ans = Math.max(ans, 2 * (x - last));

            System.out.println(ans);
        }
    }
}