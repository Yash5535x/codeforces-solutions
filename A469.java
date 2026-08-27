import java.util.*;

public class A469{
public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    Set<Integer> levels = new HashSet<>();

    int p1 = sc.nextInt();
    for(int i =0; i<p1 ; i++){
        levels.add(sc.nextInt());
    }

    int p2 = sc.nextInt();
    for(int i =0; i<p2 ; i++){
        levels.add(sc.nextInt());
    }

    if(levels.size()==n){
        System.out.print("I become the guy.");
    }else{
        System.out.print("Oh, my keyboard!");
    }

   }
}