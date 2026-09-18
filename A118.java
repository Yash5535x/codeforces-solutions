import java.util.*;

public class A118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        for (char c : s.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' || c == 'y') {
                continue;
            }

            System.out.print("." + c);
        }

        sc.close();
    }
}