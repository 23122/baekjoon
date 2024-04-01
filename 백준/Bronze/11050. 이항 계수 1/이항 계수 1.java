import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(factorial(N) / (factorial(N - K) * factorial(K))));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int factorial(int num){
        if(num <= 1){
            return 1;
        }else{
            return num * factorial(num - 1);
        }
    }

}
