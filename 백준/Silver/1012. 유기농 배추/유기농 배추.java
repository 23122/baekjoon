import java.io.*;
import java.util.*;

public class Main {

    private static int[][] ground;
    private static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < testCase ; i++){
            st = new StringTokenizer(br.readLine());
            int x      = Integer.parseInt(st.nextToken());
            int y      = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            ground = new int[x][y + 1];

            for(int j = 0 ; j < target ; j++){
                st = new StringTokenizer(br.readLine());
                int tx = Integer.parseInt(st.nextToken());
                int ty = Integer.parseInt(st.nextToken());
                ground[tx][ty] = 1;
            }
            visit = new boolean[x][y];
            int bug = 0;
            for(int n = 0 ; n < x ; n++) {
                for(int m = 0 ; m < y ; m++) {
                    if(ground[n][m]==1 && !visit[n][m]) {
                        dfs(n, m, x, y);
                        bug++;
                    }
                }
            }
            bw.write(String.valueOf(bug));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    static void dfs(int n, int m,int x, int y) {
        visit[n][m] = true;

        if(m+1<y && ground[n][m+1]==1 && !visit[n][m+1]) {
            dfs(n,m+1,x,y);
        }

        if(n+1<x && ground[n+1][m]==1 && !visit[n+1][m]) {
            dfs(n+1,m,x,y);
        }

        if(m-1>=0 && ground[n][m-1]==1 && !visit[n][m-1]) {
            dfs(n,m-1,x,y);
        }

        if(n-1>=0 && ground[n-1][m]==1 && !visit[n-1][m]) {
            dfs(n-1,m,x,y);
        }
    }

}
