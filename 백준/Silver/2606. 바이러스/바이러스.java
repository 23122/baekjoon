import java.io.*;
import java.util.*;

public class Main {

    private static boolean[][] connect;
    private static boolean[] visit;
    private static int computers;
    private static int network;
    private static int virus = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        computers = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        
        network = Integer.parseInt(st.nextToken());
        connect = new boolean[computers+1][computers+1];
        visit   = new boolean[computers+1];

        for(int i = 0 ; i < network ; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to   = Integer.parseInt(st.nextToken());
            connect[from][to] = true;
            connect[to][from] = true;
        }
        
        dfs(1);
        bw.write(String.valueOf(virus));
        bw.flush();
        br.close();
        bw.close();
    }

    static void dfs(int from){
        visit[from] = true;
        for (int to = 1 ; to <= computers ; to++){
            if(connect[from][to] && !visit[to]){
                virus++;
                dfs(to);
            }
        }
    }

}
