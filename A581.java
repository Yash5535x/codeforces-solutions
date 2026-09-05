import java.util.*;

public class A581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();

        int a  = Math.min(r,b);
        
        int rs = Math.abs(r-b)/2;
        
        System.out.print(a+" "+rs);
        
    }
}
