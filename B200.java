import java.util.*;

public class B200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x =0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            x = x + a;

            
        }
        double result = x / n;
        System.out.printf("%.12f\n", result);  // high precision
    }
}
