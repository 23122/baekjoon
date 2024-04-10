import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        for(int i = 0 ; i < N ; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0 ; j < line.length ; j++){
                A[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i = 0 ; i < N ; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0 ; j < line.length ; j++){
                A[i][j] += Integer.parseInt(line[j]);
                bw.write(String.valueOf(A[i][j]));
                if(j < line.length - 1){
                    bw.write(" ");
                }
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}