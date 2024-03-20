import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int      i    = Integer.parseInt(line[0]);
        int      j    = Integer.parseInt(line[1]);
        int[]    list = new int[j];
        int      cnt  = 0;

        for(int n = i ; n <= j ; n++){
            if(n > 1){
                boolean flg = true;

                for(int m = 2; m <= Math.sqrt(n) ; m++){
                    if(n % m == 0){
                        flg = false;
                        break;
                    }
                }

                if(flg){
                    list[cnt++] = n;
                }
            }
        }

        for(int num : list){
            if(num != 0){
                bw.write(String.valueOf(num));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
