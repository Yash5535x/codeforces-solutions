import java.util.Scanner;
import java.util.*;
public class A236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for( char c: s.toCharArray()){
            set.add(c);
        }
        if(set.size()%2==0){

         System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}