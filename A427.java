import java.util.*;

public class A427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int police = 0, untreated = 0;
        
        for (int i = 0; i < n; i++) {
            int e = sc.nextInt();
            if (e > 0) {
                police += e;
            } else {
                if (police > 0) {
                    police--;
                } else {
                    untreated++;
                }
            }
        }
        
        System.out.println(untreated);
    }
}
