import java.util.*;

public class A732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int total = i * k;
            if (total % 10 == r || total % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
