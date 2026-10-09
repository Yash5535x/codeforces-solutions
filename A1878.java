import java.util.*;

public class A1878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        
        boolean found = false;
        for (int x : arr) {
            if (x == k) {
                found = true;
                break;
            }
        }
        
        System.out.println(found ? "YES" : "NO");
    }
}
