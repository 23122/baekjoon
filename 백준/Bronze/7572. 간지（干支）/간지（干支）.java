import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = Integer.parseInt(br.readLine()) + 56;

        bw.write(target % 12 + 'A');
        bw.write(target % 10 + '0');

        br.close();
        bw.flush();
        bw.close();
    }
}

