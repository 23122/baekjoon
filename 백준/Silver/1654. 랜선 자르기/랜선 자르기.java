import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        int k = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        long[] cables = new long[k];

        long max = 0;
        for(int j = 0; j < k; j++) {
            cables[j] = Long.parseLong(br.readLine());
            max = Math.max(max, cables[j]);
        }

        long left = 1, right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for (long cable : cables) {
                count += cable / mid;
            }

            if (count >= n) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
