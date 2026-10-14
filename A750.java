import java.util.*;

public class A750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int timeLeft = 240 - k;
        int total = 0, count = 0;
        
        for (int i = 1; i <= n; i++) {
            total += 5 * i;
            if (total <= timeLeft) {
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(count);
    }
}
