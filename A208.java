import java.util.*;

public class A208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String song = s.replace("WUB", " ");
        song = song.trim().replaceAll("\\s+", " ");
        
        System.out.println(song);
    }
}
