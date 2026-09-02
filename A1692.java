import java.util.*;
public class A1692{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i<n;i++){ 
            int count = 0;       
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<b){
                count++;
            }
            int c = sc.nextInt();
            if(a<c){
                count++;
            }
            int d = sc.nextInt();
            if(a<d){
                count++;
            }
            System.out.println(count);
        }
        
       
    }
}