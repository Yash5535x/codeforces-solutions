import java.util.*;

public class A281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String result = s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println(result);
    }
}
