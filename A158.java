import java.util.*;

public class A158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        int cutoff = scores[k-1];
        int count = 0;
        for (int x : scores) {
            if (x >= cutoff && x > 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
