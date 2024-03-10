import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int   cnt   = Integer.parseInt(br.readLine());
        int[] times = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int result = 0;
        int waitingTime = 0;

        for (int i = 0; i < cnt; i++) {
            waitingTime += times[i];
            result += waitingTime;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}