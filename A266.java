import java.util.Scanner;

public class A266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int n = sc.nextInt();
        String s = sc.next(); 
        for(int i=1;i<n;i++){
            if(s.charAt(i)== s.charAt(i-1)){
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}