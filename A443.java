import java.util.*;

public class A443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(ch);
            }
        }
        
        System.out.println(set.size());
    }
}
