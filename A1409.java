import java.util.*;

public class A1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = Math.abs(a - b);
            int moves = (diff + 9) / 10; // ceil division
            System.out.println(moves);
        }
    }
}
