import java.util.Scanner;

public class A977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int s = sc.nextInt();
        int n = sc.nextInt(); 
        for(int i=0;i<n;i++){
            if(s%10==0){
                s=s/10;
            }
            else{
                s=s-1;
            }
        }
        System.out.print(s);
        sc.close();
    }
}