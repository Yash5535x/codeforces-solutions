import java.util.*;

public class A381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int l=n-1;
        int sj=0 , di =0;
        boolean turn = true;

        while(s<=l){
            int pick ;
            if(arr[s]>=arr[l]){
                pick = arr[s];
                s++;
            }else{
                pick = arr[l];
                l--;
            }
        
            if (turn) sj += pick;
            else di += pick;

            turn = !turn;
        }
        System.out.println(sj+" "+di); 
    }
}
