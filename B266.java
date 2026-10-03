import java.util.*;

public class B266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();
        
        for (int k = 0; k < t; k++) {
            for (int i = 0; i < n-1; i++) {
                if (arr[i] == 'B' && arr[i+1] == 'G') {
                    char temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    i++; // skip next
                }
            }
        }
        
        System.out.println(new String(arr));
    }
}
