import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());

        int fibo = 0;
        int arr0[] = new int[41];
        int arr1[] = new int[41];
        arr0[0] = 1;
        arr0[1] = 0;
        arr1[0] = 0;
        arr1[1] = 1;

        for(int i=2; i<=40; i++) {
            arr0[i] = arr0[i-1] + arr0[i-2];
            arr1[i] = arr1[i-1] + arr1[i-2];
        }

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            fibo = Integer.parseInt(st.nextToken());
            bw.write(arr0[fibo] + " " + arr1[fibo]);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

}
