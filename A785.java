import java.util.*;
public class A785 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i =0 ;i<n; i++){
            String a = sc.next();
            if(a.equals("Tetrahedron")){
                c +=4;
            }else if(a.equals("Cube")){
                c = c+6;
            }else if(a.equals("Octahedron")){
                c = c+8;
            }else if(a.equals("Dodecahedron")){
                c = c+12;
            }else{
                c=c+20;
            }
        }
        System.out.print(c);

    }
}