import java.util.Scanner;

public class A1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
      
        while(n-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            long move = (b - a%b)%b;
            System.out.println(move);

        }

    }}