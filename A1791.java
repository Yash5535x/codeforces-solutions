import java.util.*;
import java.util.Scanner;

public class A1791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Character> valid = new HashSet<>(Arrays.asList('c','o','d','e','f','r','s')); 
        for(int i = 0 ; i<n;i++){

            char ch = sc.next().charAt(0);
            if (valid.contains(ch)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}