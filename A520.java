import java.util.*;
import java.util.Scanner;

public class A520{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next().toLowerCase();

        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }
        if(set.size()==26){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        
    }
}