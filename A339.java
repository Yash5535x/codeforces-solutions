import java.util.*;

public class A339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] parts = s.split("\\+");
        Arrays.sort(parts);

        System.out.println(String.join("+",parts));
       


    }}