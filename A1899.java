import java.util.*;

public class A1899{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();

        for(int i =0; i<a ; i++){
            int p = sc.nextInt();
            if(p%3==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
} 