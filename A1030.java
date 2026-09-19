import java.util.*;

public class A1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;
        
        for (int i = 0; i < n; i++) {
            int opinion = sc.nextInt();
            if (opinion == 1) {
                hard = true;
            }
        }
        
        System.out.println(hard ? "HARD" : "EASY");
    }
}
