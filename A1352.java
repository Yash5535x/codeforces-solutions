import java.util.*;

public class A1352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            List<Integer> res = new ArrayList<>();
            int len = n.length();
            for (int i = 0; i < len; i++) {
                char d = n.charAt(i);
                if (d != '0') {
                    int val = (d - '0') * (int)Math.pow(10, len - i - 1);
                    res.add(val);
                }
            }
            System.out.println(res.size());
            for (int x : res) System.out.print(x + " ");
            System.out.println();
        }
    }
}
