import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int j = 5; j <= i; j *= 5) {
            cnt += i / j;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
