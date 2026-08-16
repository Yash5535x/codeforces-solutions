import java.util.*;

public class A996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int count =0;
        int[] note = {100,20,10,5,1};

        for(int i :note){
            count += (r/i) ;
            r =r %i;
        }
        System.out.print(count);
        
    }
}
