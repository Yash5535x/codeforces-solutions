import java.util.*;
import java.util.Arrays;
public class A160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            total +=arr[i];
        }
    
        Arrays.sort(arr);
        int mySum = 0, count = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            mySum += arr[i];
            count++;
            if (mySum > total - mySum) {
                break;
            }
        }
        
        System.out.println(count); 
    }
}
