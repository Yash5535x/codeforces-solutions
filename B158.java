import java.util.*;

public class B158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[5];
        
        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            count[g]++;
        }
        
        int taxis = count[4]; // groups of 4
        taxis += count[3];    // groups of 3
        count[1] = Math.max(0, count[1] - count[3]);
        
        taxis += count[2] / 2;
        if (count[2] % 2 == 1) {
            taxis++;
            count[1] = Math.max(0, count[1] - 2);
        }
        
        if (count[1] > 0) {
            taxis += (count[1] + 3) / 4;
        }
        
        System.out.println(taxis);
    }
}
