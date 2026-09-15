import java.util.*;

public class C4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of test cases
        List<String> user = new ArrayList<>();
        int cout =0;
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if(user.contains(a)){
                System.out.println(a+1);
            }else{
                user.add(a);
                System.out.println("OK");
        }
            
            
        }
    }
}
