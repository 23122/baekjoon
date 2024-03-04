import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        bw.write(String.valueOf(h.size()));

        bw.flush();
        bw.close();
    }
}