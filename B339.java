import java.util.*;

public class B339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] tasks = new int[m];
        for (int i = 0; i < m; i++) tasks[i] = sc.nextInt();
        
        long time = 0;
        int current = 1;
        
        for (int t : tasks) {
            if (t >= current) {
                time += t - current;
            } else {
                time += n - current + t;
            }
            current = t;
        }
        
        System.out.println(time);
    }
}
