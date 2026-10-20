import java.io.*;
import java.util.*;

public class B706 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] prices = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(prices);

        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            int m = Integer.parseInt(br.readLine());

            int left = 0, right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;

                if (prices[mid] <= m) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            sb.append(left).append("\n");
        }

        System.out.print(sb);
    }
}