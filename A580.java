import java.util.*;

public class A580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int maxLen = 1, currLen = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i-1]) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }
        
        System.out.println(maxLen);
    }
}
