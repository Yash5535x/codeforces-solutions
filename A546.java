import java.util.*;

public class A546{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int o = k*((w*(w+1))/2);
        int c = Math.max(0,o-n);
        System.out.print(c);
    }
}
