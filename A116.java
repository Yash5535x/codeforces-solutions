import java.util.*;

public class A116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0, maxPassengers = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            current = current - a + b;
            maxPassengers = Math.max(maxPassengers, current);
        }
        
        System.out.println(maxPassengers);
    }
}
