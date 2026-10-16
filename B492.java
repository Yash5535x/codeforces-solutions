import java.util.*;

public class B492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt();
        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++) lanterns[i] = sc.nextInt();
        
        Arrays.sort(lanterns);
        
        double maxGap = 0;
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, lanterns[i] - lanterns[i-1]);
        }
        
        double edgeLeft = lanterns[0];
        double edgeRight = l - lanterns[n-1];
        
        double ans = Math.max(maxGap/2.0, Math.max(edgeLeft, edgeRight));
        System.out.printf("%.10f\n", ans);
    }
}
