import java.util.*;

public class A1999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of test cases
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            
            // convert to string
            String str = Integer.toString(a);
            
            // first digit
            char y = str.charAt(0);  
            int num = Character.getNumericValue(y);
            
            // second digit
            char b = str.charAt(1);
            int op = Character.getNumericValue(b);
            
            // sum of digits
            int p = num + op;
            System.out.println(p);
        }
    }
}
