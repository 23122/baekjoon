import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        int[] list = new int[10001];
        int   N    = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0 ; i < list.length ; i++) {
            int num = list[i];
            for (int j = 0 ; j < num ; j++){
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
