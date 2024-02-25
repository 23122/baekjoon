import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int y   = Integer.parseInt(str[0]);
        int x   = Integer.parseInt(str[1]);
        int cnt = 64;

        char[][] input  = new char[y][x];

        for(int i = 0 ; i < y ; i++){
            input[i] = br.readLine().toCharArray();
        }

        for(int n = 0 ; n < y-7 ; n++){
            for(int m = 0 ; m < x-7 ; m++){
                cnt = Math.min(cnt,chk(input,n,m));
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }

    private static int chk(char[][] input, int n, int m) {
        char[][] target = new char[8][8];
        int      result = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        target[i][j] = 'W';
                    } else {
                        target[i][j] = 'B';
                    }
                } else {
                    if (j % 2 == 0) {
                        target[i][j] = 'B';
                    } else {
                        target[i][j] = 'W';
                    }
                }
                if(target[i][j] == input[n+i][m+j]){
                    result++;
                }
            }
        }
        return Math.min(result, 64 - result);
    }
}