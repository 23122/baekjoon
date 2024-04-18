import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br     = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw     = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st     = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());

        int[][] people = new int[cnt][2];
        int[]   ranks  = new int[cnt];

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < cnt; i++) {
            int rank = 1;
            for (int j = 0; j < cnt; j++) {
                if (i == j) continue;
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }

        for(int rank : ranks){
            bw.write(rank + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

