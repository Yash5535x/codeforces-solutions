import java.util.*;

public class A231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int cout  = 0;  
        for(int j = 0;j<t;j++) {
            int c = 0;
            int a = sc.nextInt();
            c +=a;
            int b = sc.nextInt();
            c +=b;
            int d = sc.nextInt();
            c +=d;
            if(c>1){
            cout +=1;
        }
        }

        System.out.println(cout);
    }
}
