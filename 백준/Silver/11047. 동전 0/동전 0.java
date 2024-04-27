import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt   = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] coins = new int[cnt];

        for(int i = 0 ; i < cnt ; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        for(int j = cnt - 1 ; j >= 0 ; j--){
            if(coins[j] <= money){
                result += (money / coins[j]);
                money = money % coins[j];
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}
