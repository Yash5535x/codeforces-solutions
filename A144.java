import java.util.*;

public class A144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxVal = arr[0], maxIdx = 0;
        int minVal = arr[0], minIdx = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIdx = i;
            }
            if (arr[i] <= minVal) {   // rightmost shortest
                minVal = arr[i];
                minIdx = i;
            }
        }
        
        int swaps = maxIdx + (n - 1 - minIdx);
        if (maxIdx > minIdx) swaps--;
        
        System.out.println(swaps);
    }
}
