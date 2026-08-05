import java.util.Scanner;

public class A1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            int frist = (s.charAt(0)-'0') + (s.charAt(1)-'0') + (s.charAt(2)-'0');
            int last = (s.charAt(3)-'0')+(s.charAt(4)-'0')+(s.charAt(5)-'0');

            if(frist==last){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}