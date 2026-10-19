import java.util.*;

public class A1829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            
            int maxLen = 0, currLen = 0;
            for (int x : arr) {
                if (x == 0) {
                    currLen++;
                    maxLen = Math.max(maxLen, currLen);
                } else {
                    currLen = 0;
                }
            }
            System.out.println(maxLen);
        }
    }
}
